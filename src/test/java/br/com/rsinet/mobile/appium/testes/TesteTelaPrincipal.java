package br.com.rsinet.mobile.appium.testes;

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
import br.com.rsinet.mobile.appium.pageFactory.PageAdvantage;
import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class TesteTelaPrincipal {

	public AndroidDriver<MobileElement>driver;
	public PageAdvantage telaprincipal;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeTest
	public void report() {
		extent = Report.setExtent();

	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		telaprincipal = PageFactory.initElements(driver, PageAdvantage.class);
	}

	@Test
	public void teste1() {
		logger = Report.setUp("pesquisaProdutoValidoTelaPrincipal");
		telaprincipal.ClicarLaptop();
		telaprincipal.EscolhendoLaptop();
		telaprincipal.Adicionandooproduto();
		String chegounologin = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))
				.getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");
	}
	@Test
	public void teste2() {
		logger = Report.setUp("pesquisaProdutoValidoTelaPrincipal12");
		telaprincipal.ClicarLaptop();
		telaprincipal.EscolhendoLaptop();
		telaprincipal.Adicionandooproduto();
		System.out.println("Cheguei Aqui");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		DriverFactory.FechandoDriver(driver);
		}

}
