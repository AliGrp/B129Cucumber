@DataTableTest
Feature:Data Table Test

  Scenario: Google Search
    Given kullanici_google_anasayfaya_gider
    When kullanici verilen bilgileri aratir
      | Bilgiler |
      | Java     |
      | Sql      |
      | Lambda   |
      | Python   |
    Then sayfayi_kapatir

    Scenario: BlueRentalCar Login
      Given kullanci Blue rental car sayfasina gider
      When login olur
        | emailadress                   | password  |
        | jack@gmail.com                | 12345     |
        | sam.walker@bluerentalcars.com | c!fas_art |
      Then sayfayi_kapatir

  Scenario: BlueRentalCar Map Login
    Given kullanci Blue rental car sayfasina gider
    When login olur map
      | emailadress                   | password  |
      | jack@gmail.com                | 12345     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then sayfayi_kapatir