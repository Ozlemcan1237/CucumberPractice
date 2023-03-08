#Scenario outline , bir senaryonun farkli verilerle tekrar kullanilmasini saglar.
  #Boylece ayni senaryonun farkli durumlardaki davranislari belirler
  @scenario_outline
  Feature: Kullanici amazon sayfasinda arama yapar
    Scenario Outline: amazon_sayfasinda_arama
      Given kullanici "amazonUrl" gider
      When kullanici "<arananKelime>" icin arama yapar
      And sayfa basliginin "<istenenKelime>" icerdigini test eder
      And sayfayi kapatir

      Examples:
        | arananKelime | istenenKelime |
        | selenium     | selenium      |
        | java         | java          |
        | iphone       | iphone        |

