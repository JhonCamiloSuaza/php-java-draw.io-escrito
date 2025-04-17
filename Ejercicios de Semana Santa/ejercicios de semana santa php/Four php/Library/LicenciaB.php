<?php
require_once 'Licencia.php';

class LicenciaB extends Licencia {
    public function __construct() {
        $this->costo = 1300000;
        $this->duracion = 9;
    }

    public function mostrarServicios() {
        echo "Licencia B: vehículos particulares.\n";
    }
}
?>