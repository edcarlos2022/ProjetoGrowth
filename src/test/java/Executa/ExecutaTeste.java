package Executa;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import Metodos.MetodosDeTestes;
import io.cucumber.java.After;

public class ExecutaTeste  {

	MetodosDeTestes metodos = new MetodosDeTestes();	

	@Before
	public void setUp() throws IOException, Exception  {
	//metodos.abrirNavegadorLogin();
	
	}
	@After
	public void tearDown()throws IOException, Exception   {
	metodos.fecharNavegador();		
	}
	@Test
	public void testesNegativos() throws InterruptedException, IOException {
		metodos.cadastroComDadosInvalidos();
		metodos.btnEnviar();
		metodos.zoom50 ();		
		metodos.screenShot("dadosInvalidos");
		metodos.zoom100();	
	}
	@Test
	public void testesPositivos() throws IOException {
		metodos.abrirNavegadorCadastro();
		metodos.cadastroComDadosValidos();
		metodos.zoom50 ();		
		metodos.screenShot("dadosValidos");
		metodos.zoom100();		
	}
	@Test
	public void TesteLogar() throws IOException, Exception {
	metodos.logar();
	metodos.zoom50 ();		
	metodos.screenShot("Logando");
	metodos.zoom100();		
	}
}
