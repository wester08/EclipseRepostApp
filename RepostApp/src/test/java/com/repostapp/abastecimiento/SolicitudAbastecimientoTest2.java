package com.repostapp.abastecimiento;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SolicitudAbastecimientoTest2 extends SolicitudAbastecimiento {
	
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
		driver.quit();
	}

	@Test
	public void test2() throws InterruptedException {
		/////Trabajar Solicitud lado Sacador
		Thread.sleep(2000);
	
	    driver.findElement(RepostAppPageLocator).isDisplayed(); {
		driver.findElement(UserNameLocator).sendKeys("400001");
		driver.findElement(PasswordLocator).sendKeys("400001");
		driver.findElement(BtnEntrar).click();
	
		Thread.sleep(2000);	
		driver.findElement(HomePageLocator).isDisplayed();
		driver.findElement(BtnTrabajarSolicitudes).click();
		driver.findElement(PendienteTrabajar).click();
		Thread.sleep(3000);
		driver.findElement(FiltrarSolicitud).sendKeys("CON-0145");
		Thread.sleep(3000);
		driver.findElement(BtnVer).click();

		driver.findElement(CodigoProducto).click();
		Thread.sleep(2000);
		driver.findElement(ProductoSacador).click();
		Thread.sleep(2000);
		driver.findElement(CantidadTrabajar).click();
		Thread.sleep(2000);
		driver.findElement(Cantidad).sendKeys("56");
		driver.findElement(CheckList).click();
		
		driver.findElement(BtnCompletar).click();
		Thread.sleep(4000);
	
	}
	
	}
}
	

