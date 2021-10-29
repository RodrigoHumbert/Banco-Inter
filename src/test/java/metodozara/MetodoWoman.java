package metodozara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodoWoman {
	
	WebDriver driver;
	
	public void abrirNavegador(String Texto, String Passo) {
		try {
	System.getProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.zara.com/br/");
	driver.manage().window().maximize();
		}catch (Exception e) {
			System.err.print(".....erro ao abri navegador" + e.getMessage());
			System.err.print(".....causa do erro ....." + e.getCause());
		}
	}
	
	public void clicarMenu(By elemento) {
		try {
		driver.findElement(elemento).click();
		}catch (Exception e) {
			System.err.print(".....erro ao clicar" + e.getMessage());
			System.err.print(".....causa do erro ....." + e.getCause());
		}
	}

}
