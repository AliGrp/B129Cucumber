@Techpro
Feature: US004_Techpro_Sayfasinda_Urun_Aratma

  Background: Techpro_git
    Given kullanici_"techproed_Url"_sayfasina_gider

  Scenario: TC01_Techpro_Sayfasinda_Selenium_Aratma
    Then reklami_kapatir
    When arama_kutusunda_"Selenium"_aratir
    And kullanici_tum_sayfanin_resmini_alir
    And kullanici_2_saniye_bekler
    Then sayfayi_kapatir

  Scenario: TC02_Techpro_Sayfasinda_Sql_Aratma
    Then reklami_kapatir
    When arama_kutusunda_"Sql"_aratir
    Then title'in "Sql" icerdigini dogrula
    And kullanici_2_saniye_bekler
    Then sayfayi_kapatir
