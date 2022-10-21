#Author: edcarlos20@hotmail.com


Feature: Testes positivos e negativos e login 
  
  @Test
  Scenario: Teste Positivo
    
    When que eu me cadastre com dados validos
    And e click no botao enviar formulario
    Then tiro evidencia e guardo na pasta destinada.

  @Test
  Scenario: Teste Negativo
    
    When que eu me cadastre com dados invalidos
    And e click no botão enviar formulario
    Then tiro evidencia e guardo na pasta destinada.
    
  @Test
  Scenario: Teste Login
    
    When que eu logue com dados validos
    And e click no botão enviar formulario
    Then sou direcionado para a tela de produtos
    And tiro evidencia e guardo na pasta destinada.
