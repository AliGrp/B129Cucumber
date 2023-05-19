package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici_amazon_sayfasina_gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
    }

    @And("arama_kutusunda_iphone_aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sayfayi_kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("arama_kutusunda_Selenium_aratir")
    public void arama_kutusunda_selenium_aratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }

    @And("arama_kutusunda_Java_aratir")
    public void arama_kutusunda_java_aratir() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("arama_kutusunda_SQL_aratir")
    public void arama_kutusunda_sql_aratir() {
        amazonPage.aramaKutusu.sendKeys("SQL", Keys.ENTER);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
}
