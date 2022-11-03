package com.repostapp.abastecimiento.TestNG;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNg extends Abastecimiento {

	private WebDriver driver;
	ExtentReports extent;
	ExtentHtmlReporter spark;

	@BeforeTest
	// Antes de iniciar la prueba
	public void setup() {
		// iniciamos el reporte

		// Creamos el ExtentReports y adjuntamos el al reporte
		extent = new ExtentReports();
		spark = new ExtentHtmlReporter("ExtentReports.html");
		extent.attachReporter(spark);

		System.setProperty("webdriver.edge.driver", "src\\main\\resources\\msedgedriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		// driver.manage().window().maximize();
		driver.get("http://10.1.0.7:9810/");
	}

	@Test
	// Prueba
	public void test1() throws InterruptedException {
		ExtentTest test = extent.createTest("RealizarSolicitud");

		test.log(Status.INFO, "");
		test.info("");
		// test.pass("details",MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png"));
		// test.addScreenCaptureFromPath("screenshot.png");

		Thread.sleep(2000);
		driver.findElement(RepostAppPageLocator).isDisplayed();
		driver.findElement(UserNameLocator).sendKeys("401579");
		driver.findElement(PasswordLocator).sendKeys("401579");
		driver.findElement(BtnEntrar).click();

		Thread.sleep(3000);
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
		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/nz-option-container/div/cdk-virtual-scroll-viewport/div[1]/nz-option-item/div")).click();
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
		// driver.findElement(BtnSolicitar).click();
		Thread.sleep(5000);

	}
	@Test
	public void test2() throws InterruptedException {
		ExtentTest test = extent.createTest("TrabajarSolicitudSacador");

		test.log(Status.INFO, "");
		test.info("");
		
		
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
	
	@AfterTest
	// Despues de iniciar la prueba
	public void tearDown() {
		extent.flush();

	}

}
