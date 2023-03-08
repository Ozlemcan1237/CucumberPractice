Feature: Amazon_testi

  @gp2
  Scenario: TC01_amazon_iphone_arama
    Given kullanici "amazonUrl" gider
    When kullanici "iphone" icin arama yapar
    Then sayfa basliginin "iphone" icerdigini test eder
    And sayfayi kapatir
