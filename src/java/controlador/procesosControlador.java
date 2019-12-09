/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.NovedadesDAO;
import modeloDAO.ProcesoDAO;
import modeloVO.NovedadesVO;
import modeloVO.ProcesoVO;

/**
 *
 * @author Masterr}
 */
@WebServlet(name = "procesosControlador", urlPatterns = {"/procesos"})
public class procesosControlador extends HttpServlet {

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
        String nvId = request.getParameter("textnvId");
        String idpro = request.getParameter("textIDPR");
        String tipo = request.getParameter("texttipo");
        String duracion = request.getParameter("textduracion");
        String radicado = request.getParameter("textradicado");
        String extracion = request.getParameter("textextracion");
        String salon = request.getParameter("textsalon");

        ProcesoVO PrVO = new ProcesoVO(idpro, tipo, duracion, extracion, radicado, salon);
        ProcesoDAO PrDAO = new ProcesoDAO(PrVO);
        NovedadesVO NovVO = new NovedadesVO(nvId);
        NovedadesDAO novedadesDAO = new NovedadesDAO(NovVO);

        switch (opcion) {
            case 1://Agregar registro
                if (PrDAO.agregarRegistro()) {
                    if (novedadesDAO.AgregarProcesos()) {
                        request.setAttribute("mensajeExito", "El proceso se registro con Éxito");
                        request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("mensajeError", "El proceso no pudo ser registrado");

                }

                break;
            case 2://Actualizar
                if (novedadesDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usruario se ha actualizado con éxito");
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo actualizar");
                }
                request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);
                break;

            case 3:
                String NvVO = nvId;
                String salom = salon;
                if (NvVO != null) {
                    request.setAttribute("volleno", NvVO);
                    request.setAttribute("sllleno", salom);
                    request.getRequestDispatcher("procesos.jsp").forward(request, response);

                } else {
                    request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);

                }
                break;
            case 4: //Eliminar
                if (PrDAO.agregarproceso()) {
                    request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);

                } else {
                    request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);

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
