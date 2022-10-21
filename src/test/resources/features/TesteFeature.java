package teste;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@regressivo",
		monochrome = true,
		dryRun = true,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
		snippets = SnippetType.CAMELCASE
						
		)

public class TesteFeature {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.gsuplementos.com.br/checkout/acesso/");
	driver.manage().window().maximize();	

}
