package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.RolVO;
import modeloVO.UsuarioVO;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    HttpSession miSesion = (HttpSession) request.getSession();
    RolVO rol = (RolVO) miSesion.getAttribute("volleno");

    if (rol == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }


      out.write("\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"../assets/icons/logosignac.png\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/material-design-iconic-font.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/normalize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/sweet-alert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"js/modernizr.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b7a56eba44.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flexslider.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar-lateral full-reset\" style=\"background-color:#2B3D51;color:#fff;\">\n");
      out.write("            <div class=\"logosignac full-reset all-tittles\">\n");
      out.write("                <i class=\"visible-xs zmdi zmdi-close pull-left mobile-menu-button\" style=\"line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px; \"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"full-reset\" style=\"background-color:#2B3D51; padding: 10px 0; color:#fff;\">\n");
      out.write("                <center><figure>\n");
      out.write("                        <img src=\"assets/img/definitivologo.png\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:100%; height: 50%;\">\n");
      out.write("                    </figure></center>\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 16px; font-family: PetitaBold; font-size: 20px;\">Sistema Novedades</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"full-reset nav-lateral-list-menu\">\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled\">");
 if (rol.getRolID().equals("1")) {

                    
      out.write("\n");
      out.write("                     <li><a href=\"Home.jsp\"><i class=\"fas fa-home\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"novedades.jsp\"><i class=\"fas fa-newspaper\"></i>&nbsp;&nbsp; Novedad</a></li>\n");
      out.write("                    \n");
      out.write("                 <li><a href=\"registrar_inventario.jsp\"><i class=\"fas fa-clipboard-list\"></i>&nbsp;&nbsp; Inventario</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"Registro_Estacion.jsp\"><i class=\"fas fa-laptop\"></i> </i>&nbsp;&nbsp; Estación </a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"registrar_descripcion.jsp\"><i class=\"far fa-clipboard\"></i></i>&nbsp;&nbsp; Descripción</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Listado_procesos.jsp\"><i class=\"fas fa-exchange-alt\"></i>&nbsp;&nbsp;Proceso </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
} else if (rol.getRolID().equals("2")) {
      out.write(" <li><a href=\"Home.jsp\"><i class=\"fas fa-home\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"novedades.jsp\"><i class=\"fas fa-newspaper\"></i>&nbsp;&nbsp; Novedad</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                   <li><a href=\"registrar_descripcion.jsp\"><i class=\"far fa-clipboard\"></i></i>&nbsp;&nbsp; Descripción</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                   <li>\n");
      out.write("                        <a href=\"Listado_procesos.jsp\"><i class=\"fas fa-exchange-alt\"></i>&nbsp;&nbsp;Proceso </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    ");
} else if (rol.getRolID().equals("3")) {
      out.write("                  \n");
      out.write("                    <li><a href=\"Home.jsp\"><i class=\"fas fa-home\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("\n");
      out.write("         <form name=\"reporte\" action=\"/nova/pdf\"> \n");
      out.write("             <input type=\"submit\" value=\"\" class=\"botones\" name=\"btnver\"/>\n");
      out.write("        </form>\n");
      out.write("        <form name=\"reporte\" action=\"/nova/classroomPDF\"> \n");
      out.write("            <li> <input type=\"submit\" value=\"Visualizar salones\" style=\"\" name=\"btnver1\"/> </li>\n");
      out.write("        </form>\n");
      out.write("        <form name=\"reporte\" action=\"/nova/descriptionPDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar descripciones\" name=\"btnver2\"/>\n");
      out.write("        </form>\n");
      out.write("         <form name=\"reporte\" action=\"/nova/inventoryPDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar inventario\" name=\"btnver3\"/>\n");
      out.write("        </form>\n");
      out.write("         <form name=\"reporte\" action=\"/nova/prenticePDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar Aprendiz\" name=\"btnverr\"/>\n");
      out.write("        </form>\n");
      out.write("         <form name=\"reporte\" action=\"/nova/newsPDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar Novedades\" name=\"btnverrr\"/>\n");
      out.write("        </form>\n");
      out.write("        <form name=\"reporte\" action=\"/nova/stationPDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar estaciones\" name=\"btnverrrr\"/>\n");
      out.write("        </form>\n");
      out.write("        <form name=\"reporte\" action=\"/nova/processsPDF\"> \n");
      out.write("            <input type=\"submit\" value=\"Visualizar procesos\" name=\"btnverrer\"/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Registro_Instructor.jsp\"><i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i>&nbsp;&nbsp;Usuarios </a>\n");
      out.write("\n");
      out.write("                    </li> \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content-page-container full-reset custom-scroll-containers\">\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <nav class=\"navbar-user-top full-reset\">\n");
      out.write("                    <ul class=\"list-unstyled full-reset\">\n");
      out.write("                        <figure>\n");
      out.write("                            <img src=\"assets/img/user01.png\" alt=\"user-picture\" class=\"img-responsive img-circle center-box\">\n");
      out.write("                        </figure>\n");
      out.write("                        <li style=\"color:#fff; cursor:default;\">\n");
      out.write("                            <span class=\"all-tittles\">");
      out.print(rol.getUsuID());
      out.write("</span>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            out.println("<li class='tooltips-general exit-system-button' data-placement='bottom' title='Cerrar Sesion' >"
                                    + "<a href='CerrarSession' class='zmdi zmdi-power'></a></li>");

                        
      out.write("\n");
      out.write("\n");
      out.write("                        <li  class=\"tooltips-general search-book-button\" data-href=\"searchbook.html\" data-placement=\"bottom\" title=\"Buscar\">\n");
      out.write("                            <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li  class=\"tooltips-general btn-help\" data-placement=\"bottom\" title=\"Ayuda\">\n");
      out.write("                            <i class=\"zmdi zmdi-help-outline zmdi-hc-fw\"></i>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"mobile-menu-button visible-xs\" style=\"float: left !important;\">\n");
      out.write("                            <i class=\"zmdi zmdi-menu\"></i>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"container-flat-form\" >\n");
      out.write("                        <div class=\"flexslider\">\n");
      out.write("                            <ul class=\"slides\">\n");
      out.write("                                <li>\n");
      out.write("                                    <img src=\"assets/img/1.png\">\t\n");
      out.write("                                    <section class=\"flex-caption\"></section>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <img src=\"assets/img/2.png\">\t\n");
      out.write("                                    <section class=\"flex-caption\"></section>\t\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <img src=\"assets/img/3.png\">\t\n");
      out.write("                                    <section class=\"flex-caption\"></section>\t\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>        \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
