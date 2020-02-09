
package br.com.rsinet.mobile.appium.testes;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
import br.com.rsinet.mobile.appium.pageFactory.ScreenCadastro;
import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastro {

	public AndroidDriver<MobileElement> driver;
	public ScreenCadastro page;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeTest
	public void report() {
		extent = Report.setExtent();
	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, ScreenCadastro.class);

	}

	@Test
	public void cadastro1Valido() throws Exception {

		logger = Report.setUp("cadastro_Valido");
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
		page.Esperar();
		String asserts = driver.findElement(By.id("com.Advantage.aShopping:id/textViewAdvantage")).getText();
		Assert.assertTrue(asserts.contains("Advantage"), "Advantage");


	}

	@Test
	public void cadastro2Invalido() throws Exception {

		logger = Report.setUp("cadastro_Invalido");
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
		page.Esperar();
		String asserts1 = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).getText();
		Assert.assertTrue(asserts1.contains("REGISTER"), "REGISTER");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();

	}
}
