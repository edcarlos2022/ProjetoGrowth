package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	String invalidName = "&d C@rl8$ d@ $ilv@";
	String invalidCpf = "2222222222";
	String emailInvalido = "ed!carlo$hotmail.com.br";
	String invalidData = "01081800";
	String invalidFone = "01132323456";
	String invalidCel = "01191234567";
	String invalidSenha = "12345678";
	// dados invalidos
	By clicarFixo = By.xpath("//div[text()='Telefone fixo']");

	By escreverTelefFixo = By.xpath("//input[@id='tel-fixo-cadastro']");
	By clicarTelefCelular = By.xpath("//div[text()='Telefone celular *']");
	By escreverTelefCelular = By.xpath("//input[@id='celular-cadastro']");
//dados validos
	String nome = "Arthur Renan Arthur Drumond";
	String email = "arthur_drumond@grupoitaipu.com.br";
	String fixo = "0113862-4687";
	String celular = "01198854-8798";
	String Senha = "224488";
	String url = "https://www.gsuplementos.com.br/checkout/acesso/";
	String cpfEscrever = "15524345834";
	String cpfClicar = "//input[@id='form-validation-field-0']";
	String data = "11/03/1989";
//login
	By entrar = By.xpath("//button[@type='submit']");
	By clicarSenha = By.xpath("//input[@id='form-validation-field-1']");
	By digitarSenha = By.xpath("//input[@id='form-validation-field-1']");
	By btnEnviar = By.xpath("//button[@type='submit']");
	By clicarSenhaCadastro = By.xpath("//div[text()='Senha * (6 ou mais caracteres)']");
	By inserirSenha = By.xpath("//input[@id='senha-cadastro']");
	By clicarSenhaLogin = By.xpath("//div[text()='Senha']");
	By escreverSenhaLogin = By.name("//input[@type='password']");////input[@id='form-validation-field-1']
	By clickCapcha = By.xpath("//div[@class='recaptcha-checkbox-checkmark']");
	By clickCpfOuEmail = By.xpath("//div[@class='mainBox-conteudo-form-input-label labelCadastro']");
	
	public By getClicarSenhaLogin() {
		return clicarSenhaLogin;
	}

	public By getEscreverSenhaLogin() {
		return escreverSenhaLogin;
	}

	public By getClickCpfOuEmail() {
		return clickCpfOuEmail;
	}

	public By getClickCapcha() {
		return clickCapcha;
	}

	public By getInserirSenha() {
		return inserirSenha;
	}

	public By getBtnEnviar() {
		return btnEnviar;
	}

	public By getClicarSenhaCadastro() {
		return clicarSenhaCadastro;
	}

	public String getInvalidName() {
		return invalidName;
	}

	public String getInvalidCpf() {
		return invalidCpf;
	}

	public String getEmailInvalido() {
		return emailInvalido;
	}

	public String getInvalidData() {
		return invalidData;
	}

	public String getInvalidFone() {
		return invalidFone;
	}

	public String getInvalidCel() {
		return invalidCel;
	}

	public String getInvalidSenha() {
		return invalidSenha;
	}

	public By getClicarFixo() {
		return clicarFixo;
	}

	public By getEscreverTelefFixo() {
		return escreverTelefFixo;
	}
	
	public By getEscreverTelefCelular() {
		return escreverTelefCelular;
	}

	public By getClicarTelefCelular() {
		return clicarTelefCelular;
	}


	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getFixo() {
		return fixo;
	}

	public String getCelular() {
		return celular;
	}

	public String getSenha() {
		return Senha;
	}

	public String getUrl() {
		return url;
	}

	public String getCpfEscrever() {
		return cpfEscrever;
	}

	public String getCpfClicar() {
		return cpfClicar;
	}

	public String getData() {
		return data;
	}

	public By getEntrar() {
		return entrar;
	}

	public By getClicarSenha() {
		return clicarSenha;
	}

	public By getDigitarSenha() {
		return digitarSenha;
	}

}
