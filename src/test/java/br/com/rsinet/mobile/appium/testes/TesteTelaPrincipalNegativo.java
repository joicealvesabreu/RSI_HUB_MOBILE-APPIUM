package br.com.rsinet.mobile.appium.testes;

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
import br.com.rsinet.mobile.appium.pageFactory.PageTelaincicial;
import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteTelaPrincipalNegativo {
	
	public AndroidDriver<MobileElement>driver;
	public PageTelaincicial telaprincipal;
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeMethod
	public void iniciaReport() {
		extent = Report.setExtent();

	}

	@BeforeMethod
	public void IniciaDriver() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		telaprincipal = PageFactory.initElements(driver, PageTelaincicial.class);
	}
	
	@Test
	public void teste() {
		logger = Report.setUp("pesquisaProdutoValidoTelaPrincipal12");
		telaprincipal.ClicarLaptop();
		telaprincipal.EscolhendoLaptop();
		telaprincipal.Adicionandooproduto();
		
		
	}

	@AfterMethod
	public void Finaliza(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();
	}

}
