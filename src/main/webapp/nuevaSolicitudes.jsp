<jsp:include page="/layout/header.jsp" />

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
                        <form action="solicitudes?action=crear" method="post">
                            <div class="card-body">
                                <div class="form-group">
                                    <label >Area</label>
                                    <select class="form-control" name="area">
                                        <c:forEach var="area" items="${areaDs}">
                                        <option value="${area.id}">${area.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label >Solicitante</label>
                                    <select class="form-control" name="solicitante">
                                        <c:forEach var="solicitante" items="${solicitanteDs}">
                                            <option value="${solicitante.id}">${solicitante.nombre}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label >Descripcion</label>
                                    <textarea class="form-control" name="descripcion" placeholder="Numero unico de identidad"></textarea>
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
