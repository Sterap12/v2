<%-- 
    Document   : Consultar_Estacion
    Created on : 12-sep-2019, 6:06:55
    Author     : SEVEN
--%>

<%@page import="modeloVO.RolVO"%>
<%@page import="modeloDAO.EstacionDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloVO.EstacionVO"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estación</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="Shortcut Icon" type="image/x-icon" href="../assets/icons/logosignac.png" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/jquery.mCustomScrollbar.css" rel="stylesheet" type="text/css"/>
        <link href="css/material-design-iconic-font.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilotabla.css" rel="stylesheet" type="text/css"/>
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/style_1.css" rel="stylesheet" type="text/css"/>
        <link href="css/sweet-alert.css" rel="stylesheet" type="text/css"/>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
        <script src="js/modernizr.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/main.js"></script>
        <link href="css/buscar.css" rel="stylesheet" type="text/css"/>
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

                  <form name="reporte" action="/nova/pdf"> 
            <input type="submit" value="Visualizar Pdf" name="btnver"/>
        </form>
        <form name="reporte" action="/nova/classroomPDF"> 
            <input type="submit" value="Visualizar salones" name="btnver1"/>
        </form>
        <form name="reporte" action="/nova/descriptionPDF"> 
            <input type="submit" value="Visualizar descripciones" name="btnver2"/>
        </form>
         <form name="reporte" action="/nova/inventoryPDF"> 
            <input type="submit" value="Visualizar inventario" name="btnver3"/>
        </form>
         <form name="reporte" action="/nova/prenticePDF"> 
            <input type="submit" value="Visualizar Aprendiz" name="btnverr"/>
        </form>
         <form name="reporte" action="/nova/newsPDF"> 
            <input type="submit" value="Visualizar Novedades" name="btnverrr"/>
        </form>
        <form name="reporte" action="/nova/stationPDF"> 
            <input type="submit" value="Visualizar estaciones" name="btnverrrr"/>
        </form>
        <form name="reporte" action="/nova/processsPDF"> 
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
                <h1 id="titulitos" >Sistema Nova<small>Administración Estaciones</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                <li role="consultar_Aprendiz" class="active"><a href="Consultar_Aprendiz.jsp">Consultar Estación</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/img/user04.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección consultar estaciones.
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                        <li class="active">Consulta Estacion</li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form" >
                <div class="title-flat-form title-flat-blue">Consultar Estacion</div>
                <form autocomplete="off" method="post" action="Estacion">
                    <div class="row">
                        <div class="col-xs-12 col-sm-8 col-sm-offset-2">

                            <div class="group-material">
                                <input type="text" class="material-control tooltips-general" placeholder="Codigo Estacion" required=""  maxlength="50" data-toggle="tooltip" data-placement="top" name="textId">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Codigo Estacion</label>
                            </div>
                            <p class="text-center">
                                <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                <button type="submit" class="busqueda1">&nbsp;&nbsp; <img class="busqueda" src="css/busqueda-de-lupa.png">Consultar</button>
                                <input type="hidden" name="opcion" value="3">
                            </p> 
                            <table>
                                    <tr class="head">

                                        <td >Código</td>
                                        <td >Tipo</td>
                                        <td >Cantidad</td>
                                        <td >Id Clase</td>
                                        <td >Id Inventario</td>
                                        <td >Objeto</td>                                

                                        <td colspan="2">Acción</td></tr>
                                    <%                                        EstacionVO instivo = new EstacionVO();
                                        EstacionDAO instiDAO = new EstacionDAO();
                                        ArrayList<EstacionVO> listaVehiculos = instiDAO.listar();

                                        for (int i = 0; i < listaVehiculos.size(); i++) {

                                            instivo = listaVehiculos.get(i);
                                    %>
                                    <tr class="div-table-row-list">

                                            <td ><%= instivo.getPA_Id_Sta()%></td>
                                            <td ><%= instivo.getPA_type_Sta()%></td>
                                            <td ><%= instivo.getPA_quantity_Sta()%></td>
                                            <td ><%= instivo.getPA_Id_Cla()%></td>
                                            <td ><%= instivo.getPA_Id_inv()%></td>
                                            <td ><%= instivo.getPA_object_Sta()%></td>
                                            <td><a href="#"  class="btn__update" >Editar</a></td>
                                            <td><a href="#" class="btn__delete">Eliminar</a></td>
                                        </tr>
                                    <%}%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </form>
                <center>
                    <div style="color: red;">
                        <% if (request.getAttribute("mensajeError") != null) {%>

                        ${mensajeError}

                        <%} else if (request.getAttribute("mensajeExito") != null) {%>
                        <div style="color: green;">
                            ${mensajeExito}
                        </div>

                        <%}%>
                    </div>
                </center>
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

