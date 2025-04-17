<?php

class Square extends geometricFigures {
     private float $side;
     private float $calculate;
 
     public function __construct(float $side) {
         parent::__construct("Square");
         $this->side = $side;
     }
 
     public function getSide(): float {
         return $this->side;
     }
 
     public function calculateArea(): float {
         $this->calculate = $this->getSide() * $this->getSide();
         return $this->calculate;
     }
 }
 

 
