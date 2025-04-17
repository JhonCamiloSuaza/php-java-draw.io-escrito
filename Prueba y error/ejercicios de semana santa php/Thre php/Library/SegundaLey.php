<?php
namespace Library;

require_once 'LeyNewton.php';

class SegundaLey extends leyNewton {
    private float $masa;
    private float $aceleracion;
    private float $fuerza;

    public function __construct(float $masa, float $aceleracion) {
        $this->masa = $masa;
        $this->aceleracion = $aceleracion;
        $this->fuerza = $this->masa * $this->aceleracion;
    }

    public function describir(): string {
        return "Segunda Ley de Newton - F = m * a";
    }

    public function ejecutar(): void {
        echo "===== " . $this->describir() . " =====<br>";
        echo "La fuerza es el producto de la masa por la aceleración: F = m * a.<br>";
        echo "Fuerza calculada: {$this->fuerza} N (F = {$this->masa} kg * {$this->aceleracion} m/s²)<br>";
    }
}