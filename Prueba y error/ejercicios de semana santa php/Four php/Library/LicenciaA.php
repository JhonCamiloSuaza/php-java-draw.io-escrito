<?php
require_once 'Licencia.php';

class LicenciaA extends Licencia {
    public function __construct() {
        $this->tipo = "Licencia A (Motocicletas)";
        $this->duracion = 12;
        $this->costo = 150000;
    }
}