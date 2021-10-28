package elemento.inter;

import org.openqa.selenium.By;

public class ElementoInterTest {


	private By AcessarConta = By.cssSelector("#gatsby-focus-wrapper > div > header > div > div > div.header-items > div > button");
	private By Nome = By.id("nome");
	private By Fone = By.id("celular");
	private By Email = By.id("email");
	private By Cpf = By.id("cpf");
	private By DataDeNasc = By.id("dataNascimento");
	private By Cookes = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
	private By Privacidade = By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[6]/div/label");
	private By Continuar = By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[7]/button");
		
	
	
	public By getAcessarConta() {
		return AcessarConta;
	}
	public By getNome() {
		return Nome;
	}
	public By getFone() {
		return Fone;
	}
	public By getEmail() {
		return Email;
	}
	public By getCpf() {
		return Cpf;
	}
	public By getDataDeNasc() {
		return DataDeNasc;
	}
	public By getCookes() {
		return Cookes;
	}
	public By getPrivacidade() {
		return Privacidade;
	}
	public void setPrivacidade(By privacidade) {
		Privacidade = privacidade;
	}
	public By getContinuar() {
		return Continuar;
	}
	
	
}
