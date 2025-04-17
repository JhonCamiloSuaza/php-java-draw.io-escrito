<?php
namespace Library;

class HorasExtras {
    private float $valorHora;
    private int $horasDiurnas;
    private int $horasNocturnas;
    private int $horasFestivas;

    public function __construct(float $valorHora, int $horasDiurnas, int $horasNocturnas, int $horasFestivas) {
        $this->valorHora = $valorHora;
        $this->horasDiurnas = $horasDiurnas;
        $this->horasNocturnas = $horasNocturnas;
        $this->horasFestivas = $horasFestivas;
    }

    public function calcularTotal(): float {
        $totalHorasExtras = ($this->horasDiurnas * $this->valorHora) +
                            ($this->horasNocturnas * $this->valorHora * 1.35) +
                            ($this->horasFestivas * $this->valorHora * 1.75);
        return $totalHorasExtras;
    }
}