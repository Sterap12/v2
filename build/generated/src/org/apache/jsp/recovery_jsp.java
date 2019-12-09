package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.UsuarioVO;

public final class recovery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

    HttpSession miSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("volleno");


      out.write("\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">\n");
      out.write("       <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            var expr = /^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9\\-]+\\.[a-zA-Z0-9\\-\\.]+$/;\n");
      out.write("            var expr2 = /^1[8-9]|[2-5]\\d|60$/;\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#bEnviar\").click(function () {\n");
      out.write("                    var correo = $(\"#itMail\").val();\n");
      out.write("                    var asunto = $(\"#itAsunto\").val();\n");
      out.write("\n");
      out.write("                    if (correo != \"Nombres\" && asunto != \"Contraseña\") {\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $(\"log\").click(function (evento) {\n");
      out.write("\n");
      out.write("                            })\n");
      out.write("                        })\n");
      out.write("                    } else {\n");
      out.write("                        $(\"#mensaje1\").fadeOut();\n");
      out.write("\n");
      out.write("                        if (correo != \"Nombres\") {\n");
      out.write("                            $(\"#mensaje2\").fadeIn(\"slow\");\n");
      out.write("                            return false;\n");
      out.write("                        } else {\n");
      out.write("                            $(\"#mensaje2\").fadeOut();\n");
      out.write("\n");
      out.write("                            if (asunto == \"\") {\n");
      out.write("                                $(\"#mensaje3\").fadeIn(\"slow\");\n");
      out.write("                                return false;\n");
      out.write("                            } else {\n");
      out.write("                                $(\"#mensaje3\").fadeOut();\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("        <figure><img src=\"assets/img/logoblanco.png\" ></figure>    \n");
      out.write("        \n");
      out.write("        </header> \n");
      out.write("         <input id=\"boton1\"  value=\"INICIAR SESIÓN\" type=\"submit\" onclick=\"location.href='Login.jsp'\">\n");
      out.write("     \n");
      out.write("             <input id=\"boton2\" value=\"SOPORTE\" type=\"submit\" onclick=\"location.href='#'\" >\n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div id=\"contenedor\" >\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <form class=\"form-container\" method=\"post\" action=\"Instructor\">\n");
      out.write("                <figure><img src=\"assets/img/novaespiral2.png\"></figure>    \n");
      out.write("                <div class=\"group-material-login\">\n");
      out.write("                    <input style=\"color:#f5f9f0\" type=\"text\" class=\"material-login-control\" required=\"\" maxlength=\"70\" name=\"textinEmail\" id=\"itMail\">\n");
      out.write("                    <span class=\"highlight-login\"></span>\n");
      out.write("                    <span class=\"bar-login\"></span>\n");
      out.write("                    <label><i class=\"zmdi zmdi-account\"></i> &nbsp; Correo</label>\n");
      out.write("                </div><br>\n");
      out.write("                \n");
      out.write("                <center>\n");
      out.write("                    <button type=\"submit\" face=\"monotype corsivas\" id=\"bEnviar\" value=\"Login\" class=\"boton\">Login</button>\n");
      out.write("                    <input id=\"log\" type=\"hidden\" name=\"opcion\" value=\"3\">\n");
      out.write("                </center>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"mensaje4\">\n");
      out.write("\n");
      out.write("            ");
 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("            \n");
      out.write("            ");

                
         if (request.getParameter("cerrar")!=null) {
             miSesion.invalidate();
         }
            
      out.write("\n");
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
      out.write("            </footer>               \n");
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
