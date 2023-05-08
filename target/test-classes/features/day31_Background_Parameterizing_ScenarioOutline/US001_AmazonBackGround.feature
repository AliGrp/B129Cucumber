Feature: US001_Amazon_Sayfasinda_Urun_Aratma

  Background: Amazona_git
    Given kullanici_amazon_sayfasina_gider

  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
    When arama_kutusunda_Selenium_aratir
    Then sayfayi_kapatir

  Scenario: TC02_Amazon_Sayfasinda_Java_Aratma
    When arama_kutusunda_Java_aratir
    Then sayfayi_kapatir

  Scenario: TC03_Amazon_Sayfasinda_SQL_Aratma
    When arama_kutusunda_SQL_aratir
    Then sayfayi_kapatir