<?php
require_once 'Licencia.php';

class LicenciaC extends Licencia {
    public function __construct() {
        $this->tipo = "Licencia C (Servicio público)";
        $this->duracion = 24;
        $this->costo = 350000;
    }
}