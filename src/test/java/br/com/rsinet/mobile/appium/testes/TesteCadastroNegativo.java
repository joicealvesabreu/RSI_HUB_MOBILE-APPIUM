package br.com.rsinet.mobile.appium.testes;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.PageCadastro;
import br.com.rsinet.mobile.appium.pageFactory.PagePesquisaPorMassa;
import br.com.rsinet.mobile.appium.utility.Report;
import br.com.rsinet.mobile.appium.utility.Utility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastroNegativo {

	public AndroidDriver<MobileElement> driver;
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
	public void cadastro2() throws InterruptedException, MalformedURLException, AWTException {

		logger = Report.setUp("Cadastro Inv�lido");
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

		page.Register();

		String asserts = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).getText();
		Assert.assertTrue(asserts.contains("REGISTER"), "REGISTER");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();
	}

}