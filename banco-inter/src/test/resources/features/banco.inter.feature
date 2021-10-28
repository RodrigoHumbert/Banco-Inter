#Author: rodrigohumbert2020@gmail.com

Feature:conta digital no banco inter
 Como ususario quero enviar o formulario de abertura de conta para abrir uma nova conta

  
  Scenario: Enviar formulario de abertura de conta
    Given que eu acesse o site do banco inter "https://www.bancointer.com.br"
    When preencher dados para abrir conta
    Then validar formulario
  