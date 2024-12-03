<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card boarder-info">
                <div class="card-header big-info">
                    <h3>Nueva carrera</h3>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre:</label>
                        <input type="text" name="nombre" class="form-control">
                        <button type="submit" class="btn btn-success"> Agregar 
                        </button>
                    </form>
                </div>
            </div>  
        </div>
    </body>
</html>
