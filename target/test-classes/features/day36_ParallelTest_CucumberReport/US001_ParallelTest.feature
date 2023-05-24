
Feature:US001 TechproEducation Sayfasi Testi
  Background: Techpro_git
    Given kullanici_"techproed_Url"_sayfasina_gider

  @techpro1
  Scenario: TC01_Techpro_Sayfasinda_Selenium_Aratma
    Then reklami_kapatir
    When arama_kutusunda_"Selenium"_aratir
    And kullanici_2_saniye_bekler
    Then sayfa_basliginin_QA_icerdigini_test_eder

  @techpro2
  Scenario: TC02_Techpro_Sayfasinda_Sql_Aratma
    Then reklami_kapatir
    When arama_kutusunda_"Sql"_aratir
    Then title'in "Sql" icerdigini dogrula
    And kullanici_2_saniye_bekler
    Then sayfa_basliginin_Sql_icerdigini_test_eder
