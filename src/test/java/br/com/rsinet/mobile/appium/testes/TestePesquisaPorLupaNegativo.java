package br.com.rsinet.mobile.appium.testes;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.PagePesquisaPorMassa;
import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaPorLupaNegativo {

	public AndroidDriver<MobileElement> driver;
	public PagePesquisaPorMassa pesquisa;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeMethod
	public void report() {
		extent = Report.setExtent();

	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		pesquisa = PageFactory.initElements(driver, PagePesquisaPorMassa.class);
	}

	@Test
	public void teste() {
		logger = Report.setUp("pesquisaProduto-Invalido- PorMassaDeDados");
		pesquisa.SearchFalse();
		pesquisa.Lupa();

		boolean naoExisteesseproduto = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow"))
				.isDisplayed();
		Assert.assertTrue(naoExisteesseproduto);
		System.out.println(naoExisteesseproduto);

	}

	@AfterMethod
	public void after(ITestResult result) throws IOException {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();

	}

}
