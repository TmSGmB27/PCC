<%-- 
    Document   : formulario
    Created on : 9/10/2022, 1:31:56 a. m.
    Author     : mianr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="estilos.css">


        <title>Registro</title>        
    </head>

    <body>
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">Registro</span></h1>
            </div>
            <div class="login-box animated fadeInUp">
                <div class="box-header">
                    <h2>Sign In</h2>
                </div>
                <form action="Control" method="post">
                    <label for="name">Full Name</label>
                    <br/>
                    <input type="text" name="sign_nombre" required/>                                     
                    <br/>
                    <label for="username">Phone</label>
                    <br/>
                    <input type="text" name="sign_telefono" required/>
                    <br/>
                    <label for="email">Email</label>
                    <br/>
                    <input type="email" name="sign_email" required/>
                    <br/>
                    <label for="password">Password</label>
                    <br/>
                    <input type="password" name="sign_clave" required/>
                    <br/>
                    <button type="submit" name="accion" value="Register">Sign In</button>
                    <br/>
                </form>
            </div>
        </div>
        <br/>        <br/>        <br/>        <br/>        <br/>
    </body>
</html>
