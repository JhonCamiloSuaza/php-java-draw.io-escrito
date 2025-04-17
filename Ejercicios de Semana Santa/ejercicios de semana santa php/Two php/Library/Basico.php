<?php
require_once 'Plan.php';

class Basico extends Plan {
    public function __construct() {
        $this->nombrePlan = "Básico";
        $this->precio = 1000000;
    }

    public function mostrarServicios() {
        echo "Acceso general.\n";
    }

    public function calcularPrecio() {
        return $this->precio;
    }
}
?>