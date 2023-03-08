@login_yap
Feature: blue_rental_cars_login_yapma

  Scenario Outline:TC01_BLUE_RENTAL_CARS_LOGIN_YAPMA

    Given kullanici "https://www.bluerentalcars.com/" adresine gider
    When kullanici login sayfasina gider
    And kullanici email "<email>" girer
    And kullanici sifre "<password>" girer
    And login butonuna basar
    Then sayfa kapatilir

    Examples: kayit_bilgileri
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |
