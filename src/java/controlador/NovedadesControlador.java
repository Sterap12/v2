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
import javax.servlet.http.HttpSession;
import modeloDAO.NovedadesDAO;
import modeloDAO.UsuarioDAO;
import modeloVO.NovedadesVO;
import modeloVO.UsuarioVO;

/**
 *
 * @author Masterr}
 */
@WebServlet(name = "NovedadesControlador", urlPatterns = {"/Novedades"})
public class NovedadesControlador extends HttpServlet {

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
        String usunvId = request.getParameter("textnvId");
        String usuDescri = request.getParameter("textUsuDescri");
        String usuType = request.getParameter("textUsuType");
        String usuFecha = request.getParameter("textUsuFecha");
        String usuEntrada = request.getParameter("textUsuEntrada");
        String usuSalida = request.getParameter("textUsuSalida");
        String usuSalon = request.getParameter("textUsuSalon");
        String usuInstructor = request.getParameter("textUsuInstructor");
        String usuAprendiz = request.getParameter("textUsuAprendiz");
        

        NovedadesVO NovVO = new NovedadesVO(usunvId, usuDescri, usuType, usuFecha, usuEntrada, usuSalida, usuSalon, usuInstructor, usuAprendiz, usuAprendiz);
        NovedadesDAO novedadesDAO = new NovedadesDAO(NovVO);

        switch (opcion) {
            case 1://Agregar registro
                if (novedadesDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "La novedad se ha registrado");
                    request.getRequestDispatcher("Consultar_novedad.jsp").forward(request, response);
                    
                } else {
                    request.setAttribute("mensajeError", "La novedad no pudo ser registrado");
                    request.getRequestDispatcher("novedades.jsp").forward(request, response);
                }

                break;
           
            /*  case 3: // validar Ingreso

                if (novedadesDAO.validarIngreso(usuLogin, usuPassword)) {

                    HttpSession miSesesion = request.getSession(true);
                    UsuarioVO usuarioVO = new UsuarioVO(usuId, usuLogin, usuPassword);
                    miSesesion.setAttribute("volleno", usuarioVO);

                    request.getRequestDispatcher("Home.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "¡El usuario y/o contraseña son incorrectas: !");
                    request.getRequestDispatcher("index.jsp").forward(request, response);

                }*/
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
