package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modeloVO.NovedadesVO;
import modeloVO.ProcesoVO;
import modeloVO.RolVO;
import modeloVO.UsuarioVO;

public final class procesos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

  HttpSession miSesion = (HttpSession) request.getSession();
    RolVO rol = (RolVO) miSesion.getAttribute("volleno");

    if (rol == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Proceso</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"../assets/icons/logosignac.png\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/jquery.mCustomScrollbar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/estilotabla.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("                    <li><a href=\"Home.jsp\"><i class=\"fas fa-home\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"novedades.jsp\"><i class=\"fas fa-newspaper\"></i>&nbsp;&nbsp; Novedad</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"registrar_inventario.jsp\"><i class=\"fas fa-clipboard-list\"></i>&nbsp;&nbsp; Inventario</a></li>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <li><a href=\"Registro_Estacion.jsp\"><i class=\"fas fa-laptop\"></i> </i>&nbsp;&nbsp; Estación </a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"#\"><i class=\"zmdi zmdi-book zmdi-hc-fw\"></i>&nbsp;&nbsp; Reportes Salones</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"#\"><i class=\"zmdi zmdi-balance zmdi-hc-fw\"></i>&nbsp;&nbsp; Reportes Estación </a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"#\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Reporte Novedades</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li><a href=\"#\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Reporte Inventario</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\"><i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i>&nbsp;&nbsp; Reporte Proceso </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Registro_Instructor.jsp\"><i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i>&nbsp;&nbsp;Usuarios </a>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content-page-container full-reset custom-scroll-containers\">\n");
      out.write("            <nav class=\"navbar-user-top full-reset\">\n");
      out.write("                <ul class=\"list-unstyled full-reset\">\n");
      out.write("                    <figure>\n");
      out.write("                        <img src=\"assets/img/user01.png\" alt=\"user-picture\" class=\"img-responsive img-circle center-box\">\n");
      out.write("                    </figure>\n");
      out.write("                    <li style=\"color:#fff; cursor:default;\">\n");
      out.write("                        <span class=\"all-tittles\">");
      out.print(rol.getUsuID());
      out.write("</span>\n");
      out.write("                    </li>\n");
      out.write("                    ");

                        out.println("<li class='tooltips-general exit-system-button' data-placement='bottom' title='Cerrar Sesion' >"
                                + "<a href='CerrarSession' class='zmdi zmdi-power'></a></li>");

                    
      out.write("\n");
      out.write("                    <li  class=\"tooltips-general search-book-button\" data-href=\"searchbook.html\" data-placement=\"bottom\" title=\"Buscar libro\">\n");
      out.write("                        <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                    </li>\n");
      out.write("                    <li  class=\"tooltips-general btn-help\" data-placement=\"bottom\" title=\"Ayuda\">\n");
      out.write("                        <i class=\"zmdi zmdi-help-outline zmdi-hc-fw\"></i>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"mobile-menu-button visible-xs\" style=\"float: left !important;\">\n");
      out.write("                        <i class=\"zmdi zmdi-menu\"></i>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    <h1 class=\"all-tittles\">Sistema Nova <small> Administración Procesos</small></h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"nav nav-tabs nav-justified\"  style=\"font-size: 17px;\">\n");
      out.write("                    <li role=\"procesos\" class=\"active\"><a href=\"procesos.jsp\">Procesos</a></li>\n");
      out.write("                    <li role=\"ConsultarProcesos\" ><a href=\"Listado_procesos.jsp\">Consultar</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\"  style=\"margin: 50px 0;\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                        <img src=\"assets/img/user04.png\" alt=\"user\" class=\"img-responsive center-box\" style=\"max-width: 110px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-8 col-md-8 text-justify lead\">\n");
      out.write("                        Bienvenido a la sección para registrar un nuevo proceso, debes de llenar todos los campos del siguiente formulario para poder registrar un proceso\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 lead\">\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"active\">Nuevo Proceso</li>\n");
      out.write("                            <li><a href=\"listprovider.html\">Listado de Procesos</a></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"container-flat-form\" >\n");
      out.write("                    <div class=\"title-flat-form title-flat-blue\">Agregar un nuevo Proceso</div>\n");
      out.write("                    <form autocomplete=\"off\" method=\"post\" action=\"procesos\">\n");
      out.write("                        ");

                           NovedadesVO NvVO = (NovedadesVO)request.getAttribute("volleno");
                          
                            if (NvVO != null) {


                        
      out.write(" \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12 col-sm-8 col-sm-offset-2\">\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <h4># Novedad</h4>\n");
      out.write("                                    <input type=\"number\" class=\"material-control tooltips-general\" placeholder=\"# novedad\" required=\"\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Falta agregar hora de extración\" name=\"textnvId\" readonly=\"readonly\" value=\"");
      out.print(NvVO.getNvid());
      out.write("\" autofocus>\n");
      out.write("                                    <span class=\"highlight\"></span>\n");
      out.write("                                    <span class=\"bar\"></span>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <h4>Tipo de proceso</h4>\n");
      out.write("                                    <select type=\"text\" class=\"material-control tooltips-general\" placeholder=\"Nombre de Instructor\" required=\"\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe el nombre del aprendiz\" name=\"texttipo\">\n");
      out.write("                                    <span class=\"highlight\"></span>\n");
      out.write("                                    <span class=\"bar\"></span>\n");
      out.write("                                    \n");
      out.write("                                    <option value=\"Daño\">Daño</option>\n");
      out.write("                                    <option value=\"Matenimiento\">Matenimiento</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <input type=\"time\" class=\"material-control tooltips-general\" placeholder=\"hora de Estración\" required=\"\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Falta agregar hora de extración\" name=\"textduracion\">\n");
      out.write("                                    <span class=\"highlight\"></span>\n");
      out.write("                                    <span class=\"bar\"></span>\n");
      out.write("                                    <label>Hora salida</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <input type=\"text\" class=\"material-control tooltips-general\" placeholder=\"Radicado del proceso\" required=\"\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Falta agregar radicado del proceso\" name=\"textradicado\">\n");
      out.write("                                    <span class=\"highlight\"></span>\n");
      out.write("                                    <span class=\"bar\"></span>\n");
      out.write("                                    <label>Radicado</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <h4>Salón</h4>\n");
      out.write("                                    <input type=\"number\" class=\"material-control tooltips-general\" placeholder=\"numero de salon\" required=\"\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Falta agregar el salón\" readonly=\"readonly\" name=\"textsalon\" value=\"");
      out.print(NvVO.getUsuSalon());
      out.write("\">\n");
      out.write("                                    <span class=\"highlight\"></span>\n");
      out.write("                                    <span class=\"bar\"></span>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <p class=\"text-center\">\n");
      out.write("                                    <button type=\"reset\" class=\"btn btn-info\" style=\"margin-right: 20px;\"><i class=\"zmdi zmdi-roller\"></i> &nbsp;&nbsp; Limpiar</button>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\"><i class=\"zmdi zmdi-floppy\"></i> &nbsp;&nbsp; Guardar</button>\n");
      out.write("                                    <input type=\"hidden\" name=\"opcion\" value=\"1\">\n");
      out.write("                                </p> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <center>\n");
      out.write("                        <div style=\"color: red;\">\n");
      out.write("                            ");
 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                            ");
} else if (request.getAttribute("mensajeExito") != null) {
      out.write("\n");
      out.write("                            <div style=\"color: green;\">\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
