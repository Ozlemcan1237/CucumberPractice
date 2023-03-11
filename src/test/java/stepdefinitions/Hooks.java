package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

/*
Senaryolar arasındaki baglantıyı saglayan glue yapısına koydugumuz stepdefinition package i içerisinde
 @before ve @after gibi bir notasyon varsa extends testbase demenize gerek kalmadan her senaryodan
 önce veya sonra bu methodlar calisacaktir.
 Cucumber da @before,@after kullanma ihtiyacımız olursa bunu hooks class ına koyarız.
 */
public class Hooks {

    @Before("@gp1")
    public void setUp1() {
        System.out.println("Amazonda IPHONE aramasi yapildi");
    }

    @Before("@gp2")
    public void setUp2() {
        System.out.println("Amazonda SELENIUM aramasi yapildi");
    }

    @Before("@gp3")
    public void setUp3() {
        System.out.println("Amazonda JAVA aramasi yapildi");
    }

    @Before("@gp4")
    public void setUp4() {
        System.out.println("Amazon sayfasi kapatildi");
    }

    @After
    public void tearDown(Scenario scenario) {
        //final -> bir degiskenin degerinin degistirilemez oldugunu belirtir
        //byte[] -> bir byte dizisi tanımlar.Byte dizeleri sıralı veri depolama ve isleme islemleri icin
       //kullanilir.Verilerin depolanmasi,iletilmesi ve okunmasi icin kullanilan cesitli dosya türleri
       //resimler ve diger verileri saklamak icin kullanilir.
        final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(failedScreenshot,"image/png","fail_screenshot");
        }
        Driver.closeDriver();
    }
}
