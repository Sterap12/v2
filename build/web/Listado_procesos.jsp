<%-- 
    Document   : Listado_procesos
    Created on : 19/09/2019, 02:29:14 PM
    Author     : APRENDIZ
--%>

<%@page import="modeloVO.RolVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.ProcesoDAO"%>
<%@page import="modeloVO.ProcesoVO"%>
<%@page import="modeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession miSesion = (HttpSession) request.getSession();
    RolVO rol = (RolVO) miSesion.getAttribute("volleno");

    if (rol == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
%>
<html>
    <head>
        <title>Proceso</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/tablaaa.css" rel="stylesheet" type="text/css"/>
        <link rel="Shortcut Icon" type="image/x-icon" href="../assets/icons/logosignac.png" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery.mCustomScrollbar.css" rel="stylesheet" type="text/css"/>
        <link href="css/material-design-iconic-font.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/style_1.css" rel="stylesheet" type="text/css"/>
        <link href="css/sweet-alert.css" rel="stylesheet" type="text/css"/>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
        <script src="js/modernizr.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://kit.fontawesome.com/b7a56eba44.js" crossorigin="anonymous"></script>

    </head>
    <body>
        <div class="navbar-lateral full-reset" style="background-color:#2B3D51;color:#fff;">
            <div class="logosignac full-reset all-tittles">
                <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px; "></i>
            </div>
            <div class="full-reset" style="background-color:#2B3D51; padding: 10px 0; color:#fff;">
                 <figure>
                        <img src="assets/img/nova.png" alt="Biblioteca" style="margin-left: -5px;">
                    </figure>
                <p class="text-center" style="padding-top: 16px; font-family: PetitaBold; font-size: 20px;">Sistema Novedades</p>
            </div>
            <div class="full-reset nav-lateral-list-menu">

                <ul class="list-unstyled"><% if (rol.getRolID().equals("1")) {

                    %>
                    <li><a href="Home.jsp"><i class="fas fa-home"></i>&nbsp;&nbsp; Inicio</a></li>



                    <li><a href="novedades.jsp"><i class="fas fa-newspaper"></i>&nbsp;&nbsp; Novedad</a></li>

                    <li><a href="registrar_inventario.jsp"><i class="fas fa-clipboard-list"></i>&nbsp;&nbsp; Inventario</a></li>


                    <li><a href="Registro_Estacion.jsp"><i class="fas fa-laptop"></i> </i>&nbsp;&nbsp; Estación </a></li>


                    <li><a href="registrar_descripcion.jsp"><i class="far fa-clipboard"></i></i>&nbsp;&nbsp; Descripción</a></li>


                    <li>
                        <a href="Listado_procesos.jsp"><i class="fas fa-exchange-alt"></i>&nbsp;&nbsp;Proceso </a>

                    </li>





                    <%} else if (rol.getRolID().equals("2")) {%> <li><a href="Home.jsp"><i class="fas fa-home"></i>&nbsp;&nbsp; Inicio</a></li>



                    <li><a href="novedades.jsp"><i class="fas fa-newspaper"></i>&nbsp;&nbsp; Novedad</a></li>


                    <li><a href="registrar_descripcion.jsp"><i class="far fa-clipboard"></i></i>&nbsp;&nbsp; Descripción</a></li>


                    <li>
                        <a href="Listado_procesos.jsp"><i class="fas fa-exchange-alt"></i>&nbsp;&nbsp;Proceso </a>

                    </li>

                    <%} else if (rol.getRolID().equals("3")) {%>                  
                    <li><a href="Home.jsp"><i class="fas fa-home"></i>&nbsp;&nbsp; Inicio</a></li>



                    <form name="reporte" action="/Reporte/pdf"> 
                        <input type="submit" value="Visualizar Pdf" name="btnver"/>
                    </form>
                    <form name="reporte" action="/Reporte/classroomPDF"> 
                        <li>  <input type="submit" value="Visualizar salones" name="btnver1"/></li>
                    </form>
                    <form name="reporte" action="/Reporte/descriptionPDF"> 
                        <input type="submit" value="Visualizar descripciones" name="btnver2"/>
                    </form>
                    <form name="reporte" action="/Reporte/inventoryPDF"> 
                        <input type="submit" value="Visualizar inventario" name="btnver3"/>
                    </form>
                    <form name="reporte" action="/Reporte/prenticePDF"> 
                        <input type="submit" value="Visualizar Aprendiz" name="btnverr"/>
                    </form>
                    <form name="reporte" action="/Reporte/newsPDF"> 
                        <input type="submit" value="Visualizar Novedades" name="btnverrr"/>
                    </form>
                    <form name="reporte" action="/Reporte/stationPDF"> 
                        <input type="submit" value="Visualizar estaciones" name="btnverrrr"/>
                    </form>
                    <form name="reporte" action="/Reporte/processsPDF"> 
                        <input type="submit" value="Visualizar procesos" name="btnverrer"/>
                    </form>




                    <li>
                        <a href="Registro_Instructor.jsp"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp;Usuarios </a>

                    </li>
                    <%}%>



            </div>
        </div>


        <div class="content-page-container full-reset custom-scroll-containers">
            <nav class="navbar-user-top full-reset">
                <ul class="list-unstyled full-reset">
                    <figure>
                        <img src="assets/img/user01.png" alt="user-picture" class="img-responsive img-circle center-box">
                    </figure>
                    <li style="color:#fff; cursor:default;">
                        <span class="all-tittles"><%=rol.getUsuID()%></span>
                    </li>
                     <%
                            out.println("<li class='tooltips-general exit-system-button' data-placement='bottom' title='Cerrar Sesion' >"
                                    + "<a href='CerrarSession' class='fas fa-power-off'></a></li>");

                        %>

                        
                        <li  class="tooltips-general btn-help" data-placement="bottom" title="Soporte" onclick="location.href='assets/manual/manualinteractivo.html'">
                            <i class="zmdi zmdi-help-outline zmdi-hc-fw" style="font-size: 24px;"></i>
                        </li>
                    <li class="mobile-menu-button visible-xs" style="float: left !important;">
                        <i class="zmdi zmdi-menu"></i>
                    </li>
                </ul>
            </nav>
            <div class="container">
                <div class="page-header">
                    <h1 id="titulitos" >Sistema Nova <small>Administracion Procesos</small></h1>
                    <form autocomplete="off" method="post" action="procesos">


                        <table>
                            <tr class="head">
                                <td>#</td>
                                <td>Tipo</td>
                                <td>Hora Salida</td>
                                <td>Hora Entrada</td>
                                <td>Radicado</td>
                                <td>Salon</td>
                                <td colspan="2">Acción</td>

                            </tr>

                            <%                                ProcesoVO PrVO = new ProcesoVO();
                                ProcesoDAO PrDAO = new ProcesoDAO();

                                ArrayList<ProcesoVO> listarProceso = PrDAO.listar();

                                for (int i = 0; i < listarProceso.size(); i++) {

                                    PrVO = listarProceso.get(i);

                            %>
                            <tr> 
                                <td><%=PrVO.getIdpro()%></td>
                                <td><%=PrVO.getTipo()%></td>
                                <td><%=PrVO.getDuracion()%></td>
                                <td><%=PrVO.getIdnovedad()%></td>
                                <td><%=PrVO.getIngreso()%></td>
                                <td><%=PrVO.getSalon()%></td>
                                <td ><button class="btn__delete" value="4" name="opcion">Eliminar</button></td>
                                <input  type="hidden" name="textIDPR" value="<%=PrVO.getIdpro()%>">

                            </tr>

                            <% }%>
                        </table>

                    </form>

                </div>






            </div>
        </div>



    </div>
     <footer class="footer full-reset">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xs-12 col-sm-6">
                             <h4 class="all-tittles" style="font-family: PetitaBold; font-size: 16px; font-weight: bold;">ACERCA DE NOSOTROS</h4>
                            <p style="font-family: PetitaBold;">
                             NOVA Sistema Gestor De Novedades En El Aula de Clases
                            </p>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <h4 class="all-tittles" style="font-size: 16px; font-weight: bold; font-family: PetitaBold;" >DESARROLLADORES</h4>
                            <ul class="list-unstyled">  
                            <p style="font-family: PetitaBold;">
                             Sthewart Rojano - Andres Pinchao - Andres Hurtado
                            </p>
                            </ul>
                        </div>
                    </div>
                </div>
                    
                
            </footer>  
</div>
</body>
</html>
