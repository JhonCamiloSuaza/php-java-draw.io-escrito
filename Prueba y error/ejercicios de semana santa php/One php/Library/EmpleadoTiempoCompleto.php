<?php
namespace Library;

class EmpleadoTiempoCompleto {
    private string $nombre;
    private float $sueldoBase;
    private float $subsidio;
    private int $riesgo;

    public function __construct(string $nombre, float $sueldoBase, float $subsidio, int $riesgo) {
        $this->nombre = $nombre;
        $this->sueldoBase = $sueldoBase;
        $this->subsidio = $subsidio;
        $this->riesgo = $riesgo;
    }

    public function getNombre(): string {
        return $this->nombre;
    }

    public function getSueldoBase(): float {
        return $this->sueldoBase;
    }

    public function getSubsidio(): float {
        return $this->subsidio;
    }

    public function getRiesgo(): int {
        return $this->riesgo;
    }

    public function calcularPago(float $totalExtras, float $totalDescuentos): float {
        return $this->sueldoBase + $this->subsidio + $totalExtras - $totalDescuentos;
    }
}