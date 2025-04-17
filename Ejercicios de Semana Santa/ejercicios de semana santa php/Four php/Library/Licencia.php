<?php
abstract class Licencia {
    protected $costo;
    protected $duracion;

    abstract public function mostrarServicios();
    public function getCosto() {
        return $this->costo;
    }
    public function getDuracion() {
        return $this->duracion;
    }
}
?>