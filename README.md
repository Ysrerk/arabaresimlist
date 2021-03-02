# arabaresimlist
Araba resimleri ile araba bilgilerinin listelenmesi( Listing cars with pictures and info)
listview showing arabapictures with infoes
araba resimleri   bilgilerle listeleniyor adapter ve listviw kullanildi


Asagidaki web servis kullanildi
************
<?php

include("baglan5.php");

class arabalar{
    public $id="";
    public $marka="";
    public $fiyat="";
    public $resim="";
}

$araba=new arabalar();
$kayitliarabalar=mysqli_query($baglan,"select * from arabalar");
$sayikayitli=mysqli_num_rows($kayitliarabalar);
$sayac=0;
//echo($sayikayitli);
echo("[");
while($goster=mysqli_fetch_assoc($kayitliarabalar)){
    $sayac+=1;
    
   $araba->id=$goster["id"];
   $araba->marka=$goster["marka"];
   $araba->fiyat=$goster["fiyat"];
   $araba->resim=$goster["resim"];
   
   echo(json_encode($araba));
   if($sayikayitli>$sayac){
       echo(",");
   }
}
echo("]");


?>

*************
