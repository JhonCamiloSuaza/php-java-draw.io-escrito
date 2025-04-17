<?php
require_once 'Plan.php';

class Premium extends Plan {
    public function __construct() {
        $this->nombrePlan = "Premium";
        $this->precio = 2000000;
    }

    public function mostrarServicios() {
        echo "Acceso general + Clases dirigidas + Entrenador personal + Zona húmeda.\n";
    }

    public function calcularPrecio() {
        return $this->precio;
    }
}
?>