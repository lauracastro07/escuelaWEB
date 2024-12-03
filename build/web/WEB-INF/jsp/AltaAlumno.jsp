<%-- 
    Document   : AltaAlumno
    Created on : 26/02/2023, 07:41:46 AM
    Author     : Laura Castro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Alumno</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card boarder-info">
                <div class="card-header bg-info" >
                    <h3>Nueva Alumno</h3>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Cuenta:</label>
                        <input type="number" name="cuenta" class="form-control">
                        <label>Nombre:</label>
                        <input type="text" name="nombre" class="form-control">
                        <label>Apellido Paterno:</label>
                        <input type="text" name="paterno" class="form-control">
                        <label>Apellido Materno:</label>
                        <input type="text" name="materno" class="form-control">
                        <label>Fecha de Nacimiento:</label>
                        <input type="date" name="fechaNac" class="form-control">
                        <label>Sexo:</label>
                        <input type="text" name="sexo" class="form-control">
                        <label>Direccion:</label>
                        <input type="text" name="direccion" class="form-control">
                        <label>Celular:</label>
                        <input type="number" name="celular" class="form-control">
                        <label>Correo:</label>
                        <input type="text" name="correo" class="form-control">
                        <label>Codigo:</label>
                        <input type="number" name="codigo" class="form-control">
                        <button type="submit" class="btn btn-success">
                            Agregar
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>