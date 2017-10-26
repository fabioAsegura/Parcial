<html>
    <head>
        <title>Principal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
    <div class="col-sm-12 text-left">
  <form class="col-sm-2" action="controlador" method="POST">
  <div class="form-group">
    <label for="usuario">numero de empleado</label>
    <input type="text" class="form-control"  name="numEmp">
  </div>
  <div class="form-group">
    <label for="contraseña">Nuevo Sueldo</label>
    <input type="text" class="form-control" name="Sueldo">
  </div>
   
  <button type="submit" class="btn-sm btn-primary">Actualizar sueldo</button>
  <div class="span12">&nbsp;</div>
  <button onclick="window.location.href='reporte.jsp'" type="button" class="btn-sm btn-primary">Reportes</button>
</form>
       
  </div>
    </body>
</html>

