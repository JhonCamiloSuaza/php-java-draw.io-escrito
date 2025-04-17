<?php
   include(__DIR__ . '/library/person.php');
   include(__DIR__ . '/library/apprentice.php');
   include(__DIR__ . '/library/teacher.php');

   $apprentice = new apprentice();
   $teacher = new teacher();

   $teacher->setTeacher(' Andres Moreno');
   $teacher->setTitle(' Ing. System');

   $apprentice->setName(' Camilo');
   $apprentice->setLastname(' Suaza');
   $apprentice->setBirthDay(' 2008-08-04');
   $apprentice->setTelephoneContact(3133289752 );

?>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>Document</title>
</head>
<body>
   <?php
       echo "Teacher:". $teacher->getTeacher();
       echo "<br/>";
       echo "Title:". $teacher->getTitle();
       echo "<br/>";
       echo "Name:". $apprentice->getName();
       echo "<br/>";
       echo "LastName:". $apprentice->getLastName();
       echo "<br/>";
       echo "BirthDay:". $apprentice->getBirthday();
       echo "<br/>";
       echo "Telephone:". $apprentice->getTelephoneContact();
   ?>
</body>
</html>