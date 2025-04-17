<?php
namespace Library;

class Descuentos {
    public static function calcularARL(float $sueldoBase, int $riesgo): float {
        // Cálculo del ARL basado en el riesgo
        $porcentajeARL = [1 => 0.00522, 2 => 0.01044, 3 => 0.01980];
        return $sueldoBase * $porcentajeARL[$riesgo] ?? 0;
    }
}
