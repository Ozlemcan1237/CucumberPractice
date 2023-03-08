package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //test calistirici notasyon
@CucumberOptions( //senaryolarin nerede ve nasil calisacagi, hangi raporu kullanilmasi ile alakali secenekleri ayarlar
     plugin = {"html:src/test/resources/reports/gp1gp2gp3gp4.html"},
      features ="./src/test/resources/features" , //features'in yolunu belirtmemiz gerekir
      glue =   {"stepdefinitions","hooks"}, //kodlarimizi yazdigimiz yeri belirtiriz
      tags = "@gp1 or @gp2 or @gp3 or @gp4", //calistirmak istedigimiz senaryoya verdigimiz tag'i belirtiriz
      dryRun = false //senaryo adimlarini kontrol eder ve calistirdigini goruruz
)

public class Runner {
}
