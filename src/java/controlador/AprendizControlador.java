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
import modeloDAO.AprendizDAO;
import modeloVO.AprendizVO;

/**
 *
 * @author sroja
 */
@WebServlet(name = "AprendizControlador", urlPatterns = {"/Aprendiz"})
public class AprendizControlador extends HttpServlet {

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
        String apId = request.getParameter("textapId");
        String apName = request.getParameter("textapName");
        String apLastName = request.getParameter("textapLastName");
        String apEmail = request.getParameter("textapEmail");
        String apClassNumber = request.getParameter("textapClassNumber");
        String apNIT = request.getParameter("textapNIT");

        AprendizVO  ApVO = new AprendizVO(apId, apName, apLastName,  apClassNumber,apEmail, apNIT);
        AprendizDAO ApDAO = new AprendizDAO(ApVO);

        switch (opcion) {
            case 1://Agregar registro
                if (ApDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El aprendiz se registro con Éxito");
                    request.getRequestDispatcher("provider.jsp").forward(request, response);
                    
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo ser registrado");
                    request.getRequestDispatcher("provider.jsp").forward(request, response);
                }

                break;
            case 2://Actualizar
                if (ApDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usruario se ha actualizado con éxito");
                } else {
                    request.setAttribute("mensajeError", "El usruario no pudo se pudo actualizar");
                }
                request.getRequestDispatcher("Actualizar_Aprendiz.jsp").forward(request, response);
                break;
            case 3: // Consultar
                AprendizVO aprendizVO = AprendizDAO.consultarPorNit(apNIT);
                if (aprendizVO != null) {
                    request.setAttribute("volleno", aprendizVO);
                    request.getRequestDispatcher("Actualizar_Aprendiz.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El Aprendiz NO EXISTE");
                    request.getRequestDispatcher("Consultar_Aprendiz.jsp").forward(request, response);

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
