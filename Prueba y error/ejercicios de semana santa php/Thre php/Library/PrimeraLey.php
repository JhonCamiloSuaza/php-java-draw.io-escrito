<?php
namespace Library;

require_once 'LeyNewton.php';

class PrimeraLey extends LeyNewton {

    public function describir(): string {
        return "Primera Ley de Newton - Inercia";
    }

    public function ejecutar(): void {
        echo "===== " . $this->describir() . " =====<br>";
        echo "Un objeto en reposo permanecerá en reposo, y un objeto en movimiento continuará en movimiento a velocidad constante a menos que una fuerza externa actúe sobre él.<br>";
    }
}