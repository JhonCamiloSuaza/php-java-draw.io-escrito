<?php
namespace Library;

require_once 'LeyNewton.php';

class TerceraLey extends LeyNewton {

    public function describir(): string {
        return "Tercera Ley de Newton - Acción y Reacción";
    }

    public function ejecutar(): void {
        echo "===== " . $this->describir() . " =====<br>";
        echo "Por cada acción hay una reacción igual y opuesta.<br>";
    }
}