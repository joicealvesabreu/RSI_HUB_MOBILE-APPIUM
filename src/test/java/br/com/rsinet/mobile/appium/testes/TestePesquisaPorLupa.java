package br.com.rsinet.mobile.appium.testes;


import java.net.MalformedURLException;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.ScreenPesquisaPorLupa;

import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaPorLupa {

	private static AndroidDriver<MobileElement> driver;
	private ScreenPesquisaPorLupa pesquisa;
	private ExtentReports extent;
	private ExtentTest logger;
	


	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		pesquisa = new ScreenPesquisaPorLupa(DriverFactory.InicializaDriver());
		
	}
	@BeforeTest
	public void report() {
		extent = Report.setExtent();
	}


	@Test
	public void pesquisa1Produto_Invalido() {
		logger = Report.setUp("pesquisa1Produto_Invalido");
		pesquisa.search().sendKeys("celular");
		pesquisa.lupa().click();

		boolean naoExisteesseproduto = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"))
				.isDisplayed();
		Assert.assertTrue(naoExisteesseproduto);
		System.out.println(naoExisteesseproduto);

	} 
	
	@Test
	public void pesquisa2Produto_valido() throws Throwable { 
		logger = Report.setUp("pesquisa2Produto_valido");
		pesquisa.search().sendKeys("HP CHROMEBOOK 14");
		pesquisa.lupa().click();
		Assert.assertTrue(driver.getPageSource().contains("HP CHROMEBOOK 14"));
		pesquisa.escolhendolaptop().click();
		pesquisa.adicionandocarinho().click();
		String chegounologin = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))
				.getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");
 
	}	

	
	@AfterMethod
	public void afterreport(ITestResult result) throws Exception
	{
	
	Report.tearDown(result, logger, driver);
	Report.closeReport(extent);
	driver = DriverFactory.FechandoDriver();
	}
	
	@AfterTest
	public void finalizareport() {
		extent.flush();
	}
}
