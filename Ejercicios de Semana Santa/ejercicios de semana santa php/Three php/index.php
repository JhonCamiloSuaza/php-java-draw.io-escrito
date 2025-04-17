
<?php
require_once "Library/LeyNewton.php";
require_once "Library/PrimeraLey.php";
require_once "Library/SegundaLey.php";
require_once "Library/TerceraLey.php";

echo "Seleccione la Ley de Newton (1 / 2 / 3): ";
$opcion = trim(fgets(STDIN));

switch ($opcion) {
    case 1: $ley = new PrimeraLey(); break;
    case 2: $ley = new SegundaLey(); break;
    case 3: $ley = new TerceraLey(); break;
    default: echo "Opción inválida\n"; exit;
}

$ley->ingresarDatos();
$ley->calcular();
?>
