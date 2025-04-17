<?php
namespace Library;

require_once 'Plan.php';

class PlanMedio extends Plan {
    public function __construct() {
        parent::__construct("Medio", 80000, "Acceso + Clases dirigidas");
    }
}