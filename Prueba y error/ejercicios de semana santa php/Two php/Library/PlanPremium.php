<?php
namespace Library;

require_once 'Plan.php';

class PlanPremium extends Plan {
    public function __construct() {
        parent::__construct("Premium", 120000, "Acceso + Clases + Entrenador + Zona húmeda");
    }
}