<?php
require_once 'Library/PrimeraLey.php';
require_once 'Library/SegundaLey.php';
require_once 'Library/TerceraLey.php';

use Library\PrimeraLey;
use Library\SegundaLey;
use Library\TerceraLey;

echo "Selecciona una de las tres leyes de Newton:<br>";
echo "1. Primera Ley de Newton (Inercia)<br>";
echo "2. Segunda Ley de Newton (F = m * a)<br>";
echo "3. Tercera Ley de Newton (Acción y Reacción)<br><br>";

// Simulación de entrada de usuario
$seleccion = 2;
echo $seleccion . "<br>";

if ($seleccion == 1) {
    echo "Has seleccionado Primera Ley de Newton - Inercia.<br><br>";
    $ley = new PrimeraLey();
    $ley->ejecutar();
} elseif ($seleccion == 2) {
    echo "Has seleccionado Segunda Ley de Newton - F = m * a.<br><br>";
    $masa = 31.0;
    $aceleracion = 3.0;
    echo "Introduce la masa (m) en kg: $masa<br>";
    echo "Introduce la aceleración (a) en m/s²: $aceleracion<br><br>";
    $ley = new SegundaLey($masa, $aceleracion);
    $ley->ejecutar();
} elseif ($seleccion == 3) {
    echo "Has seleccionado Tercera Ley de Newton - Acción y Reacción.<br><br>";
    $ley = new TerceraLey();
    $ley->ejecutar();
} else {
    echo "Opción no implementada aún.";
}
