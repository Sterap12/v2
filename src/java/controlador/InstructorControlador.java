package controlador;

import java.io.IOException;
import Task.email.email;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modeloDAO.InstructorDAO;
import modeloVO.AprendizVO;
import modeloVO.InstructorVO;

/**
 *
 * @author Masterr}
 */
@WebServlet(name = "InstructorControlador", urlPatterns = {"/Instructor"})
public class InstructorControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String apId = request.getParameter("textId");
        String apName = request.getParameter("textinName");
        String apLastName = request.getParameter("textinLastName");
        String inTypeDoc = request.getParameter("textinTypeDoc");
        String inNumber = request.getParameter("textinNumber");
        String inSpeciality = request.getParameter("textinSpeciality");
        String inEge = request.getParameter("textinEge");
        String inGender = request.getParameter("textinGender");
        String inEmail = request.getParameter("textinEmail");

        InstructorVO InVO = new InstructorVO(apId, apName, apLastName, inTypeDoc, inNumber, inSpeciality, inEge, inGender, inEmail);
        InstructorDAO InDAO = new InstructorDAO(InVO);
        String mensajerespuesta = "Su usuario esta siendo creado en breve nos pondremos en contacto";
        String mensajeAdmin = "el instructor <strong>" + apName + apLastName + "</strong> identificado con cedula de ciudadania <strong>" + inNumber + "</strong> solicita creación de usuario para ingresar al sotfware <strong>NOVA</strong> con un correo institucional " + inEmail;
        email mailEnvio = new email();

        switch (opcion) {
            case 1://Agregar registro
                if (InDAO.agregarRegistro()) {
                    try {
                        Properties p = new Properties();
                        p.put("mail.smtp.host", "smtp.gmail.com");
                        p.setProperty("mail.smtp.starttls.enable", "true");
                        p.setProperty("mail.smtp.port", "587");
                        p.setProperty("mail.smtp.user", "SINovaRegistro@gmail.com");
                        p.setProperty("mail.smtp.auth", "true");

                        Session s = Session.getDefaultInstance(p, null);
                        BodyPart texto = new MimeBodyPart();
                        texto.setText(mensajeAdmin);
                        BodyPart texto2 = new MimeBodyPart();
                        texto2.setText(mensajerespuesta);
                        
                        MimeMultipart m=new MimeMultipart();
                        m.addBodyPart(texto);
                        
                        MimeMultipart m2=new MimeMultipart();
                        m2.addBodyPart(texto2);
                        ///mensaje a los usuarios
                        MimeMessage mensaje = new MimeMessage(s);
                        mensaje.setFrom(new InternetAddress("SINovaRegistro@gmail.com"));
                        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(inEmail) );
                        mensaje.setSubject("Contacto de registro en NOVA");
                        mensaje.setContent(m2);
                        //Mensaje a la administración
                        MimeMessage mensaje2 = new MimeMessage(s);
                        mensaje2.setFrom(new InternetAddress("SINovaRegistro@gmail.com"));
                        mensaje2.addRecipient(Message.RecipientType.TO, new InternetAddress("NovaADSena@gmail.com") );
                        mensaje2.setSubject("Contacto de registro en NOVA");
                        mensaje2.setContent(m);
                        
                        Transport t=s.getTransport("smtp");
                        t.connect("SINovaRegistro@gmail.com","N9V@Gsy/saD0");
                        t.sendMessage(mensaje, mensaje.getAllRecipients());
                        t.close();
                        
                        Transport t1=s.getTransport("smtp");
                        t1.connect("SINovaRegistro@gmail.com","N9V@Gsy/saD0");
                        t1.sendMessage(mensaje2, mensaje2.getAllRecipients());
                        t1.close(); 
                        
                        request.getRequestDispatcher("Registrar_Usuario.jsp").forward(request, response);

                    } catch (Exception e) {
                        request.setAttribute("mensajeError", "El usruario no pudo ser registrado <br>"+"ponerse en contato con el administrador");
                        request.getRequestDispatcher("Registro_Instructor.jsp").forward(request, response);
                    }

                   
                    

                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo ser registrado");
                    request.getRequestDispatcher("Registro_Instructor.jsp").forward(request, response);
                }

                break;
            case 2://Actualizar
                if (InDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usruario se ha actualizado con éxito");
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo actualizar");
                }
                request.getRequestDispatcher("newhtml.html").forward(request, response);
                break;
            case 3:
                InstructorVO InstrucVo = InDAO.consultarcorreo(inEmail);
                if (InstrucVo != null){
                    request.setAttribute("volleno", InstrucVo);
                    request.getRequestDispatcher("ActualizarContra.jsp").forward(request, response);
                }else {
                    request.getRequestDispatcher("recovery.jsp").forward(request, response);
                    request.setAttribute("mensajeError", "este correo no se encuentra registrado <br>"+"en nuetro sistema");
                }
                break;

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}