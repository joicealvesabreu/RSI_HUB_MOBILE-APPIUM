package br.com.rsinet.mobile.appium.testes;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.mobile.appium.pageFactory.DriverFactory;
import br.com.rsinet.mobile.appium.pageFactory.PagePesquisaPorMassa;

import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteBuscandoProduto {
	public AndroidDriver<MobileElement>driver;
	public PagePesquisaPorMassa pesquisa;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeTest
	public void report() {
		extent = Report.setExtent();

	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		pesquisa = PageFactory.initElements(driver, PagePesquisaPorMassa.class);
	}

	@Test
	public void pesquisapormassa() {
		logger = Report.setUp("pesquisaProdutoValidoPorMassaDeDados");
		pesquisa.Search();
		pesquisa.Lupa();
		pesquisa.Produto();
		pesquisa.Carinho();
		String chegounologin = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"))
				.getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");

	}
	@AfterMethod
	public void after(ITestResult result) throws IOException {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		DriverFactory.FechandoDriver(driver);	

}

}
