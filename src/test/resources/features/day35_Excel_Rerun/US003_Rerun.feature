Feature: US003 Amazon Testi
  @rerun
  Scenario: Amazonda Urun Arat
    Given kullanici_"amazon_Url"_sayfasina_gider
    And arama_kutusunda_"iphone"_aratir
    And basligin "java" icerdigini test eder