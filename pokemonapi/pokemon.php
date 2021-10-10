<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Pokemon</title>
	<link rel="stylesheet" href="css/index_estilos.css">
</head>
<body>
	<section>
		<table>
			<tbody>
				<tr>
					<?php
						$url = "https://pokeapi.co/api/v2/pokemon/";
						$json = file_get_contents($url);
						$datos = json_decode($json, true);
						$contador = 0;
						foreach ($datos["results"] as $key => $i) {
							if (($contador%3 == 0) && ($contador != 0)) {
								echo "</tr><tr>";
							}
							$id = $contador + 1;
							$contador ++;
							?>
							<td><a href="habilidades.php?id=<?php echo $id?>"><?php echo $i["name"]?></a></td>
						<?php
						}
					?>
				</tr>
			</tbody>
		</table>
	</section>
</body>
</html>