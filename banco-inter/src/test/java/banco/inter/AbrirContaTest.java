package banco.inter;

import elemento.inter.ElementoInterTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.test.MetodosDeTests;

	
public class AbrirContaTest {
	
	MetodosDeTests metodos = new MetodosDeTests();
	ElementoInterTest el = new ElementoInterTest();

	@Given("que eu acesse o site do banco inter {string}")
	public void que_eu_acesse_o_site_do_banco_inter(String site) {
		metodos.abrirNavegador(site);
		
	}
	

	@When("preencher dados para abrir conta")
	public void preencher_dados_para_abrir_conta() throws InterruptedException {
		
		metodos.clicar(el.getAcessarConta());
		Thread.sleep(2000);
		metodos.escrever(el.getNome(), "ergigail");
		metodos.escrever(el.getFone(), "11 94568-7910");
		metodos.escrever(el.getEmail(), "erigail@gmail.com");
		metodos.escrever(el.getCpf(), "217.473.960-79");
		metodos.escrever(el.getDataDeNasc(), "05/01/1980");
		metodos.clicar(el.getCookes());
		metodos.clicar(el.getPrivacidade());
		metodos.clicar(el.getContinuar());
	}

	@Then("validar formulario")
	public void validar_formulario() {
	    
	}
}
