package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        \n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <link href=\"css/inicio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/flexslider2.css\">\n");
      out.write("       <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b7a56eba44.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <figure><img src=\"assets/img/logoblanco.png\"></figure>    \n");
      out.write("        \n");
      out.write("        </header> \n");
      out.write("            \n");
      out.write("        <input id=\"boton1\"  value=\"INICIAR SESIÓN\" type=\"submit\" onclick=\"location.href='Login.jsp'\">\n");
      out.write("     \n");
      out.write("             <input id=\"boton2\" value=\"SOPORTE\" type=\"submit\" onclick=\"location.href='#'\" >\n");
      out.write("             \n");
      out.write("              <div class=\"container-fluid\">\n");
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
      out.write("               \n");
      out.write("     <footer class=\"footer full-reset\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                            <h4 class=\"all-tittles\">Acerca de Nosotros</h4>\n");
      out.write("                            <p>\n");
      out.write("                             NOVA es un sistema de novedades para las aulas de clase del sena\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-12 col-sm-6\">\n");
      out.write("                            <h4 class=\"all-tittles\">Desarrolladores</h4>\n");
      out.write("                            <ul class=\"list-unstyled\">\n");
      out.write("                                <li><i class=\"zmdi zmdi-check zmdi-hc-fw\"></i>&nbsp; Sthewart Rojano - Andres Pinchao - Andres Hurtado <i class=\"zmdi zmdi-facebook zmdi-hc-fw footer-social\"></i><i class=\"zmdi zmdi-twitter zmdi-hc-fw footer-social\"></i></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-copyright full-reset all-tittles\">© 2019 SAA</div>\n");
      out.write("            </footer>                \n");
      out.write("     \n");
      out.write("    </body>\n");
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
