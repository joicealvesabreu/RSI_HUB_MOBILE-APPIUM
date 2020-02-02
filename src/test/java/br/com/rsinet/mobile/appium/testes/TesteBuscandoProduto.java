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
import br.com.rsinet.mobile.appium.pageFactory.PagePesquisandoPorMassa;
import br.com.rsinet.mobile.appium.utility.Utility;

public class TesteBuscandoProduto {
	public WebDriver driver;
	public PagePesquisandoPorMassa page;
	public ExtentReports extent;
	public ExtentTest logger, logger1;
	public ExtentHtmlReporter reporter;

	public void TestecomTestng(WebDriver driver) {
		this.driver = driver;
		page = PageFactory.initElements(driver, PagePesquisandoPorMassa.class);
		
	}

	@BeforeClass
	public void report() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./relatorios/TesteMassadedados.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("Teste Buscando Produto de Massa");

	} 

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PagePesquisandoPorMassa.class);
	}
	
	@Test
	public void testes() {
		page.Search();
		page.Lupa();
		page.Produto();
		page.Carinho();
		String chegounologin = driver
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");
		
	}
/*	@Test
	public void testes2() {
		page.SearchFalse();
		page.Lupa();
		String naoencontrou = driver.findElement(By.xpath("	//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.TextView")).getText();
		Assert.assertTrue(naoencontrou.contains("No Results for"));
	}
	*/
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception {
		if (result.getStatus() == ITestResult.SUCCESS) {

			String temp = Utility.getScreenshot(driver);

			logger.pass("Efetuado com Sucesso: ", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

		} else if (result.getStatus() == ITestResult.FAILURE) {

			String temp = Utility.getScreenshot(driver);

			logger.fail("Ocorreu um erro: ", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}

		logger.log(Status.PASS, "Produto adicionado");
		extent.flush();

		DriverFactory.FechandoDriver(driver);
	}

	
}
