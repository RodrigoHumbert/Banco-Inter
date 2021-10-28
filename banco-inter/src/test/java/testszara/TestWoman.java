package testszara;

import elementozara.ElementoWoman;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodozara.MetodoWoman;

public class TestWoman {
	
	ElementoWoman el = new ElementoWoman();
	MetodoWoman met = new MetodoWoman();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String string) {
	   met.abrirNavegador(string, string);
	}

	@When("clicar na funcionalidade Woman")
	public void clicar_na_funcionalidade_woman() {
	   met.clicarMenu(el.getMenu());
	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {
	   
	}
		
}

