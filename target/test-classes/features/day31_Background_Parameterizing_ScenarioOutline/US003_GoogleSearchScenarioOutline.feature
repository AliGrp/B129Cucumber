@GoogleSearchScenarioOutline
Feature: Google Search
  Background: kullanici_google_anasayfaya_gider
    Given kullanici_google_anasayfaya_gider

  Scenario Outline: Google_aramalari
    When kullanici googleda "<Aranacak_Kelime>" aratir
    And kullanici_tum_sayfanin_resmini_alir
    Then title'in "<Aranacak_Kelime>" icerdigini dogrula
    And kullanici_3_saniye_bekler
    And sayfayi_kapatir
    Examples:
      | Aranacak_Kelime |
      | java |
      | selenium |
      | sql |
