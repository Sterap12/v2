/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Task.email.email;
import java.io.IOException;
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
import modeloDAO.RolDAO;
import modeloDAO.UsuarioDAO;
import modeloVO.RolVO;
import modeloVO.UsuarioVO;

/**
 *
 * @author Masterr}
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String inEmail = request.getParameter("textinEmail");
        String usuId = request.getParameter("textUsuId");
        String usuLogin = request.getParameter("textUsuLogin");
        String usuPassword = request.getParameter("textUsuPassword");
        String usuTipo = request.getParameter("textUsuTipo");
        String usunumId = request.getParameter("textUsuInstructor");

        UsuarioVO usuVO = new UsuarioVO(usuId, usuLogin, usuPassword, usuTipo, usunumId);
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        RolVO rolvo = new RolVO();
        RolDAO roldao = new RolDAO();
        String mensajeAdmin = "La Usuario con numero <strong>" + usunumId + "</strong>,se ha resgistrado con el nombre de usuario " + usuLogin + " con un rol " + usuTipo;
        String mensajerespuesta = "Su usuario se ha creado, sus datos de logueo corresponden a <br> Nombre de usuario:" + usuLogin + "<br>Contraseña: " + usuPassword;
        email mailEnvio = new email();

        switch (opcion) {
            case 1://Agregar registro
                if (usuDAO.agregarRegistro()) {
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

                        MimeMultipart m = new MimeMultipart();
                        m.addBodyPart(texto);

                        MimeMultipart m2 = new MimeMultipart();
                        m2.addBodyPart(texto2);
                        ///mensaje a los usuarios
                        MimeMessage mensaje = new MimeMessage(s);
                        mensaje.setFrom(new InternetAddress("SINovaRegistro@gmail.com"));
                        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(inEmail));
                        mensaje.setSubject("Contacto de registro en NOVA");
                        mensaje.setContent(m2);
                        //Mensaje a la administración
                        MimeMessage mensaje2 = new MimeMessage(s);
                        mensaje2.setFrom(new InternetAddress("SINovaRegistro@gmail.com"));
                        mensaje2.addRecipient(Message.RecipientType.TO, new InternetAddress("NovaADSena@gmail.com"));
                        mensaje2.setSubject("Contacto de registro en NOVA");
                        mensaje2.setContent(m);

                        Transport t = s.getTransport("smtp");
                        t.connect("SINovaRegistro@gmail.com", "N9V@Gsy/saD0");
                        t.sendMessage(mensaje, mensaje.getAllRecipients());
                        t.close();

                        Transport t1 = s.getTransport("smtp");
                        t1.connect("SINovaRegistro@gmail.com", "N9V@Gsy/saD0");
                        t1.sendMessage(mensaje, mensaje.getAllRecipients());
                        t1.close();


                        request.getRequestDispatcher("Registro_Instructor.jsp").forward(request, response);

                    } catch (Exception e) {
                        request.setAttribute("mensajeError", "Hubo un error en el proceso contactar con la administración");
                        request.getRequestDispatcher("Registrar_Usuario.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo ser registrado");
                    request.getRequestDispatcher("Registrar_Usuario.jsp").forward(request, response);
                }

                break;
            case 2://Actualizar conntraseña
                if (usuDAO.actualizarRegistro()) {
                                        try {
                        Properties p = new Properties();
                        p.put("mail.smtp.host", "smtp.gmail.com");
                        p.setProperty("mail.smtp.starttls.enable", "true");
                        p.setProperty("mail.smtp.port", "587");
                        p.setProperty("mail.smtp.user", "SINovaRegistro@gmail.com");
                        p.setProperty("mail.smtp.auth", "true");

                        Session s = Session.getDefaultInstance(p, null);
                        BodyPart texto = new MimeBodyPart();
                        texto.setText("su contraseña se ha actualizado con éxito, si usted no es el responsable de esta actualización por favor comunicarce con el administrador");


                        MimeMultipart m = new MimeMultipart();
                        m.addBodyPart(texto);

                        ///mensaje a los usuarios
                        MimeMessage mensaje = new MimeMessage(s);
                        mensaje.setFrom(new InternetAddress("SINovaRegistro@gmail.com"));
                        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(inEmail));
                        mensaje.setSubject("Alerta!  NOVA");
                        mensaje.setContent(m);


                        Transport t = s.getTransport("smtp");
                        t.connect("SINovaRegistro@gmail.com", "N9V@Gsy/saD0");
                        t.sendMessage(mensaje, mensaje.getAllRecipients());
                        t.close();


                    request.setAttribute("mensajeExito", "Sus datos fueron enviados a su correo");
                    request.getRequestDispatcher("login.jsp").forward(request, response);

                    } catch (Exception e) {
                        request.setAttribute("mensajeError", "Hubo un error en el proceso contactar con la administración");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo actualizar");
                     request.getRequestDispatcher("login.jsp").forward(request, response);
                }
                
                break;
            case 3: // validar Ingreso

                if (usuDAO.validarIngreso(usuLogin, usuPassword)) {
                    RolVO rolVO = RolDAO.consultarRol(usuLogin);
                    if (rolVO != null) {

                        HttpSession session = request.getSession();
                        session.setAttribute("volleno", rolVO);

                        request.getRequestDispatcher("Home.jsp").forward(request, response);

                    } else {
                        request.setAttribute("mensajeError", "¡El usuario no tiene un rol asignado: !");
                        request.getRequestDispatcher("Login.jsp").forward(request, response);

                    }
                }else {
                        request.setAttribute("mensajeError", "¡El usuario y/o contraseña son incorrectas: !");
                        request.getRequestDispatcher("Login.jsp").forward(request, response);

                    }

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
