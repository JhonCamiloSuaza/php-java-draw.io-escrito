<?php
require_once 'Library/Usuario.php';
require_once 'Library/Basico.php';
require_once 'Library/Medio.php';
require_once 'Library/Premium.php';

echo "Ingrese su nombre: ";
$nombre = trim(fgets(STDIN));

echo "Ingrese su apellido: ";
$apellido = trim(fgets(STDIN));

echo "Ingrese su identificación: ";
$identificacion = trim(fgets(STDIN));

echo "Ingrese su peso: ";
$peso = trim(fgets(STDIN));

echo "Ingrese su estatura: ";
$estatura = trim(fgets(STDIN));

echo "Seleccione su plan (Básico / Medio / Premium): ";
$planSeleccionado = strtolower(trim(fgets(STDIN)));  // Asegura que todo se maneje en minúsculas

// Crear el objeto usuario
$usuario = new Usuario($nombre, $apellido, $identificacion, $peso, $estatura);

// Crear el objeto del plan seleccionado
$plan = null;
switch ($planSeleccionado) {
    case 'básico':
        $plan = new Basico();
        break;
    case 'medio':
        $plan = new Medio();
        break;
    case 'premium':
        $plan = new Premium();
        break;
    default:
        echo "Plan no válido. Por favor ingrese un plan correcto.\n";
        exit; // Detiene el programa si el plan es inválido
}

// Mostrar los datos del usuario
echo "\n--- Datos del Usuario ---\n";
echo "Nombre: " . $usuario->getNombreCompleto() . "\n";
echo "Identificación: " . $usuario->getIdentificacion() . "\n";
echo "Peso: " . $usuario->getPeso() . " kg\n";
echo "Estatura: " . $usuario->getEstatura() . " m\n";

// Mostrar el nombre del plan seleccionado
echo "\nPlan Seleccionado: " . $plan->getNombrePlan() . "\n";

// Mostrar detalles del plan seleccionado
echo "\n--- Detalles del Plan Seleccionado ---\n";
$plan->mostrarServicios();
echo "Precio: " . number_format($plan->calcularPrecio(), 0, ',', '.') . " COP\n";