
Feature: tutorialsninja Search
  Scenario: TC01 kullanici tutorialsninja search'de telefon aratir
    Given kullanici "ninjaUrl" gider
    When kullanici phone sayfasina gider
    Then telefonlarin marka adini alir
    Then tum ogeleri sepete ekle
    Then sepete tikla
    Then sepetteki isimleri al
    Then sepetteki ve sayfadaki listeleri karsilastir
    And sayfayi kapatir