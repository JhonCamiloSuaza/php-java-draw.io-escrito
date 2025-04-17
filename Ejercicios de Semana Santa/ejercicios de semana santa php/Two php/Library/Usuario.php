<?php
class Usuario {
    private $nombre;
    private $apellido;
    private $identificacion;
    private $peso;
    private $estatura;

    public function __construct($nombre, $apellido, $identificacion, $peso, $estatura) {
        $this->nombre = $nombre;
        $this->apellido = $apellido;
        $this->identificacion = $identificacion;
        $this->peso = $peso;
        $this->estatura = $estatura;
    }

    public function getNombreCompleto() {
        return $this->nombre . " " . $this->apellido;
    }

    public function getIdentificacion() {
        return $this->identificacion;
    }

    public function getPeso() {
        return $this->peso;
    }

    public function getEstatura() {
        return $this->estatura;
    }
}
?>
