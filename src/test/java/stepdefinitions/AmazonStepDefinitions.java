package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage;

    @Given("kullanici amazona gider")
    public void kullaniciAmazonaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("kullanici iphone için arama yapar")
    public void kullaniciIphoneIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sayfa basliginin iphone icerdigini test eder")
    public void sayfaBasligininIphoneIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));
    }
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }



    @When("kullanici selenium için arama yapar")
    public void kullaniciSeleniumIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("selenium", Keys.ENTER);
    }

    @Then("sayfa basliginin selenium icerdigini test eder")
    public void sayfaBasligininSeleniumIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }

    @When("kullanici java için arama yapar")
    public void kullaniciJavaIçinAramaYapar() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("java", Keys.ENTER);
    }

    @Then("sayfa basliginin java icerdigini test eder")
    public void sayfaBasligininJavaIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("java"));
    }

    @Given("kullanici {string} gider")
    public void kullaniciGider(String girilenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(girilenUrl));
    }

    @When("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String string) {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(string, Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}