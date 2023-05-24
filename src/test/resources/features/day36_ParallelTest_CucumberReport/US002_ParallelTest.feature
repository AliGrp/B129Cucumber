Feature:US001 TechproEducation Sayfasi Testi
  Background: Techpro_git
    Given kullanici_"techproed_Url"_sayfasina_gider

  @techpro3
  Scenario: TC01_Techpro_Sayfasinda_Selenium_Aratma
    Then reklami_kapatir
    And kullanici_2_saniye_bekler
    When arama_kutusunda_"Python"_aratir

