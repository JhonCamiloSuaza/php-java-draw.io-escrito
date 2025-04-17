<?php
require_once 'Library/Empleado.php';

function leer($mensaje) {
    echo $mensaje;
    return trim(fgets(STDIN));
}

$nombre = leer("Ingrese su nombre: ");
$id = leer("Ingrese su identificación: ");
$salarioBase = leer("Ingrese su salario base: ");
$extraDiurnas = leer("Horas extra diurnas: ");
$extraNocturnas = leer("Horas extra nocturnas: ");
$extraFestivas = leer("Horas extra festivas: ");
$riesgo = leer("Nivel de riesgo (1 a 5): ");

$empleado = new Empleado($nombre, $id, $salarioBase, $extraDiurnas, $extraNocturnas, $extraFestivas, $riesgo);
$empleado->mostrarDetalles();
?>