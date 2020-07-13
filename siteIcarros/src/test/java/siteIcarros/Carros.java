// 1 - Pacote
package siteIcarros;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//2 - Bibliotecas
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//3 - Classe
public class Carros {
	// 3.1 Atributos / Característica
	String url;				// endereço do site alvo
	WebDriver driver;		// objeto do Selenium WebDriver
	
	// 3.2 Métodos ou Funções
	@Before
	public void iniciar() {
		url = "https://www.icarros.com.br";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DaianeFigueiredo\\iterasys-workspace\\siteIterasys\\drivers\\chrome\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	@Test
	public void consultarCarros() {
		// Home - Página Inicial
		driver.get(url);		// Abrir o Navegador na página indicada na url
		//Desmarcando a opção 0Km
		driver.findElement(By.id("anunciosNovos")).click(); 
		
		//Escrevendo Fiat no campo Marca
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/button")).sendKeys(Keys.chord("Fiat")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(60000000, TimeUnit.MILLISECONDS);
		//Escrevendo Palio no campo Modelo
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("Palio")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
	
		
		//Escrevendo Palio no campo Modelo
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("Palio")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo ano min.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[1]/div/div/div/div/button")).sendKeys(Keys.chord("2015")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[1]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo ano max.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("2015")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo preço min.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[3]/div/div/div/div/button")).sendKeys(Keys.chord("20")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[3]/div/div/div/div/button")).sendKeys(Keys.ENTER);
		
		//Escrevendo preço max.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[4]/div/div/div/div/button")).sendKeys(Keys.chord("30")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[4]/div/div/div/div/button")).sendKeys(Keys.ENTER);
		
		//Localização
		driver.findElement(By.id("cidadeAbertoTexto")).click();
		driver.findElement(By.id("localizacaoEstado")).click(); 
				
		//Clicando em Buscar
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[4]/div[2]/button")).click();
		
		
		//Clicando em ordenar por Preço crescente
		WebElement element = driver.findElement(By.id("ordemfim"));
		Select combo = new Select(element);
		combo.selectByValue("4");
		driver.manage().timeouts().implicitlyWait(9000000, TimeUnit.MILLISECONDS);
	
		
		// RESULTADO ESPERADO
		
		// Validando Marca e Modelo do 1º Carro da lista
		String nome = "Fiat Palio Fire 1.0 8V (Flex) 2p";
		assertEquals(nome, driver.findElement(By.xpath("//*[@id=\"ac29842624\"]/div/a/h2")).getText());
		
		// Validando Marca e Modelo do 2º Carro da lista
	    assertEquals(nome, driver.findElement(By.xpath("//*[@id=\"ac30138691\"]/div/a/h2")).getText());
	    
		// Validando Marca e Modelo do 3º Carro da lista
	    assertEquals(nome, driver.findElement(By.xpath("//*[@id=\"ac30138899\"]/div/a/h2")).getText());
		
	    driver.quit();
	}
	@Test
	public void consultarModelovalor() {
		// Home - Página Inicial
		driver.get(url);		// Abrir o Navegador na página indicada na url
		//Desmarcando a opção 0Km
		driver.findElement(By.id("anunciosNovos")).click(); 
		
		//Escrevendo Fiat no campo Marca
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/button")).sendKeys(Keys.chord("Fiat")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		driver.manage().timeouts().implicitlyWait(60000000, TimeUnit.MILLISECONDS);
		//Escrevendo Palio no campo Modelo
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("Palio")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
	
		
		//Escrevendo Palio no campo Modelo
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("Palio")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo ano min.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[1]/div/div/div/div/button")).sendKeys(Keys.chord("2015")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[1]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo ano max.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[2]/div/div/div/div/button")).sendKeys(Keys.chord("2015")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[2]/div/div/div/div/button")).sendKeys(Keys.ENTER);	
		
		//Escrevendo preço min.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[3]/div/div/div/div/button")).sendKeys(Keys.chord("20")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[3]/div/div/div/div/button")).sendKeys(Keys.ENTER);
		
		//Escrevendo preço max.
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[4]/div/div/div/div/button")).sendKeys(Keys.chord("30")); 
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[3]/div[4]/div/div/div/div/button")).sendKeys(Keys.ENTER);
		
		//Localização
		driver.findElement(By.id("cidadeAbertoTexto")).click();
		driver.findElement(By.id("localizacaoEstado")).click(); 
				
		//Clicando em Buscar
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[4]/div[2]/button")).click();
		driver.navigate().refresh();
		
		//Clicando em ordenar por Preço crescente
		WebElement element = driver.findElement(By.id("ordemfim"));
		Select combo = new Select(element);
		combo.selectByValue("4");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
		
		
		// RESULTADO ESPERADO
		
		// Validando Modelo e valor do 1º Carro da lista
		String nome = "Fiat Palio Fire 1.0 8V (Flex) 2p";
		assertEquals(nome, driver.findElement(By.xpath("//*[@id=\"ac29842624\"]/div/a/h2")).getText());
	    driver.findElement(By.xpath("//*[@id=\"ac29842624\"]/div/a/h2")).click();
		String valor1 = "R$ 20.300,00";
		assertEquals(valor1, driver.findElement(By.xpath("//*[@id=\"cardProposta\"]/div/h2")).getText());
		
		// Voltar pra lista
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/ul/li[1]/span[2]/a/span")).click();
		//Clicando em ordenar por Preço crescente
		WebElement element1 = driver.findElement(By.id("ordemfim"));
		Select combo1 = new Select(element1);
		combo1.selectByValue("4");
		driver.navigate().refresh();
		WebElement element2 = driver.findElement(By.id("ordemfim"));
		Select combo2 = new Select(element2);
		combo2.selectByValue("4");
		
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
		// Validando Modelo e valor do 2º Carro da lista
	    assertEquals(nome, driver.findElement(By.xpath("//*[@id=\"ac30138691\"]/div/a/h2")).getText());
	    driver.findElement(By.xpath("//*[@id=\"ac30138691\"]/div/a/h2")).click();
		String valor2 = "R$ 20.800,00";
		assertEquals(valor2, driver.findElement(By.xpath("//*[@id=\"cardProposta\"]/div/h2")).getText());

	    driver.quit();
	}

}
