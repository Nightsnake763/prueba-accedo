<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>habilidades</title>
	<link rel="stylesheet" href="css/habilidades_estilos.css">
</head>
<body>
	<button type="button"><a href="pokemon.php">View all Pokemons</a></button>
	<?php
		$id = $_GET['id'];
		$url = "https://pokeapi.co/api/v2/pokemon/".$id;
		$json = file_get_contents($url);
		$datos = json_decode($json, true);
		echo "<h1>".$datos["name"]."</h1>";
		?>
		<ul>
		<?php
		foreach ($datos["abilities"] as $key => $i) {
			?>
			<li><?php echo $i["ability"]["name"] ?></li>
		<?php
		}
	?>
	</ul>
	<img src="<?php echo $datos["sprites"]["front_default"]?>" alt="imagen no encontrada">
</body>
</html>