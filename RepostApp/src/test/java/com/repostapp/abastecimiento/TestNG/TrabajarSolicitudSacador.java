package com.repostapp.abastecimiento.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TrabajarSolicitudSacador extends Abastecimiento {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		
		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("http://10.1.0.7:9810/"); 
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void test3() throws InterruptedException {

		Thread.sleep(2000);
	
	    driver.findElement(RepostAppPageLocator).isDisplayed(); {
		driver.findElement(UserNameLocator).sendKeys("400003");
		driver.findElement(PasswordLocator).sendKeys("400003");
		driver.findElement(BtnEntrar).click();
	
		Thread.sleep(2000);	
		driver.findElement(HomePageLocator).isDisplayed();
		driver.findElement(BtnTrabajarSolicitudes).click();
		driver.findElement(PendienteTrabajar).click();
		Thread.sleep(3000);
		driver.findElement(FiltrarSolicitud).sendKeys("CON-0024");
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
	

