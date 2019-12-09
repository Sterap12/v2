<%-- 
    Document   : Index
    Created on : 27/07/2019, 01:28:03 PM
    Author     : Masterr}
--%>

<%@page import="modeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession miSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("volleno");

%>
<html lang="es">
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    <link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
       <link href="css/login.css" rel="stylesheet" type="text/css"/>
       
        <script>
            var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
            var expr2 = /^1[8-9]|[2-5]\d|60$/;
            $(document).ready(function () {
                $("#bEnviar").click(function () {
                    var correo = $("#itMail").val();
                    var asunto = $("#itAsunto").val();

                    if (correo != "Nombres" && asunto != "Contraseña") {
                        $(document).ready(function () {
                            $("log").click(function (evento) {

                            })
                        })
                    } else {
                        $("#mensaje1").fadeOut();

                        if (correo != "Nombres") {
                            $("#mensaje2").fadeIn("slow");
                            return false;
                        } else {
                            $("#mensaje2").fadeOut();

                            if (asunto == "") {
                                $("#mensaje3").fadeIn("slow");
                                return false;
                            } else {
                                $("#mensaje3").fadeOut();
                            }
                        }

                    }
                });
            });

        </script>





        
        
    </head>
    <body>
       <!--  <header>
        <figure><img src="assets/img/logoblanco.png" ></figure>    
        
        </header> -->
        <!-- <input id="boton1"  value="INICIAR SESIÓN" type="submit" onclick="location.href='Login.jsp'">
     
             <input id="boton2" value="SOPORTE" type="submit" onclick="location.href='#'" >
    <center> -->
       

        <div id="contenedor" >
           
            
            <form class="form-container" method="post" action="Usuario">
                <figure><img src="assets/img/novaespiral2.png"></figure>    
                <div class="group-material-login">
                    <input style="color:#f5f9f0" type="text" class="material-login-control" required="" maxlength="70" name="textUsuLogin" id="itMail">
                    <span class="highlight-login"></span>
                    <span class="bar-login"></span>
                    <label><i class="zmdi zmdi-account"></i> &nbsp; Nombre</label>
                </div><br>
                <div class="group-material-login">
                    
                    <input style="color:#f5f9f0" type="password" class="material-login-control" required="" maxlength="70" name="textUsuPassword" id="">
                    <span class="highlight-login"></span>
                    <span class="bar-login"></span>
                    <label><i class="zmdi zmdi-lock"></i> &nbsp; Contraseña</label>
                </div>
                
                <center>
                    <div SIZE=5.5 face="monotype corsivas" class="mssg">No puedo iniciar sesión
                        <a href="#">Click aquí</a></div>
                    <div SIZE=5.5 face="monotype corsivas" class="mssg">Olvide mi contraseña
                        <a href="recovery.jsp">Click aquí</a></div>

                    <button type="submit" face="monotype corsivas" id="bEnviar" value="Login" class="boton">Login</button>
                    <input id="log" type="hidden" name="opcion" value="3">
                </center>
            </form>

        </div>
        <div id="mensaje4">

            <% if (request.getAttribute("mensajeError") != null) {%>

            ${mensajeError}

            <%}%>

        </div>
    </center>
            
            <%
                
         if (request.getParameter("cerrar")!=null) {
             miSesion.invalidate();
         }
            %>
    <footer id="footer">
                <div id="acerca"><h4>ACERCA DE NOSOTROS</h4></div>
               
               <div id="par"> <p >
                              NOVA Sistema Gestor De Novedades En El Aula de Clases
                   </p> <div>
               
                        <div id="soporte"><h4>SOPORTE</h4></div>
                        
                        <div id="sopi" onclick="location.href='assets/manual/manualinteractivo.html'">  <li><i class="zmdi zmdi-check zmdi-hc-fw"></i>&nbsp; Soporte <i class="zmdi zmdi-facebook zmdi-hc-fw footer-social"></i><i class="zmdi zmdi-twitter zmdi-hc-fw footer-social"></i></li> </div>
               <div id="desa"><h4>DESARROLLADORES</h4></div>
               
               <div id="lista"><ul class="list-unstyled">
                                <li><i class="zmdi zmdi-check zmdi-hc-fw"></i>&nbsp; Sthewart Rojano - Andres Pinchao - Andres Hurtado <i class="zmdi zmdi-facebook zmdi-hc-fw footer-social"></i><i class="zmdi zmdi-twitter zmdi-hc-fw footer-social"></i></li>
                            </ul> </div>
            </footer>          
                 
</body>
</html>
