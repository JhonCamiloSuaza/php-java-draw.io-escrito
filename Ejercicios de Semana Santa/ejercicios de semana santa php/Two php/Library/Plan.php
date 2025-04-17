<?php
abstract class Plan {
    protected $nombrePlan;
    protected $precio;

    abstract public function mostrarServicios();
    abstract public function calcularPrecio();

    public function getNombrePlan() {
        return $this->nombrePlan;
    }

    public function getPrecio() {
        return $this->precio;
    }
}
?>