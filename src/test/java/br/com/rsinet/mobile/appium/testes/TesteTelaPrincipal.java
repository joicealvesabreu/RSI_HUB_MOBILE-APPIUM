package br.com.rsinet.mobile.appium.testes;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.PageAdvantage;
import br.com.rsinet.mobile.appium.utility.Report;
import br.com.rsinet.mobile.appium.utility.Utility;

public class TesteTelaPrincipal {

	public WebDriver driver;
	public PageAdvantage page;
	public ExtentReports extent;
	public ExtentTest logger, logger1;
	

	public void TesteTelaPrinciapal(WebDriver driver) {
		this.driver = driver;
		page = PageFactory.initElements(driver, PageAdvantage.class);
		
	}

	@BeforeClass
	public void report() {
		extent = Report.setExtent();

	} 

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PageAdvantage.class);
	}

	@Test
	public void teste1() {
		logger = Report.setUp("pesquisaProdutoValidoTelaPrincipal");
		page.ClicarLaptop();
		page.EscolhendoLaptop();
		page.Adicionandooproduto();
		String chegounologin = driver
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		DriverFactory.FechandoDriver(driver);
	}

}
