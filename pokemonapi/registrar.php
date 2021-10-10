<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/registrar_estilos.css">
</head>
<body>
	<?php
	include "conexion.php";
	?>
	<p>Registrar</p>
	<section>
		<form method="post">
			<input id="entry1" type="email" name="name" placeholder="email">
			<input type="password" name="pass" placeholder="password">
			<input id="boton" type="submit" name="registrar">
		</form>
	</section>
	<?php
		if (isset($_POST['registrar'])) {
			if (strlen($_POST['pass']) >= 4) {
				$email = $_POST['name'];
				$contrasena = $_POST['pass'];
				$insertar = "INSERT INTO datos(email, pass) VALUES ('$email','$contrasena')";
				$resultado = mysqli_query($con, $insertar);
				if ($resultado) {
					echo "<h1>¡¡¡Se ha registrado exitosamente!!!</h1>";
					echo "<h1><a href = 'index.php'>Volver a la pagina principal</a></h1>";
				}
				else {
					echo "<h1>¡¡¡El correo que ha intentado ingresar ya esta en uso!!!</h1>";
				}
			}
			else {
				echo "la contrasena debe tener como minimo 4 caracteres</h1>";
			}
		}
	?>
</body>
</html>