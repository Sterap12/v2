<%-- 
    Document   : Registro_Instructor
    Created on : 22/08/2019, 08:29:40 PM
    Author     : Masterr}
--%>

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
        <title>Instructor</title>
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
      <script type="text/javascript">
// Solo permite ingresar numeros.
function soloNumeros(e){
	var key = window.Event ? e.which : e.keyCode
	return (key >= 48 && key <= 57)
}
// Solo letras
 function soloLetras(e){
       key = e.keyCode || e.which;
       tecla = String.fromCharCode(key).toLowerCase();
       letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
       especiales = "8-37-39-46";

       tecla_especial = false
       for(var i in especiales){
            if(key == especiales[i]){
                tecla_especial = true;
                break;
            }
        }

        if(letras.indexOf(tecla)==-1 && !tecla_especial){
            return false;
        }
    }
</script>
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
                    <li role="Instructor" class="active"><a href="Registro_Instructor.jsp">Instructor</a></li>
                    <li role="presentation" ><a href="provider.jsp">Aprendiz</a></li>
                </ul>
            </div>
            <div class="container-fluid"  style="margin: 50px 0;">
                <div class="row">
                    <div class="col-xs-12 col-sm-4 col-md-3">
                        <img src="assets/img/user04.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
                    </div>
                    <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                        Bienvenido a la sección para registrar un nuevo Instructor, debes de llenar todos los campos del siguiente formulario para poder registrar un Instructor
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xs-12 lead">
                        <ol class="breadcrumb">
                            <li class="active">Instructores</li>
                            <li><a href="#">Listado de Instructores</a></li>
                        </ol>
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="container-flat-form" >
                    <div class="title-flat-form title-flat-blue">Agregar un nuevo Instructor</div>
                    <form autocomplete="off" method="post" action="Instructor">
                        <div class="row">
                            <div class="col-xs-12 col-sm-8 col-sm-offset-2">

                                <div class="group-material">
                                    <input type="text" class="material-control tooltips-general" placeholder="Nombre de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe el nombre del instructor" name="textinName" autofocus onkeypress="return soloLetras(event)">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Nombre del Instructor</label>
                                </div>
                                <div class="group-material">
                                    <input type="text" class="material-control tooltips-general" placeholder="Apellido de Instructor" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe el apellido del instructor" name="textinLastName" onkeypress="return soloLetras(event)">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Apellido del Instructor</label>
                                </div>
                                <div class="group-material">
                                    <h4>Tipo de documento</h4>
                                    <select class="material-control tooltips-general" placeholder="Tipo de documento"  data-toggle="tooltip" data-placement="top" title="Escoje el tipo de documento" name="textinTypeDoc">
                                        <option ></option>
                                        <option value="cedula">Cedula</option>
                                        <option value="Otro">Otro</option></select>

                                </div>

                                <div class="group-material">
                                    <input type="number" class="material-control tooltips-general" placeholder="Numero de documento" required=""  data-toggle="tooltip" data-placement="top" title="Solo números, mínimo 10 dígitos" name="textinNumber" onKeyPress="return soloNumeros(event)">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Numero de documento</label>
                                </div>
                                <div class="group-material">
                                    <input type="text" class="material-control tooltips-general" placeholder="Especialidad" required="" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe el apellido del aprendiz" name="textinSpeciality" onkeypress="return soloLetras(event)">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Especialidad</label>
                                </div>
                                <div class="group-material">
                                    <input type="text" class="material-control tooltips-general" placeholder="Edad" required="" maxlength="2" data-toggle="tooltip" data-placement="top" title="Escribe la edad " name="textinEge" onKeyPress="return soloNumeros(event)">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Edad</label>
                                </div>

                                <div class="group-material">
                                    <h4>Genero</h4>
                                    <select class="material-control tooltips-general"  required="" maxlength="50" data-toggle="tooltip" data-placement="top"  name="textinGender">
                                        <option ></option>
                                        <option value="Femenino">Femenino</option>
                                        <option value="Masculino">Masculino</option></select>

                                </div>

                                <div class="group-material">
                                    <input type="email" class="material-control tooltips-general" placeholder="Email Instructor" maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe El email de instructor" name="textinEmail">
                                    <span class="highlight"></span>
                                    <span class="bar"></span>
                                    <label>Email</label>
                                </div> 




                                <p class="text-center">
                                    <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                                    <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
                                    <input type="hidden" name="opcion" value="1">
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
