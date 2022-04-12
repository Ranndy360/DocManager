<jsp:include page="/layout/header.jsp" />


<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                    <h1>Listado Solicitudes</h1>
                </div>
            </div>
        </div><!-- /.container-fluid -->
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-12">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Solicitudes</h3>
                        </div>
                        <!-- /.card-header -->
                        <table id="example" class="datatable table table-striped table-bordered" style="width:100%">
                            <thead>
                            <tr>
                                <th>Codigo</th>
                                <th>Fecha registro</th>
                                <th>Fecha actualizacion</th>
                                <th>Estado</th>
                                <th>Area</th>
                                <th>Nombre</th>
                                <th>Nun. Identificacion</th>
                                <th>Descripcion</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>ASD2434</td>
                                <td>10/10/2021</td>
                                <td>10/10/2021</td>
                                <td>Activo</td>
                                <td>Recursos</td>
                                <td>Randy Letona</td>
                                <td>545456454</td>
                                <td>Solicitud para construccion y mejoras a la propiedad</td>
                            </tr>
                            </tbody>
                        </table>
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
