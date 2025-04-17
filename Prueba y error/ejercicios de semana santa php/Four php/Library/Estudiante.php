<?php

require_once 'Licencia.php';

class Estudiante {
    private string $id;
    private string $nombres;
    private string $apellidos;
    private string $direccion;
    private string $telefono;
    private string $rh;
    private Licencia $licencia;

    public function __construct($id, $nombres, $apellidos, $direccion, $telefono, $rh, Licencia $licencia) {
        $this->id = $id;
        $this->nombres = $nombres;
        $this->apellidos = $apellidos;
        $this->direccion = $direccion;
        $this->telefono = $telefono;
        $this->rh = $rh;
        $this->licencia = $licencia;
    }

    public function getInformacion(): string {
        return "=== Información del Estudiante ===\n" .
               "Nombre: {$this->nombres} {$this->apellidos}\n" .
               "Identificación: {$this->id}\n" .
               "Dirección: {$this->direccion}\n" .
               "Teléfono: {$this->telefono}\n" .
               "RH: {$this->rh}\n\n" .
               $this->licencia->detallesLicencia();
    }
}