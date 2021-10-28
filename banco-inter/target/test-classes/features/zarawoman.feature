#Author: rodrigohumbert2020@gmail.com.br

Feature: Realizar pesquisa no site ZARA
	Eu como ususario quero realizar uma pesquisa no site ZARA

  @tag1
  Scenario: Pesquisar menu Woman no site Zara
    Given que eu esteja no "https://www.google.com/br/"
    When clicar na funcionalidade Woman 
    Then valido as informacoes
