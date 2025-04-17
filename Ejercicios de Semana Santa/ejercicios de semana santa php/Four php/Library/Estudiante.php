<?php
require_once 'Util.php';

class Estudiante {
    private $identificacion;
    private $nombres;
    private $apellidos;
    private $direccion;
    private $telefono;
    private $rh;
    private $licencia;

    public function __construct($identificacion, $nombres, $apellidos, $direccion, $telefono, $rh, $licencia) {
        $this->identificacion = $identificacion;
        $this->nombres = $nombres;
        $this->apellidos = $apellidos;
        $this->direccion = $direccion;
        $this->telefono = $telefono;
        $this->rh = $rh;
        $this->licencia = $licencia;
    }

    public function mostrarDetalles() {
        echo "\n--- Datos del Estudiante ---\n";
        echo "Nombre: {$this->nombres} {$this->apellidos}\n";
        echo "Identificación: {$this->identificacion}\n";
        echo "Dirección: {$this->direccion}\n";
        echo "Teléfono: {$this->telefono}\n";
        echo "RH: {$this->rh}\n";
        echo "\n--- Detalles de la Licencia Seleccionada ---\n";
        $this->licencia->mostrarServicios();
        echo "Costo: " . Util::formatearCOP($this->licencia->getCosto()) . "\n";
        echo "Duración: " . $this->licencia->getDuracion() . " meses\n";
    }
}
?>