<?php
require_once 'Licencia.php';

class LicenciaB extends Licencia {
    public function __construct() {
        $this->tipo = "Licencia B (Vehículos particulares)";
        $this->duracion = 18;
        $this->costo = 250000;
    }
}
