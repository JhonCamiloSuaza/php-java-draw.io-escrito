<?php
namespace Library;

require_once 'Plan.php';

class PlanBasico extends Plan {
    public function __construct() {
        parent::__construct("Básico", 50000, "Acceso general");
    }
}