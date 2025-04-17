<?php
class apprentice extends person{

    private ?string  $birthday;
    private  int $telephoneContact; 


    
    public function getBirthday(): string {
        return $this->birthday;
    }

    public function setBirthday(string $birthday): void {
        $this->birthday = $birthday;
    }

     public function getTelephoneContact(): int {
    return $this->telephoneContact;
}

     public function setTelephoneContact(string $telephoneContact): void {
    $this->telephoneContact = $telephoneContact;
}

}
   