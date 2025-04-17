<?php
require_once 'Library/Estudiante.php';
require_once 'Library/LicenciaA.php';
require_once 'Library/LicenciaB.php';
require_once 'Library/LicenciaC.php';

function leer($mensaje) {
    echo $mensaje;
    return trim(fgets(STDIN));
}

// Ingresar datos
$nombres = leer("Ingrese sus nombres: ");
$apellidos = leer("Ingrese sus apellidos: ");
$identificacion = leer("Ingrese su identificación: ");
$direccion = leer("Ingrese su dirección: ");
$telefono = leer("Ingrese su teléfono: ");
$rh = leer("Ingrese su RH: ");

echo "Seleccione el tipo de licencia (A / B / C): ";
$tipoLicencia = strtoupper(trim(fgets(STDIN)));

switch ($tipoLicencia) {
    case 'A':
        $licencia = new LicenciaA();
        break;
    case 'B':
        $licencia = new LicenciaB();
        break;
    case 'C':
        $licencia = new LicenciaC();
        break;
    default:
        echo "Tipo de licencia inválido.\n";
        exit();
}

// Crear estudiante
$estudiante = new Estudiante($identificacion, $nombres, $apellidos, $direccion, $telefono, $rh, $licencia);
$estudiante->mostrarDetalles();
?>