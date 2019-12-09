<%-- 
    Document   : Registrar_Usuario
    Created on : 27/07/2019, 03:50:36 PM
    Author     : Masterr}
--%>


<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloDAO.InstructorDAO"%>
<%@page import="modeloVO.InstructorVO"%>
<%@page import="modeloVO.RolVO"%>
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
        <title>Usuario</title>
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
        <script src="https://kit.fontawesome.com/b7a56eba44.js" crossorigin="anonymous"></script>
        <script src="js/main.js"></script>



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

                    <li><a href="reportes.jsp"><i class="fas fa-clipboard"></i>&nbsp;&nbsp; Reportes</a></li> 



                    <li>
                        <a href="Registro_Instructor.jsp"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp;Instructores </a>

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
                    <h1 id="titulitos" >Sistema Nova <small> Administración Usuarios</small></h1>
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
                        Bienvenido a la sección para registrar nuevos usuarios, debes de llenar todos los campos del siguiente formulario para poder registrar un usuario.
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 lead">
                        <ol class="breadcrumb">
                            <li class="active">Usuarios</li>
                            <li><a href="#">Registro Usuarios</a></li>
                        </ol>
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="container-flat-form" >
                    <div class="title-flat-form title-flat-blue">Agregar un nuevo usuario</div>
                    <form autocomplete="off" method="post" action="Usuario">
                        <div class="row">
                            <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                                <div class="group-material">
                                    <input type="text" class="material-control tooltips-general" placeholder="Nombre de Usuario" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe un Usuario" name="textUsuLogin" autofocus>
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Usuario</label>
                                </div>

                                <div class="group-material">
                                    <h4>Tipo</h4>
                                    <select class="material-control tooltips-general" placeholder="Apellido de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe el apellido del aprendiz" name="textUsuTipo">
                                        <option value=""></option>
                                        <option value="1">cuentadante</option>
                                        <option value="2">instructor</option>
                                        <option value="3">administración</option>
                                        <span class="highlight"></span>
                                        <span class="bar"></span>

                                    </select>
                                </div>

                                <div class="group-material">
                                    <h4>Instructor</h4>
                                    <select class="material-control tooltips-general"  required="" pattern="[0-9]{8,8}" maxlength="10" data-toggle="tooltip" data-placement="top" title="Solo números, mínimo 8 dígitos" name="textUsuInstructor" >
                                        <%

                                            InstructorVO InVO = new InstructorVO();
                                            InstructorDAO InDAO = new InstructorDAO();

                                            ArrayList<InstructorVO> listarInstructor = InDAO.listarultimo();

                                            for (int i = 0; i < listarInstructor.size(); i++) {

                                                InVO = listarInstructor.get(i);
                                        %><option  value="<%=InVO.getInId()%>"><%=InVO.getInName()%><option>
                                            <%

                                                }%>

                                    </select>
                                    <span class="highlight"></span>
                                    <span class="bar"></span>

                                </div>
                                <div class="group-material">
                                    <h4>Correo</h4>
                                    <input type="mail" class="material-control tooltips-general" placeholder="Nombre de Usuario" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe un Usuario" name="textinEmail" value="<%=InVO.getInEmail()%>" readonly >
                                    <span class="highlight"></span>
                                    <span class="bar"></span>

                                </div>









                                <p class="text-center">
                                    <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                    <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
                                    <input type="hidden" name="opcion" value="1">
                                    <%
                                        String usuPassword = "";
                                        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                                            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                                            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "-", "_", "/", "*", "#", "&", "@", "%", "$"};
                                        Random rnd = new Random();

                                        for (int i = 0; i < 10; i++) {
                                            if (i > 1) {
                                                usuPassword += rnd.nextInt(10);
                                                usuPassword += abecedario[(int) Math.round(Math.random() * 61)];

                                            }
                                        }
                                    %>
                                    <input type="hidden" name="textUsuPassword" value="<%=usuPassword%>">
                                </p> 
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
