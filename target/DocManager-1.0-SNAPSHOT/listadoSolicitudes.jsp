<jsp:include page="/layout/header.jsp" />

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

            <table id="example" class="datatable table table-striped table-bordered" style="width:100%">
                <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Fecha registro</th>
                    <th>Estado</th>
                    <th>Area</th>
                    <th>Nombre</th>
                    <th>Nun. Identificacion</th>
                    <th>Descripcion</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="solicitud" items="${listado}">
                    <tr>
                        <td>${solicitud.codigo}</td>
                        <td>${solicitud.fecha_ingreso}</td>
                        <td>${solicitud.estado}</td>
                        <td>${solicitud.area.nombre}</td>
                        <td>${solicitud.solicitante.nombre}</td>
                        <td>${solicitud.solicitante.numero_identificacion}</td>
                        <td>${solicitud.descripcion}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="row" style="margin-left: 0;margin-right: 0;">
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
                                <th>Estado</th>
                                <th>Area</th>
                                <th>Nombre</th>
                                <th>Nun. Identificacion</th>
                                <th>Descripcion</th>
                            </tr>
                            </thead>
                            <tbody>

                            <c:forEach var="solicitud" items="${listado}">
                            <tr>
                                <td>${solicitud.codigo}</td>
                                <td>${solicitud.fecha_ingreso}</td>
                                <td>${solicitud.estado}</td>
                                <td>${solicitud.area.nombre}</td>
                                <td>${solicitud.solicitante.nombre}</td>
                                <td>${solicitud.solicitante.numero_identificacion}</td>
                                <td>${solicitud.descripcion}</td>
                            </tr>
                            </c:forEach>
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
