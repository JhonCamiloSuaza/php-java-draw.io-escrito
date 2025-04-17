<?php
// Clase Descuentos que calcula los descuentos de salud, pensión y ARL
class Descuentos {
    public $salud;
    public $pension;
    public $arl;

    public function __construct($salud, $pension, $arl) {
        $this->salud = $salud;
        $this->pension = $pension;
        $this->arl = $arl;
    }

    // Método que calcula el total de descuentos
    public function totalDescuentos() {
        return $this->salud + $this->pension + $this->arl;
    }
}
?>
