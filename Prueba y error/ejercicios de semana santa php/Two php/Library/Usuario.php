<?php
namespace Library;

require_once 'Plan.php';

class Usuario {
    private string $nombre;
    private string $identificacion;
    private float $peso;
    private float $estatura;
    private Plan $plan;

    public function __construct(string $nombre, string $identificacion, float $peso, float $estatura, Plan $plan) {
        $this->nombre = $nombre;
        $this->identificacion = $identificacion;
        $this->peso = $peso;
        $this->estatura = $estatura;
        $this->plan = $plan;
    }

    public function mostrarRegistro(): void {
        echo "===== Registro de Usuario =====<br>";
        echo "Usuario: {$this->nombre}<br>";
        echo "Identificación: {$this->identificacion}<br>";
        echo "Peso: {$this->peso} kg<br>";
        echo "Estatura: {$this->estatura} m<br>";
        echo "Plan: {$this->plan->getNombre()}<br>";
        echo "Servicios incluidos: {$this->plan->getServicios()}<br>";
        echo "Costo mensual: $" . number_format($this->plan->getCosto(), 0, ',', '.') . "<br><br>";
    }
}