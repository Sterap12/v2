    
<%@page import="modeloVO.RolVO"%>
<%@page import="modeloVO.EstacionVO"%>
<%@page import="modeloDAO.InventarioDAO"%>
<%@page import="modeloVO.InventarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.ClassroomDAO"%>
<%@page import="modeloVO.ClassroomVO"%>
<%@page import="modeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   HttpSession miSesion = (HttpSession) request.getSession();
    RolVO rol = (RolVO) miSesion.getAttribute("volleno");

    if (rol == null) {
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estación</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
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



                    <li><a href="#"><i class="zmdi zmdi-book zmdi-hc-fw"></i>&nbsp;&nbsp; Reportes Salones</a></li>

                    <li><a href="#"><i class="zmdi zmdi-balance zmdi-hc-fw"></i>&nbsp;&nbsp; Reportes Estación </a></li>



                    <li><a href="#"><i class="zmdi zmdi-home zmdi-hc-fw"></i>&nbsp;&nbsp; Reporte Novedades</a></li>


                    <li><a href="#"><i class="zmdi zmdi-home zmdi-hc-fw"></i>&nbsp;&nbsp; Reporte Inventario</a></li>


                    <li>
                        <a href="#"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp; Reporte Proceso </a>

                    </li>





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
                                + "<a href='CerrarSession' class='zmdi zmdi-power'></a></li>");

                    %>
                    <li  class="tooltips-general search-book-button" data-href="searchbook.html" data-placement="bottom" title="Buscar libro">
                        <i class="zmdi zmdi-search"></i>
                    </li>
                    <li  class="tooltips-general btn-help" data-placement="bottom" title="Ayuda">
                        <i class="zmdi zmdi-help-outline zmdi-hc-fw"></i>
                    </li>
                    <li class="mobile-menu-button visible-xs" style="float: left !important;">
                        <i class="zmdi zmdi-menu"></i>
                    </li>
                </ul>
            </nav>
            <div class="container">
                <div class="page-header">
                    <h1 class="all-tittles">Sistema Novedades <small>Administración Estación</small></h1>
                </div>
            </div>
            <div class="container-fluid">
                <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">
                    <li role="Instructor" class="active"><a href="Registrar_Usuario.jsp">Usuario</a></li>
                </ul>
            </div>
            <div class="container-fluid"  style="margin: 50px 0;">
                <div class="row">
                    <div class="col-xs-12 col-sm-4 col-md-3">
                        <img src="assets/img/user04.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                    </div>
                    <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                        Bienvenido a la sección para registrar una nueva estación, debes de llenar todos los campos del siguiente formulario para poder registrar una nueva estación.
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 lead">
                        <ol class="breadcrumb">
                            <li class="active">Nueva Estacion</li>
                            <li><a href="listprovider.html">Listado de Estaciones </a></li>
                        </ol>
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="container-flat-form" >
                    <div class="title-flat-form title-flat-blue">Agregar una nueva Estacion</div>


                    <form autocomplete="off" method="post" action="Estacion">
                        <%                            EstacionVO apVo = (EstacionVO) request.getAttribute("volleno");
                            if (apVo != null) {


                        %>   
                        <div class="row">
                            <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                                <div class="group-material">
                                    <input type="text" value="  <%= apVo.getPA_type_Sta()%> " class="material-control tooltips-general" placeholder="Nombre de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Edita el tipo de estacion" name="textintype" autofocus>
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Tipo</label>
                                </div>
                                <div class="group-material">
                                    <input type="text"  value="  <%= apVo.getPA_quantity_Sta()%> " class="material-control tooltips-general" placeholder="Apellido de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Edita la cantidad" name="textquantity_Sta">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Cantidad</label>
                                </div>
                                <div class="group-material">
                                    <input type="text"  value="  <%= apVo.getPA_object_Sta()%> " class="material-control tooltips-general" placeholder="Apellido de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Edita el Objeto" name="textobject_Sta">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Objeto</label>
                                </div>
                                <div class="group-material">
                                    <select class="material-control tooltips-general"  required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="" name="textId_Cla">
                                        <option style="color:lightgrey" ><%= apVo.getPA_Id_Cla()%></option>
                                        <%                                            ClassroomVO instivo = new ClassroomVO();
                                            ClassroomDAO instiDAO = new ClassroomDAO();
                                            ArrayList<ClassroomVO> listaclases = instiDAO.listar();

                                            for (int i = 0; i < listaclases.size(); i++) {

                                                instivo = listaclases.get(i);
                                        %>
                                        <option value="<%= instivo.getClId()%>"  >  <%= instivo.getCltype()%></option>
                                        <% }%>
                                    </select><br><br>
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                </div>
                                <div class="group-material">
                                    <select class="material-control tooltips-general" placeholder="Seleccione el Inventario" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Seleccione el Inventario" name="textid_inv">
                                        <option style="color:lightgrey"><%= apVo.getPA_Id_inv()%></option>
                                        <%
                                            InventarioVO invenVO = new InventarioVO();
                                            InventarioDAO invenDAO = new InventarioDAO();
                                            ArrayList<InventarioVO> listaInventa = invenDAO.listar();

                                            for (int i = 0; i < listaInventa.size(); i++) {

                                                invenVO = listaInventa.get(i);
                                        %>
                                        <option value="<%= invenVO.getinvId()%>"  >  <%= invenVO.getinvName()%></option>
                                        <% }%>
                                    </select><br><br>
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                </div>
                                <p class="text-center">
                                    <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                    <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Actualizar</button>
                                    <input type="hidden" name="opcion" value="2">
                                    <input type="hidden" name="textId" value="<%= apVo.getPA_Id_Sta()%>">

                                </p> 
                            </div>
                        </div>
                        <%}%>
                    </form>
                    <center>
                        <form autocomplete="off" method="post" action="Estacion">
                            <button type="submit" class="btn btn-danger"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Eliminar</button>
                            <input type="hidden" name="opcion" value="4">
                            <input type="hidden" name="textId" value="<%= apVo.getPA_Id_Sta()%>">
                        </form>
                    </center>

                </div>
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
    </body>
</html>
