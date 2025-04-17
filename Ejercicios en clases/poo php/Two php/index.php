<?php
include('library/geometricFigures.php');
include('library/triangle.php');
include('library/square.php');
include('library/rectangle.php');
include('library/circle.php');

$triangle = new Triangle(15, 9);
$square = new Square(7);
$rectangle = new Rectangle(8, 1);
$circle = new Circle(2); 
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Áreas de Figuras Geométricas</title>
</head>
<body>
    <?php 
    echo $triangle->getName() . "<br/>";
        echo "Base: " . $triangle->getBase() . "<br/>";
        echo "Altura: " . $triangle->getHeight() . "<br/>";
        echo "Área: " . $triangle->calculateArea() . "<br/><br/>";

    echo $square->getName() . "<br/>";
        echo "Lado: " . $square->getSide() . "<br/>";
        echo "Área: " . $square->calculateArea() . "<br/><br/>";

    echo $rectangle->getName() . "<br/>";
        echo "Base: " . $rectangle->getBase() . "<br/>";
        echo "Altura: " . $rectangle->getHeight() . "<br/>";
        echo "Área: " . $rectangle->calculateArea() . "<br/><br/>";

    echo $circle->getName() . "<br/>";
        echo "Radio: " . $circle->getRadius() . "<br/>";
        echo "Área: " . $circle->calculateArea();
    ?>
</body>
</html>
