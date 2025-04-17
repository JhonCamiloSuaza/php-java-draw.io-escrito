<?php
require_once 'PlanillaPago.php';

class Empleado {
    private $nombre;
    private $id;
    private $salarioBase;
    private $extraDiurnas;
    private $extraNocturnas;
    private $extraFestivas;
    private $nivelRiesgo;
    private $planilla;

    const SMMLV = 1300000; // salario mínimo actual

    public function __construct($nombre, $id, $salarioBase, $extraDiurnas, $extraNocturnas, $extraFestivas, $nivelRiesgo) {
        $this->planilla = new PlanillaPago();
        $this->nombre = $nombre;
        $this->id = $id;
        $this->salarioBase = $this->planilla->limpiarValor($salarioBase);
        $this->extraDiurnas = $extraDiurnas;
        $this->extraNocturnas = $extraNocturnas;
        $this->extraFestivas = $extraFestivas;
        $this->nivelRiesgo = $nivelRiesgo;
    }

    public function calcularSubsidio() {
        return ($this->salarioBase < 2 * self::SMMLV) ? self::SMMLV : 0;
    }

    public function calcularHorasExtras() {
        $valorHora = $this->salarioBase / 240; // 240 horas al mes
        $pagoDiurnas = $this->extraDiurnas * $valorHora * 1.25;
        $pagoNocturnas = $this->extraNocturnas * $valorHora * 1.75;
        $pagoFestivas = $this->extraFestivas * $valorHora * 2.00;
        return $pagoDiurnas + $pagoNocturnas + $pagoFestivas;
    }

    public function calcularDeducciones() {
        $salud = $this->salarioBase * 0.04;
        $pension = $this->salarioBase * 0.04;

        $arlPorcentajes = [0.00522, 0.01044, 0.02436, 0.04350, 0.06960];
        $arl = $this->salarioBase * $arlPorcentajes[$this->nivelRiesgo - 1];

        return $salud + $pension + $arl;
    }

    public function calcularPagoTotal() {
        $subsidio = $this->calcularSubsidio();
        $extras = $this->calcularHorasExtras();
        $deducciones = $this->calcularDeducciones();
        return $this->salarioBase + $subsidio + $extras - $deducciones;
    }

    public function mostrarDetalles() {
        echo "\n--- Detalles del Empleado ---\n";
        echo "Nombre: {$this->nombre}\n";
        echo "Identificación: {$this->id}\n";
        echo "Salario Base: " . $this->planilla->formatearCOP($this->salarioBase) . "\n";
        echo "Subsidio: " . $this->planilla->formatearCOP($this->calcularSubsidio()) . "\n";
        echo "Pago Horas Extras: " . $this->planilla->formatearCOP($this->calcularHorasExtras()) . "\n";
        echo "Descuentos: " . $this->planilla->formatearCOP($this->calcularDeducciones()) . "\n";
        echo "Pago Total: " . $this->planilla->formatearCOP($this->calcularPagoTotal()) . "\n";
    }
}
?>