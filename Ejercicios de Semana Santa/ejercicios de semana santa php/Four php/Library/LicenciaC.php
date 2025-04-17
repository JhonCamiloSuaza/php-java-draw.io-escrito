<?php
require_once 'Licencia.php';

class LicenciaC extends Licencia {
    public function __construct() {
        $this->costo = 1600000;
        $this->duracion = 12;
    }

    public function mostrarServicios() {
        echo "Licencia C: vehículos de servicio público.\n";
    }
}
?>