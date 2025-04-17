<?php
require_once 'Plan.php';

class Medio extends Plan {
    public function __construct() {
        $this->nombrePlan = "Medio";
        $this->precio = 1500000;
    }

    public function mostrarServicios() {
        echo "Acceso general + Clases dirigidas.\n";
    }

    public function calcularPrecio() {
        return $this->precio;
    }
}
?>