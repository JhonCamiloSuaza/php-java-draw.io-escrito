<?php
require_once 'library/Estudiante.php';
require_once 'library/LicenciaA.php';
require_once 'library/LicenciaB.php';
require_once 'library/LicenciaC.php';

//  cualquier persona debe ingresar estos datos 
$id = "1684285839";
$nombres = "Gustavo";
$apellidos = "Andrade";
$direccion = "Calle 52A #1-89";
$telefono = "3113403837";
$rh = "O+";

$opcion = 2; // 1 = A, 2 = B, 3 = C

switch ($opcion) {
    case 1:
        $licencia = new LicenciaA();
        break;
    case 2:
        $licencia = new LicenciaB();
        break;
    case 3:
        $licencia = new LicenciaC();
        break;
    default:
        die("Opción no válida.");
}

$estudiante = new Estudiante($id, $nombres, $apellidos, $direccion, $telefono, $rh, $licencia);

// Mostrar información
echo "<pre>" . $estudiante->getInformacion() . "</pre>";
