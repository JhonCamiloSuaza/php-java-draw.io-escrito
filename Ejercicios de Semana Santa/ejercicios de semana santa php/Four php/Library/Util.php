<?php
class Util {
    public static function formatearCOP($valor) {
        return number_format($valor, 0, ',', '.')." COP";
    }
}
?>