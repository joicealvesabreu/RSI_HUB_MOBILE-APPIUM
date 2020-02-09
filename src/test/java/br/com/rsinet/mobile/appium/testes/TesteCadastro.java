
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
import br.com.rsinet.mobile.appium.testdate.Excel;
import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastro {

	private AndroidDriver<MobileElement> driver;
	private ScreenCadastro page;
	private ExtentReports extent;
	private ExtentTest logger;
	private Excel excel;

	@BeforeTest
	public void report() {
		extent = Report.setExtent();
	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = new ScreenCadastro(DriverFactory.InicializaDriver());
		excel = new Excel();

	}

	@Test
	public void cadastro1Valido() throws Exception {

		logger = Report.setUp("cadastro_Valido");
		page.menu().click();
		page.login().click();
		page.cadastrar().click();
		page.username().sendKeys("JGANA281");
		page.email().sendKeys("joice@bbd.com");
		page.password().sendKeys("Natalice24");
		page.passwordcomfirm().sendKeys("Natalice24");
		page.firtname().sendKeys("Joice");
		page.lastname().sendKeys("Abreu");
		page.phonenumber().sendKeys("(11)3452-2345");
		page.rolartela();
		page.country().click();
		page.paisAlbania().click();
		page.state().sendKeys("SP");
		page.address().sendKeys("Rua albano");
		page.city().sendKeys("Taboão");
		page.zip().sendKeys("02220-050");
		page.rolartela1();
		page.register().click();
		page.menu().click();
		String asserts = page.menuuser().getText();
		Assert.assertTrue(asserts.contains("JGANA281"));

	}

	@Test
	public void cadastro2Invalido() throws Exception {

		logger = Report.setUp("cadastro_Invalido");
		page.menu().click();
		page.login().click();
		page.cadastrar().click();
		page.username().sendKeys("JGANA280");
		page.email().sendKeys("joice@bbd.com");
		page.password().sendKeys("Natalice24");
		page.passwordcomfirm().sendKeys("Natalice24");
		page.firtname().sendKeys("Joice");
		page.lastname().sendKeys("Abreu");
		page.phonenumber().sendKeys("(11)3452-2345");
		page.rolartela();
		page.country().click();
		page.paisAlbania().click();
		page.state().sendKeys("SP");
		page.address().sendKeys("Rua albano");
		page.city().sendKeys("Taboão");
		page.zip().sendKeys("02220-050");
		page.rolartela1();
		page.register().click();
		String asserts1 = page.verificamsgderror().getText();
		Assert.assertTrue(asserts1.contains("REGISTER"));
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();
	}

	@AfterTest
	public void finalizareport() {
		extent.flush();
	}

	/*
	 * page.username().sendKeys(excel.sUsuario());
	 * page.email().sendKeys(excel.sEmail());
	 * page.password().sendKeys(excel.sSenha());
	 * page.passwordcomfirm().sendKeys(excel.sSenha());
	 * page.firtname().sendKeys(excel.sPrimeiroNome());
	 * page.lastname().sendKeys(excel.sUltimoNome());
	 * page.phonenumber().sendKeys(excel.sTelefone()); page.rolartela();
	 * page.country().click(); page.paisAlbania().click();
	 * page.state().sendKeys(excel.sEstado());
	 * page.address().sendKeys(excel.sEndereco());
	 * page.city().sendKeys(excel.sCidade()); page.zip().sendKeys(excel.sCep());
	 * page.rolartela1(); page.register(); String asserts1 =
	 * driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister")).
	 * getText(); Assert.assertTrue(asserts1.contains("REGISTER"), "REGISTER"); }
	 */
}
