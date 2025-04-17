<?php
require_once 'Library/PlanBasico.php';
require_once 'Library/PlanMedio.php';
require_once 'Library/PlanPremium.php';
require_once 'Library/Usuario.php';

use Library\Usuario;
use Library\PlanBasico;
use Library\PlanMedio;
use Library\PlanPremium;

$usuario1 = new Usuario("Alberto Pérez", "C.C 1082301347", 70.0, 1.75, new PlanBasico());
$usuario2 = new Usuario("Maria Cárdenas", "C.C 1029341423", 60.0, 1.65, new PlanMedio());
$usuario3 = new Usuario("Pedro Ramírez", "C.C 1760472860", 80.0, 1.85, new PlanPremium());

$usuario1->mostrarRegistro();
$usuario2->mostrarRegistro();
$usuario3->mostrarRegistro();