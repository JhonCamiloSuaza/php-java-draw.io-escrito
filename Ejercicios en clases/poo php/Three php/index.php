<?php

include(__DIR__ . '/library/Persona.php');
include(__DIR__ . '/library/SueldoFinal.php');
include(__DIR__ . '/library/Descuentos.php');

// Crear objeto Persona
$persona = new Persona("Antonio");

// Crear objeto SueldoFinal con sueldo base y subsidio de transporte
$sueldoFinal = new SueldoFinal(1900000, 170000);

// Crear objeto Descuentos con valores de salud, pensión y ARL
$descuentos = new Descuentos(95000, 100000, 50000);

// Calcular sueldo con subsidio
$sueldoConSubsidio = $sueldoFinal->sueldoConSubsidio();

// Calcular total de descuentos
$totalDescuentos = $descuentos->totalDescuentos();

// Calcular total a pagar
$totalPagar = $sueldoConSubsidio - $totalDescuentos;

// Mostrar resultados
echo "Empleado: " . $persona->nombre . "<br><br>";
echo "Sueldo base: $" . number_format($sueldoFinal->sueldoBase, 2, ',', '.') . "<br><br>";
echo "Subsidio de transporte: $" . number_format($sueldoFinal->subsidioTransporte, 2, ',', '.') . "<br><br>";
echo "Descuentos<br>";
echo "Salud: $" . number_format($descuentos->salud, 2, ',', '.') . "<br>";
echo "Pensión: $" . number_format($descuentos->pension, 2, ',', '.') . "<br>";
echo "ARL: $" . number_format($descuentos->arl, 2, ',', '.') . "<br><br>";
echo "Total a pagar: $" . number_format($totalPagar, 2, ',', '.') . "<br>";

?>