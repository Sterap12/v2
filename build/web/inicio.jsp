<%-- 
    Document   : inicio
    Created on : 31/10/2019, 07:34:37 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        
        <script src="js/bootstrap.min.js"></script>
         <link href="css/style_1.css" rel="stylesheet" type="text/css"/>
        <script src="js/main.js"></script>
        <link href="css/inicio.css" rel="stylesheet" type="text/css"/>
         <link rel="stylesheet" type="text/css" href="css/flexslider2.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
        <script src="js/jquery.flexslider.js"></script>
        <script src="https://kit.fontawesome.com/b7a56eba44.js" crossorigin="anonymous"></script>
       <script type="text/javascript">
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide"
                });
            });



        </script>
       
    </head>
    <body>
        <header>
        <figure><img src="assets/img/logoblanco.png"></figure>    
        
        </header> 
            
        <input id="boton1"  value="INICIAR SESIÓN" type="submit" onclick="location.href='Login.jsp'">
     
             <input id="boton2" value="SOPORTE" type="submit" onclick="location.href='#'" >
             
              <div class="container-fluid">
                    <div class="container-flat-form" >
                        <div class="flexslider">
                            <ul class="slides">
                                <li>
                                    <img src="assets/img/1.png">	
                                    <section class="flex-caption"></section>
                                </li>
                                <li>
                                    <img src="assets/img/2.png">	
                                    <section class="flex-caption"></section>	
                                </li>
                                <li>
                                    <img src="assets/img/3.png">	
                                    <section class="flex-caption"></section>	
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
               
     <footer class="footer full-reset">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xs-12 col-sm-6">
                            <h4 class="all-tittles">Acerca de Nosotros</h4>
                            <p>
                             NOVA es un sistema de novedades para las aulas de clase del sena
                            </p>
                        </div>
                        <div class="col-xs-12 col-sm-6">
                            <h4 class="all-tittles">Desarrolladores</h4>
                            <ul class="list-unstyled">
                                <li><i class="zmdi zmdi-check zmdi-hc-fw"></i>&nbsp; Sthewart Rojano - Andres Pinchao - Andres Hurtado <i class="zmdi zmdi-facebook zmdi-hc-fw footer-social"></i><i class="zmdi zmdi-twitter zmdi-hc-fw footer-social"></i></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="footer-copyright full-reset all-tittles">© 2019 SAA</div>
            </footer>                
     
    </body>
</html>
