package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.DescripcionDAO;
import modeloVO.DescripcionVO;

@WebServlet(name = "DescripcionControlador", urlPatterns = {"/Descripcion"})
public class DescripcionControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String desId = request.getParameter("textdesId");
        String desReason = request.getParameter("textdesReason");
        String desIdPro = request.getParameter("textdesIdPro");
        String desDate = request.getParameter("textdesDate");
   

        DescripcionVO desVO = new DescripcionVO(desId, desReason,desIdPro, desDate);
        DescripcionDAO desDAO = new DescripcionDAO(desVO);

        switch (opcion) {
            case 1:
                if (desDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "¡la descripcion se registró correctamente!");
                    request.getRequestDispatcher("registrar_descripcion.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "¡la descripcion no pudo ser registrado correctamente!");
                    request.getRequestDispatcher("registrar_descripcion.jsp").forward(request, response);
                }
                
                break;
            case 2:
                if (desDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "¡la descripcion se actualizó correctamente!");
                } else {
                    request.setAttribute("mensajeError", "¡la descripcion no pude ser actualizado correctamente!");
                }
                request.getRequestDispatcher("actualizar_desc.jsp").forward(request, response);
                break;
            case 3://consultar 
                DescripcionVO DescripcionVO = DescripcionDAO.consultarPorFecha(desDate);
                if (DescripcionVO != null) {
                    request.setAttribute("voLLeno", DescripcionVO);
                    request.getRequestDispatcher("actualizar_desc.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "¡La descripcion no existe:");
                    request.getRequestDispatcher("consultar_descripcion.jsp").forward(request, response);
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
