package com.repostapp.abastecimiento;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SolicitudAbastecimientoTest3 extends SolicitudAbastecimiento {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		//driver.manage().window().maximize();
	    driver.get("http://10.1.0.7:9810/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test3() throws InterruptedException {
		/////Solicitar cambio de lote lado sacador
		Thread.sleep(2000);
		
			driver.findElement(RepostAppPageLocator).isDisplayed(); {
			driver.findElement(UserNameLocator).sendKeys("400001");
			driver.findElement(PasswordLocator).sendKeys("400001");
			driver.findElement(BtnEntrar).click();
			
			Thread.sleep(2000);	
			driver.findElement(HomePageLocator).isDisplayed();
			driver.findElement(BtnTrabajarSolicitudes).click();
			driver.findElement(PendienteTrabajar).click();
			//driver.findElement(EnProgreso).click();
			Thread.sleep(4000);
			driver.findElement(FiltrarSolicitud).sendKeys("CON-0148");
			Thread.sleep(3000);
			driver.findElement(BtnVer).click();
			Thread.sleep(2000);
			
			driver.findElement(BtnCambiarLote).click();
			Thread.sleep(2000);
			driver.findElement(BtnTipoLote).click();
			Thread.sleep(2000);
			driver.findElement(Parcial).click();
			Thread.sleep(2000);
			driver.findElement(TextBoxCantSolicitad).click();
			Thread.sleep(3000);
			
			WebElement toClear = driver.findElement(By.xpath("//*[@id=\"cdk-overlay-1\"]/nz-modal-container/div/div/div[2]/div/div[1]/nz-card/div/form/nz-input-group[2]/div/div[2]/nz-input-group/span/nz-input-number/div[2]/input"));
			toClear.sendKeys(Keys.CONTROL + "a");
			toClear.sendKeys(Keys.DELETE);
			
			Thread.sleep(2000);
			driver.findElement(TextBoxCantSolicitad).sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(TextBoxLoteNuevo).click();
			Thread.sleep(2000);
			driver.findElement(LoteNuevo).click();
			Thread.sleep(2000);
			driver.findElement(TextBoxMotivos).click();
			Thread.sleep(2000);
			driver.findElement(Motivo).click();
			driver.findElement(BtnSolicitarCL).click();
			Thread.sleep(5000);
			
			
			}
	}
	
}