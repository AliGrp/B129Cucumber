Feature: Add New Coupons

  Background: Hubcomfy sitesinde kupon olusturabilmeliyim
    Given kullanici_"hubcomfy_Url"_sayfasina_gider
    * kullanici "userNameV" ve "passwordV" girerek login olur

  Scenario Outline: kupon olustur
    *  signOut butonu gorunurmu dogrula
    * kullanici signOut butonuna tiklar
    * kullanici store manager butonuna tiklar
    * kullanici coupons butonunda add new secenegine tiklar
    * kullanici code textine "<code>" girer
    * kullanci desc textine "<desc>" girer
    * kullanici discount type dmm'den "Fixed Product Discount" secer
    * kullanici coupon amaount textine "<miktar>" girer
    * kullanici expiry date textine "<YYYY-MM-DD>" girer
    * kullanici Allow free shipping radio butonunu secer
    * kullanici Show on store radio butonunu secer
    * kullanici submit butonuna tiklar
    Then coupon basarili bir sekilde uretildigine dair mesaji dogrular
    * kullanici coupons secenegine tiklar couponslari gorur
    * sayfayi_kapatir

    Examples:
      | code       | desc           | miktar | YYYY-MM-DD |
      | abc-123    | indirim kuponu | 10     | 2023-05-18 |
      | gift-12-34 | hediye50       | 100    | 2023-04-01 |
      | 97864323   | ucretsiz       | elli2  | 2012-01-23 |



