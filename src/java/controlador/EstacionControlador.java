package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.EstacionDAO;
import modeloVO.EstacionVO;

/**
 *
 * @author SEVEN
 */
@WebServlet(name = "EstacionControlador", urlPatterns = {"/Estacion"})
public class EstacionControlador extends HttpServlet {

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
        String type = request.getParameter("textintype");
        String quantity_Sta = request.getParameter("textquantity_Sta");
        String Id_Cla = request.getParameter("textId_Cla");
        String id_inv = request.getParameter("textid_inv");
        String object_Sta = request.getParameter("textobject_Sta");

        EstacionVO EsVO = new EstacionVO(apId, type, quantity_Sta, Id_Cla, id_inv, object_Sta);
        EstacionDAO EsDAO = new EstacionDAO(EsVO);

        switch (opcion) {
            case 1://Agregar registro
                if (EsDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "La estacion se registro con Éxito");
                    request.getRequestDispatcher("Registro_Estacion.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "La estacion no pudo ser registrado");
                    request.getRequestDispatcher("Registro_Estacion.jsp").forward(request, response);
                }

                break;
            case 2://Actualizar
                if (EsDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usruario se ha actualizado con éxito");
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo actualizar");
                }
                request.getRequestDispatcher("Actualizar_Estacion.jsp").forward(request, response);
                break;
            case 3: // Consultar
                EstacionVO consultavo = EstacionDAO.consultarPorid(apId);
                if (consultavo != null) {
                    request.setAttribute("volleno", consultavo);
                    request.getRequestDispatcher("Actualizar_Estacion.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "La Estacion NO EXISTE");
                    request.getRequestDispatcher("Consultar_Estacion.jsp").forward(request, response);
                }
            case 4://Actualizar
                if (EsDAO.eliminarRegistro()) {
                    request.setAttribute("mensajeExito", "El usruario se ha eliminado con éxito");
                    request.getRequestDispatcher("Consultar_Estacion.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo eliminar");
                    request.getRequestDispatcher("Actualizar_Estacion.jsp").forward(request, response);

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
