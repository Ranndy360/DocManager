<jsp:include page="/layout/header.jsp" />

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Crear Solicitante</h1>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Ingrese el solicitante</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form action="solicitante?action=crear" method="post">
                            <div class="card-body">
                                <div class="form-group">
                                    <label >Nombre solicitante</label>
                                    <input type="text" class="form-control" name="nombre" placeholder="Nombre completo">
                                </div>
                                <div class="form-group">
                                    <label >Fecha Nacimiento</label>
                                    <input type="date" class="form-control" name="fechaNacimiento" >
                                </div>
                                <div class="form-group">
                                    <label >Numero identificacion</label>
                                    <input type="text" class="form-control" name="identificacion" placeholder="Numero unico de identidad">
                                </div>
                                <div class="form-group">
                                    <label for="genero">Genero</label>
                                    <select class="form-control" name="genero" id="genero">
                                        <option value="Masculino">Masculino</option>
                                        <option value="Femenino">Femenino</option>
                                        <option value="Otros">Otros</option>
                                    </select>
                                </div>
                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                        </form>
                    </div>
                    <!-- /.card -->


                </div>
                <!--/.col (left) -->
            </div>
            <!-- /.row -->
        </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
</div>
<jsp:include page="/layout/footer.jsp" />
