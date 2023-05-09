@MedunnaRoom
Feature:Medunna Oda Olusturma

  Background: Admin Olarak Giris Yap
    Given "https://www.medunna.com" adresine git
    When kullanici simgesini tikla
    And sign in secenegini tikla
    And username kutusuna "kullanici_Adi" gir
    And password kutusuna "kullanici_Sifre" gir
    And remember me radio button'a tikla
    And sign in button'a tikla

  Scenario Outline:Oda Olustur
    When items&titles sekmesine tikla
    And room secenegine tikla
    And create a new room butonunu tikla
    And room number kutusuna "<roomNumber>"
    And room type drop down'dan "<Room Type>" sec
    And price kutusuna "<price>"
    And description kutusuna "<description>" gir
    And save button'a tikla
    Then kaydedildi alertini dogrula
    And sayfayi_kapatir
    Examples:
      | roomNumber | Room Type      | price | description   |
      | 1349205136 | DELUXE         | 12    | Temiz Oda     |
      | 1433806127 | PREMIUM_DELUXE | 20    | Guzel Oda     |
      | 1347407128 | SUITE          | 10    | Manzarali Oda |
      | 1436068129 | DAYCARE        | 8    | Temiz Oda     |

