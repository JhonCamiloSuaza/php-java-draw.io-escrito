<?php
require_once 'Library/EmpleadoTiempoCompleto.php';
require_once 'Library/HorasExtras.php';
require_once 'Library/Descuentos.php';

use Library\EmpleadoTiempoCompleto;
use Library\HorasExtras;
use Library\Descuentos;

$antonio = new EmpleadoTiempoCompleto("Antonio", 1900000.00, 170000.00, 2);

$extras = new HorasExtras(95000.0 / 8, 3, 2, 1);
$totalExtras = $extras->calcularTotal();

$salud = 95000.0;
$pension = 100000.00;
$arl = Descuentos::calcularARL($antonio->getSueldoBase(), $antonio->getRiesgo());
$totalDescuentos = $salud + $pension + $arl;

$totalPagar = $antonio->calcularPago($totalExtras, $totalDescuentos);

$formato = function ($numero) {
    return number_format($numero, 2, '.', ',');
};

echo "Empleado: " . $antonio->getNombre() . "<br>";
echo "Sueldo base: " . $formato($antonio->getSueldoBase()) . "<br>";
echo "Subsidio: " . $formato($antonio->getSubsidio()) . "<br>";
echo "Horas extras: " . $formato($totalExtras) . "<br>";
echo "Descuentos:<br>";
echo "  Salud: " . $formato($salud) . "<br>";
echo "  Pensión: " . $formato($pension) . "<br>";
echo "  ARL: " . $formato($arl) . "<br>";
echo "Total a pagar: " . $formato($totalPagar) . "<br>";