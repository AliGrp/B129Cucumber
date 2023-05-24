Feature: BlueRentalCar Excel Login
  Scenario: TC01 Positive Login Testi
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    And kullanici exceldeki "customer_info" sayfasindaki kullanici bilgileri ile login olur
  Scenario: TC01 Positive Login Testi
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    And kullanici exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olur