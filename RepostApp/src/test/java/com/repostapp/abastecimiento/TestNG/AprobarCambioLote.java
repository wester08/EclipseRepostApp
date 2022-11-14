package com.repostapp.abastecimiento.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AprobarCambioLote extends Abastecimiento {
	
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
	public void test4() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(RepostAppPageLocator).isDisplayed(); {
			driver.findElement(UserNameLocator).sendKeys("401399");
			driver.findElement(PasswordLocator).sendKeys("401399");
			driver.findElement(BtnEntrar).click();
			
			Thread.sleep(2000);	
			driver.findElement(HomePageLocator).isDisplayed();
			driver.findElement(ConsultaSolicitud).click();
			Thread.sleep(2000);	
			driver.findElement(EnProgresoAdmin).click();
			Thread.sleep(3000);
			driver.findElement(FiltrarSolicitud).sendKeys("CON-0172");
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
