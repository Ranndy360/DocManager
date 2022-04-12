<!-- /.content-wrapper -->
<footer class="main-footer">
    <div class="float-right d-none d-sm-block">
        <b>Version</b> 1.0.0
    </div>
    <strong>Copyright &copy; 2022 <a href="https://www.linkedin.com/in/ranndy360/">DocManager creator</a>.</strong> All rights reserved.
</footer>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
</aside>
<!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>


<!-- Bootstrap 4 -->
<script src="<c:url value='/assets/plugins/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
<!-- bs-custom-file-input -->
<script src="<c:url value='/plugins/bs-custom-file-input/bs-custom-file-input.min.js'/>"></script>
<!-- AdminLTE App -->
<script src="<c:url value='/dist/js/adminlte.min.js'/>"></script>
<!-- AdminLTE for demo purposes -->
<script src="<c:url value='/dist/js/demo.js'/>"></script>
<!-- Page specific script -->
<script>
    $(function () {
        bsCustomFileInput.init();
        $('.datatable').DataTable();
    });
</script>
</body>
</html>
