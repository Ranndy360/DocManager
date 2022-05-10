
<!DOCTYPE html>
<html lang="es">
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Doc Manager</title>
    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<c:url value='/assets/plugins/fontawesome-free/css/all.css'/>">
    <!-- icheck bootstrap -->
    <link rel="stylesheet" href="<c:url value='/assets/plugins/icheck-bootstrap/icheck-bootstrap.css'/>">
    <!-- Theme style -->
    <link rel="stylesheet" href="<c:url value='/assets/plugins/dist/css/adminlte.css'/>">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <!-- /.login-logo -->
    <div class="card card-outline card-primary">
        <div class="card-header text-center">
            <a href="/" class="h1"><b>Doc</b> Manager</a>
        </div>
        <div class="card-body">
            <p class="login-box-msg">Inicia sesion </p>

            <form action="login?action=login" method="post" id="loginForm">
                <div class="input-group mb-3">
                    <input type="email" name="correo" class="form-control" placeholder="Correo">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-envelope"></span>
                        </div>
                    </div>
                </div>
                <div class="input-group mb-3">
                    <input type="password" name="clave" class="form-control" placeholder="Contraseña">
                    <div class="input-group-append">
                        <div class="input-group-text">
                            <span class="fas fa-lock"></span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-8">
                    </div>
                    <!-- /.col -->
                    <div class="col-4">
                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>

            <!-- /.social-auth-links -->

        </div>
        <!-- /.card-body -->
    </div>
    <!-- /.card -->
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="<c:url value='/assets/plugins/jquery/jquery.js'/>"></script>
<!-- Bootstrap 4 -->
<script src="<c:url value='/assets/plugins/bootstrap/js/bootstrap.bundle.js'/>"></script>
<!-- AdminLTE App -->
<script src="<c:url value='/assets/plugins/dist/js/adminlte.js'/>"></script>


</body>
</html>
