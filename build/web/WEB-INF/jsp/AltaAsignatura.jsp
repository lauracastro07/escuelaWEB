    <%-- 
    Document   : AltaAsignatura
    Created on : 20/02/2023, 08:30:56 AM
    Author     : SALA1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta asignatura</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card boarder-info">
                <div class="card-header bg-info" >
                    <h3>Nueva Asignatura</h3>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Clave:</label>
                        <input type="number" name="clave" class="form-control">
                        <label>Nombre:</label>
                        <input type="text" name="nombre" class="form-control">
                        <label>Creditos:</label>
                        <input type="number" name="creditos" class="form-control">
                        <label>CantidadHoras:</label>
                        <input type="number" name="cantHoras" class="form-control">
                        <button type="submit" class="btn btn-success">
                            Agregar
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
