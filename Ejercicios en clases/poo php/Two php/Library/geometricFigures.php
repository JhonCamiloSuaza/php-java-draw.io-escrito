<?php

 abstract class geometricFigures {
     private string $name;
 
     public function __construct(string $name) {
         $this->name = $name;
     }
 
     public function getName(): string {
         return $this->name;
     }
 
     abstract public function calculateArea(): float;
 }
 