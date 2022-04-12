<jsp:include page="/layout/header.jsp" />


<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Crear Solicitud</h1>
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
                            <h3 class="card-title">Ingresa la informacion</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form>
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Area</label>
                                    <select class="form-control">
                                        <option></option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Nombre solicitante</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Nombre completo">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Fecha Nacimiento</label>
                                    <input type="date" class="form-control" id="exampleInputPassword1" >
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Numero identificacion</label>
                                    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Numero unico de identidad">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Genero</label>
                                    <select class="form-control">
                                        <option>Masculino</option>
                                        <option>Femenino</option>
                                        <option>Otros</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Descripcion</label>
                                    <textarea class="form-control" id="exampleInputPassword1" placeholder="Numero unico de identidad"></textarea>
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
