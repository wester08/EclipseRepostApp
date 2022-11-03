package com.repostapp.abastecimiento;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SolicitudAbastecimientoTest4 extends SolicitudAbastecimiento {

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
	public void test4() throws InterruptedException {
		/////Aprobar Solicitudes lado Admin
		Thread.sleep(2000);
		driver.findElement(RepostAppPageLocator).isDisplayed(); {
			driver.findElement(UserNameLocator).sendKeys("401399");
			driver.findElement(PasswordLocator).sendKeys("401399");
			driver.findElement(BtnEntrar).click();
			
			Thread.sleep(2000);	
			driver.findElement(HomePageLocator).isDisplayed();
			driver.findElement(ConsultaSolicitud).click();
			driver.findElement(SolicitudEspera).click();
			Thread.sleep(3000);
			driver.findElement(FiltrarSolicitud).sendKeys("CON-0146");
			Thread.sleep(3000);
			driver.findElement(BtnVerAdmin).click();
			Thread.sleep(2000);
			driver.findElement(BtnAprobar).click();
			Thread.sleep(2000);
			driver.findElement(BtnAceptar).click();
			Thread.sleep(5000);
			
			
			
			
			
		}
		
	}	

}