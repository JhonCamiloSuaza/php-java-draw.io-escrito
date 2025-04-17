<?php

class rectangle extends geometricFigures {
    private float $base;
    private float $height;
    private float $calculate;

    public function __construct(float $base, float $height) {
        parent::__construct("Rectangle");
        $this->base=$base;
        $this->height = $height;
    }

    public function getBase(): float {
        return $this->base;
    }

    public function getHeight(): float {
        return $this->height;
    }

    public function calculateArea(): float {
        $this->calculate = $this->getbase() * $this->getHeight();
        return $this->calculate;
    }
}
