<?php

abstract class Licencia {
    protected string $tipo;
    protected int $duracion;
    protected float $costo;

    public function detallesLicencia(): string {
        return "Tipo de licencia: {$this->tipo}\n" .
               "Duración: {$this->duracion} meses\n" .
               "Costo: $" . number_format($this->costo, 2, ',', '.') . " COP\n";
    }
}