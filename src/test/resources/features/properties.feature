# Amazon sayfasında sql,samsung ve nokia aratıp sayfa başlıklarını her arama için test ediniz
#Aranacak kelimeleri config.properties dosyasından alınız

  Feature: Amazonda kelime arama
    @g5
    Scenario: TC01_Amazonda sql samsung ve nokia aramasi
      Given kullanici "amazonUrl" gider
      Then kullanici sql samsung ve nokia aramasi yapar basliklari test eder
      And sayfayi kapatir