
<?php
require_once "LeyNewton.php";

class SegundaLey extends LeyNewton {
    private $m;
    private $a;
    public function ingresarDatos() {
        echo "Ingrese la masa (kg): ";
        $this->m = floatval(trim(fgets(STDIN)));
        echo "Ingrese la aceleración (m/s²): ";
        $this->a = floatval(trim(fgets(STDIN)));
    }
    public function calcular() {
        $f = $this->m * $this->a;
        echo "Fuerza aplicada: " . number_format($f, 2, ",", ".") . " N\n";
    }
}
?>
