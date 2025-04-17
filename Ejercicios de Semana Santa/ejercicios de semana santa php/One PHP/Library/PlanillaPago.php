<?php
class PlanillaPago {
    public function formatearCOP($num) {
        return number_format($num, 2, ',', '.');
    }

    public function limpiarValor($valor) {
        // Convierte 2.100.000,00 a 2100000.00
        $valor = str_replace('.', '', $valor);  // quita puntos
        $valor = str_replace(',', '.', $valor); // cambia coma por punto decimal
        return floatval($valor);
    }
}
?>
