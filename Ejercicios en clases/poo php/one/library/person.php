<?php

class Person {

    private int $indentification;
    private string $name;
    private string $lastname;
  
    public function getIndentification(): int {
        return $this->indentification; 
    }

    public function setIndentification(int $indentification): void {
        $this->indentification = $indentification;
    }

    public function getName(): string {
        return $this->name;
    } 

    public function setName(string $name): void {
        $this->name = $name;
    }

    public function getLastname(): string {
        return $this->lastname;
    }

    public function setLastname(string $lastname): void {
        $this->lastname = $lastname;
    }

}
