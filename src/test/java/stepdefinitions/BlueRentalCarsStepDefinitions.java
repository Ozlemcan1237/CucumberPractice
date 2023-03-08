package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.BlueRentalCarsPage;
import utilities.Driver;

public class BlueRentalCarsStepDefinitions {

    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici login sayfasina gider")
    public void kullaniciLoginSayfasinaGider() {
        blueRentalCarsPage.loginButton.click();
    }

    @And("kullanici email {string} girer")
    public void kullaniciEmailGirer(String string) {
        blueRentalCarsPage.email.sendKeys(string);
    }

    @And("kullanici sifre {string} girer")
    public void kullaniciSifreGirer(String string) {
        blueRentalCarsPage.password.sendKeys(string);
    }

    @And("login butonuna basar")
    public void loginButonunaBasar() {
        blueRentalCarsPage.loginKaydol.click();
    }



//    @And("login {string} islemi gerceklesir")
//    public void loginIslemiGerceklesir(String string) {
//        //Driver.wait(1);
//        // Assert.assertTrue(blueRentalCarsPage.nameBox.getText().contains(string));
//        //Assert.assertTrue(Driver.waitAndGetText(blueRentalCarsPage.nameBox,10).contains(string));
//        //Assert.assertTrue(Driver.getDriver().getPageSource().contains(string));
//        Select select = new Select(blueRentalCarsPage.nameBox);
//        Assert.assertTrue(select.toString().contains(string));
//
//    }
}
