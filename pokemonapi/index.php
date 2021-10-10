<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/login.css">
</head>
<body>
	<?php
	include "conexion.php";
	?>
	<p>Log-in</p>
	<section>
		<form method="post">
			<input id="entry1" type="email" name="name" placeholder="email">
			<input type="password" name="pass" placeholder="password">
			<input id="boton" type="submit" name="entrar">
			<h6><a href="registrar.php">No tienes un usuario todavia? presiona aqui para registrarte</a></h6>
		</form>
	</section>
	<?php
		if (isset($_POST['entrar'])) {
			$email = $_POST['name'];
			$contrasena = $_POST['pass'];
			$buscar = "SELECT * FROM datos WHERE email='$email' and pass='$contrasena'";
			$resultado = mysqli_query($con, $buscar);
			$filas = mysqli_num_rows($resultado);
			if ($filas) {
				header("location:pokemon.php");
			}
			else {
				echo "El correo o la contrasena son incorrectos por favor intentelo nuevamente";
			}
		}
	?>
</body>
</html>