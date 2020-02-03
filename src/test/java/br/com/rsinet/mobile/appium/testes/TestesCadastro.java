
package br.com.rsinet.mobile.appium.testes;

import java.awt.AWTException;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.PageCadastro;
import br.com.rsinet.mobile.appium.utility.Report;

public class TestesCadastro {

	public WebDriver driver;
	public PageCadastro page;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void report() {
		extent = Report.setExtent();
	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PageCadastro.class);

	}

	@Test
	public void cadastrovalido() throws InterruptedException, MalformedURLException, AWTException {
		logger = Report.setUp("Cadastro Válido");
		page.Menu();
		page.Login();
		page.cadastrar();
		page.Username();
		page.Email();
		page.Password();
		page.Passwordconfirm();
		page.Firstname();
		page.Lastname();
		page.Phonenumber();
		page.rolartela();
		page.Country();
		page.State();
		page.Address();
		page.City();
		page.Zip();
		page.rolartela1();
		// page.Termo1();
		// page.Termo2();
		page.Register();

		String asserts = driver.findElement(By.id("com.Advantage.aShopping:id/textViewAdvantage")).getText();
		Assert.assertTrue(asserts.contains("Advantage"), "Advantage\"");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
	//	DriverFactory.FechandoDriver(driver);
	}

}
