package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.Elementos;

public class MetodosDeTestes extends Elementos {

	static WebDriver driver;
	Elementos el = new Elementos();

	public void abrirNavegadorCadastro() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gsuplementos.com.br/checkout/cadastro");
		driver.manage().window().maximize();

	}

	public void abrirNavegadorLogin() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gsuplementos.com.br/checkout/acesso/");
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void btnEnviar() {
		driver.findElement(getBtnEnviar()).click();

	}

	public void zoom50() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '0.5'");
	}

	public void zoom100() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '1.0'");
	}

	public void screenShot(String nome) throws IOException {
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(screenFile, destFile);

	}

	public void cadastroComDadosValidos() {
		
		//email
		driver.findElement(By.xpath("//input[@id='email-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='email-cadastro']")).sendKeys(getEmail());
		// cpf
		driver.findElement(By.xpath("//input[@id='cpf-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='cpf-cadastro']")).sendKeys(el.getCpfEscrever());
		// nome
		driver.findElement(By.xpath("//input[@id='nome-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='nome-cadastro']")).sendKeys(el.getNome());
		// data
		driver.findElement(By.xpath("//input[@id='data-nascimento-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='data-nascimento-cadastro']")).sendKeys(el.getData());
		// scrollBy
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "");

		// label promocoes
		driver.findElement(By.xpath("//label[@for='whatsappPromocional']")).click();
		driver.findElement(By.xpath("//label[text()='Quero atualizações de pedido via WhatsApp.']")).click();
		// label sexo
		driver.findElement(By.xpath("//label[text()='Masculino']")).click();
		driver.findElement(getClicarFixo()).click();
		driver.findElement(getEscreverTelefFixo()).sendKeys(getFixo());
		// telefone celular
		driver.findElement(getClicarTelefCelular()).click();
		driver.findElement(getEscreverTelefCelular()).sendKeys(getCelular());
		// senha
		driver.findElement(getClicarSenhaCadastro()).click();
		driver.findElement(getInserirSenha()).sendKeys(getSenha());


	}

	public void cadastroComDadosInvalidos() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gsuplementos.com.br/checkout/cadastro");
		driver.manage().window().maximize();
		// email
		driver.findElement(By.xpath("//input[@id='email-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='email-cadastro']")).sendKeys("edcarlos#$!hotmail.com");
		driver.findElement(By.xpath("//input[@id='cpf-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='cpf-cadastro']")).sendKeys("12345555");
		// nome
		driver.findElement(By.xpath("//input[@id='nome-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='nome-cadastro']")).sendKeys("&d C@rlo$ d@ $ilva");
		// data
		driver.findElement(By.xpath("//input[@id='data-nascimento-cadastro']")).click();
		driver.findElement(By.xpath("//input[@id='data-nascimento-cadastro']")).sendKeys("01081700");
		// scrollBy
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "");

		// label promocoes
		driver.findElement(By.xpath("//label[@for='whatsappPromocional']")).click();
		driver.findElement(By.xpath("//label[text()='Quero atualizações de pedido via WhatsApp.']")).click();
		// label sexo
		driver.findElement(By.xpath("//label[text()='Masculino']")).click();
		// telefone fixo
		driver.findElement(getClicarFixo()).click();
		driver.findElement(getEscreverTelefFixo()).sendKeys(getInvalidFone());
		// telefone celular
		driver.findElement(getClicarTelefCelular()).click();
		driver.findElement(getEscreverTelefCelular()).sendKeys(getInvalidCel());
		// senha
		driver.findElement(getClicarSenhaCadastro()).click();
		driver.findElement(getInserirSenha()).sendKeys(getInvalidSenha());

	}

	public void logar() throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gsuplementos.com.br/checkout/acesso/");
		driver.manage().window().maximize();
		
		System.out.println("passou1");
		// email
		driver.findElement(By.xpath("//div[text()='E-mail ou CPF']")).click();
		driver.findElement(By.name("email")).sendKeys(el.getEmail());
		System.out.println("passou2");
		driver.findElement(getBtnEnviar()).click();
		System.out.println("passou3");
		//senha
		Thread.sleep(2000);
		driver.findElement(getClicarSenhaLogin()).click();
		System.out.println("passou4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("224488");
		System.out.println("passou5");
		Thread.sleep(2000);
		driver.findElement(getBtnEnviar()).click();
		
	}

}
