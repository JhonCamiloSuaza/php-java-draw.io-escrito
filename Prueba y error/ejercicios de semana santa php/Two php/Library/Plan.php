<?php
namespace Library;

abstract class Plan {
    protected string $nombre;
    protected int $costo;
    protected string $servicios;

    public function __construct(string $nombre, int $costo, string $servicios) {
        $this->nombre = $nombre;
        $this->costo = $costo;
        $this->servicios = $servicios;
    }

    public function getNombre(): string {
        return $this->nombre;
    }

    public function getCosto(): int {
        return $this->costo;
    }

    public function getServicios(): string {
        return $this->servicios;
    }
}