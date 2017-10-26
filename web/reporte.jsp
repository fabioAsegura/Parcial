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
        <form class="col-sm-2" action="controlador" method="POST">
  <div class="form-group">
    <label for="usuario">numero de empleado</label>
    <input type="text" class="form-control"  name="numEmp">
  </div>
  <button type="submit" class="btn-sm btn-primary">enviar</button>
   <button onclick="window.location.href='index.jsp'" type="button" class="btn-sm btn-primary">Inicio</button>
</form>
 <div class="container">           
  <table class="table table-striped">
      <tr>
        <th>Nombre</th>
        <th>Sueldo basico</th>
        <th>Salario minimo</th>
        <th>Auxilio de transporte</th>
        <th>Prima de servicios</th>
        <th>Cesantias</th>
        <th>Intereses sobre cesantias</th>
         <th>vacaciones</th>
         <th>Salus</th>
         <th>Pension</th>
         <th>Parafiscales</th>
      </tr>
      <tr></tr>
  </table>
</div>
    </body>
</html>