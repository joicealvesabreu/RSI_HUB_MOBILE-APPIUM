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

import br.com.rsinet.mobile.appium.screenfactory.DriverFactory;
import br.com.rsinet.mobile.appium.screenfactory.ScreenPesquisaPorLupa;
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
		logger = Report.setUp("pesquisa1_Produto_Invalido");
		pesquisa.search().sendKeys("celular");
		pesquisa.lupa().click();

		boolean naoExisteesseproduto = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"))
				.isDisplayed();
		Assert.assertTrue(naoExisteesseproduto);
		System.out.println(naoExisteesseproduto);

	} 
	
	@Test
	public void pesquisa2Produto_valido() throws Throwable { 
		logger = Report.setUp("pesquisa2_Produto_valido");
		pesquisa.search().sendKeys("HP CHROMEBOOK 14 G1(ES)");
		pesquisa.lupa().click();
		pesquisa.escolhendolaptop().click();
		pesquisa.adicionandocarinho().click();
		pesquisa.usernamelogin().sendKeys("JGANA234");
		pesquisa.passwordlogin().sendKeys("Natalice24");
		pesquisa.login().click();
		pesquisa.imageviewcart().click();
		String nomeproduto = pesquisa.nomeProduroConfirmar().getText();
		Assert.assertTrue(nomeproduto.contains("HP Chromebook 14 G1(ES)"), "HP Chromebook 14 G1(ES)");
		
 
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
