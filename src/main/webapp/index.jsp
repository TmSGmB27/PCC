<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>PCC</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="estilos.css">

    </head>

    <body>
 
        <div class="container">
            <div class="top">
                <h1 id="title" class="hidden"><span id="logo">TmS</span></h1>
            </div>
            <div class="login-box animated fadeInUp">
                <div class="box-header">
                    <h2>Log In</h2>

                </div>
                <form action="Control" method="post">

                    <label>Email</label>
                    <br/>
                    <input type="text" name="log_correo">
                    <br/>
                    <label>Password</label>
                    <br/>
                    <input type="password" name="log_clave">
                    <br/>
                    <button type="submit" >Log In</button>
                    <br/>

                </form>

                <a href="formulario.jsp"><p class="small">Don't have an account? Sign up!</p></a>

                <a href="#"><p class="small">Forgot your password?</p></a>
            </div>

            <div class="box-header" style="float:right" >
                <label for="hecha por">Pagina hecha por: Miguel Angel Rojas Betancourt</label>
            </div>
            
        </div>

    </body>

</html>
