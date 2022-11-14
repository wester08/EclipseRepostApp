package com.repostapp.abastecimiento.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class RealizarSolicitud extends Abastecimiento {

	private WebDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {

		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.1.0.7:9810/");
	}

	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(RepostAppPageLocator).isDisplayed();
		driver.findElement(UserNameLocator).sendKeys("401579");
		driver.findElement(PasswordLocator).sendKeys("401579");
		driver.findElement(BtnEntrar).click();

		Thread.sleep(4000);
		driver.findElement(HomePageLocator).isDisplayed();
		driver.findElement(BtnRealizarSolicitud).click();
		driver.findElement(dropdownList_TipoSolicitud).click();
		driver.findElement(OptionConsolidado).click();
		Thread.sleep(3000);
		assertTrue(driver.findElement(ElementPresent).isDisplayed());
		////////////////////////////////////////////////////////////////
		driver.findElement(CodigoProducto).click();
		driver.findElement(TextBoxProduct).sendKeys("PARAMOX MAX JBE / 125 mL");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div"))
				.click();
		Thread.sleep(2000);
		driver.findElement(Cantidad).click();
		driver.findElement(Cantidad).sendKeys("56");
		driver.findElement(BtnAgregar).click();
//		//////////////////////////////////////////////////////////////////////
//		Thread.sleep(2000);
//		driver.findElement(CodigoProducto).click();
//		driver.findElement(TextBoxProduct).sendKeys("PARAMOX JBE / 60 mL");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
//		Thread.sleep(2000);
//		driver.findElement(Cantidad).click();
//		driver.findElement(Cantidad).sendKeys("65");
//		driver.findElement(BtnAgregar).click();
//		Thread.sleep(2000);
//		//////////////////////////////////////////////////////////////////////
//		driver.findElement(CodigoProducto).click();
//		driver.findElement(TextBoxProduct).sendKeys("OMEPRAZOL 20 mg / 100 CAP");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
//		Thread.sleep(2000);
//		driver.findElement(Cantidad).click();
//		driver.findElement(Cantidad).sendKeys("45");
//		driver.findElement(BtnAgregar).click();
//		////////////////////////////////////////////////////////////////////
//		driver.findElement(CodigoProducto).click();
//		driver.findElement(TextBoxProduct).sendKeys("DESOLIN JBE / 60 mL");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
//		Thread.sleep(2000);
//		driver.findElement(Cantidad).click();
//		driver.findElement(Cantidad).sendKeys("45");
//		driver.findElement(BtnAgregar).click();
		//////////////////////////////////////////////////////////////////////
		Thread.sleep(2000);
		driver.findElement(AccionBorrar).isEnabled();
		driver.findElement(BtnAgregar).isEnabled();
		// driver.findElement(NumeroSolicitud).getText();
		// System.out.println(NumeroSolicitud);
		driver.findElement(BtnSolicitar).click();
		Thread.sleep(5000);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
