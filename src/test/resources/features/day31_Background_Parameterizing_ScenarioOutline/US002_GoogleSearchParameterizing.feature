@GoogleSearch
Feature: US001_Google_Search
  Background: kullanici_google_anasayfaya_gider
    Given kullanici_google_anasayfaya_gider

    Scenario: TC01_Java_Search
      When kullanici googleda "java" aratir
      Then title'in "java" icerdigini dogrula
      And sayfayi_kapatir

  Scenario: TC02_SQL_Search
    When kullanici googleda "Sql" aratir
    Then title'in "Sql" icerdigini dogrula
    And kullanici_3_saniye_bekler
    And sayfayi_kapatir


