package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechproPage techproPage = new TechproPage();
    @Given("kullanici_techpro_sayfasina_gider")
    public void kullanici_techpro_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));

    }

    @And("arama_kutusunda_QA_aratir")
    public void arama_kutusunda_qa_aratir() {
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @And("sayfa_basliginin_QA_icerdigini_test_eder")
    public void sayfa_basliginin_qa_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }

    @Then("reklami_kapatir")
    public void reklami_kapatir() {
        techproPage.reklamiKapat.click();
    }

    @Given("kullanici_{string}_sayfasina_gider")
    public void kullanici__sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("arama_kutusunda_{string}_aratir")
    public void arama_kutusunda__aratir(String aranacakDeger) {
        techproPage.aramaKutusu.sendKeys(aranacakDeger,Keys.ENTER);
    }

    @And("kullanici_tum_sayfanin_resmini_alir")
    public void kullanici_tum_sayfanin_resmini_alir() {
        ReusableMethods.tumSayfaResmi("TumSayfaResmi");
    }
}
