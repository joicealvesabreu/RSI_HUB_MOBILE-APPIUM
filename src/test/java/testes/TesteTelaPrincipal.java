package testes;

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

import PageFactory.DriverFactory;
import PageFactory.PageAdvantage;
import utility.Utility;

public class TesteTelaPrincipal {

	public WebDriver driver;
	public PageAdvantage page;
	public ExtentReports extent;
	public ExtentTest logger, logger1;
	public ExtentHtmlReporter reporter;

	public void TestecomTestng(WebDriver driver) {
		this.driver = driver;
		page = PageFactory.initElements(driver, PageAdvantage.class);
		
	}

	@BeforeClass
	public void report() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./relatorios/TesteTelaInicial.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger = extent.createTest("Teste de produto");

	} 

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PageAdvantage.class);
	}

	@Test
	public void teste1() {
		page.ClicarLaptop();
		page.EscolhendoLaptop();
		page.Adicionandooproduto();
		String chegounologin = driver
				.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")).getText();
		Assert.assertTrue(chegounologin.contains("Login"), "Login");
	}
	
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
