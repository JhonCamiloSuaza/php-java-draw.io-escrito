<?php
// Clase SueldoFinal que almacena sueldo base y subsidio de transporte
class SueldoFinal {
    public $sueldoBase;
    public $subsidioTransporte;

    public function __construct($sueldoBase, $subsidioTransporte) {
        $this->sueldoBase = $sueldoBase;
        $this->subsidioTransporte = $subsidioTransporte;
    }

    // Método que calcula el sueldo total antes de descuentos
    public function sueldoConSubsidio() {
        return $this->sueldoBase + $this->subsidioTransporte;
    }
}
?>
