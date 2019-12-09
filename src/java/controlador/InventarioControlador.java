package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.InventarioDAO;
import modeloVO.InventarioVO;

@WebServlet(name = "InventarioControlador", urlPatterns = {"/Inventario"})
public class InventarioControlador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String invId = request.getParameter("textinvId");
        String invType = request.getParameter("textinvType");
        String invName = request.getParameter("textinvName");
        String serial = request.getParameter("textserial");
        String identificador = request.getParameter("textidentificador");
        String modelo = request.getParameter("textmodelo");
        String salon = request.getParameter("textsalon");

        InventarioVO invVO = new InventarioVO(invId, invType, invName, serial, identificador, modelo, salon);
        InventarioDAO invDAO = new InventarioDAO(invVO);

        switch (opcion) {
            case 1:
                if (invDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El inventario se registró correctamente!");
                    request.getRequestDispatcher("registrar_inventario.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El inventario no pudo ser registrado correctamente!");
                    request.getRequestDispatcher("registrar_inventario.jsp").forward(request, response);
                }

                break;
            case 2:
                if (invDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "¡la descripcion se actualizó correctamente!");
                } else {
                    request.setAttribute("mensajeError", "¡la descripcion no pude ser actualizado correctamente!");
                }
                request.getRequestDispatcher("actualizar_inv.jsp").forward(request, response);
                break;
            case 3://consultar 
                InventarioVO InventarioVO = InventarioDAO.consultarPorNombre(invName);
                if (InventarioVO != null) {
                    request.setAttribute("voLLeno", InventarioVO);
                    request.getRequestDispatcher("actualizar_inv.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "¡La descripcion no existe:");
                    request.getRequestDispatcher("consultar_inventario.jsp").forward(request, response);
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
