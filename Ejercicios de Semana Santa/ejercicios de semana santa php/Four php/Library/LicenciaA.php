<?php
require_once 'Licencia.php';

class LicenciaA extends Licencia {
    public function __construct() {
        $this->costo = 900000;
        $this->duracion = 6;
    }

    public function mostrarServicios() {
        echo "Licencia A: motocicletas.\n";
    }
}
?>