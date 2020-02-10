package br.com.rsinet.mobile.appium.testes;

import java.io.IOException;
import java.net.MalformedURLException;

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

import br.com.rsinet.mobile.appium.screenfactory.DriverFactory;
import br.com.rsinet.mobile.appium.screenfactory.ScreenTelaInicial;
import br.com.rsinet.mobile.appium.testdate.Excel;

import br.com.rsinet.mobile.appium.utility.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteTelaPrincipal {

	private AndroidDriver<MobileElement> driver;
	private ScreenTelaInicial telaprincipal;
	private ExtentReports extent;
	private ExtentTest logger;
	private Excel excel;

	@BeforeMethod
	public void IniciaDriver() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		telaprincipal = new ScreenTelaInicial(DriverFactory.InicializaDriver());
	 excel = new Excel();

	}

	@BeforeTest
	public void iniciaReport() {
		extent = Report.setExtent();

	}

	@Test
	public void pesquisa1ProdutoValidoTelaPrincipal() throws Exception {
		logger = Report.setUp("pesquisa1_Produto_Valido_Tela_Principal");
		telaprincipal.clicarLaptop().click();
		telaprincipal.escolhendolaptop().click();
		Assert.assertTrue(driver.getPageSource().contains(excel.sLaptop()));
		telaprincipal.adicionandooproduto().click();
		telaprincipal.usernamelogin().sendKeys(excel.sUsuario());
		telaprincipal.passwordlogin().sendKeys(excel.sSenha());
		telaprincipal.login().click();
		telaprincipal.imageviewcart().click();
		String chegounoproduto = telaprincipal.nomeProduroConfirmar().getText();
		Assert.assertTrue(chegounoproduto.contains((excel.sLaptop())));

	}

	@Test
	public void pesquisa2Produtocom45itensnocarinho() throws Exception {

		logger = Report.setUp("pesquisa2Produto_com_45_itens_no_carinho");
		telaprincipal.clicarLaptop().click();
		telaprincipal.escolhendolaptop().click();
		telaprincipal.quatidadeclicar().click();
		telaprincipal.quantidadedproduto().clear();
		telaprincipal.quantidadedproduto().sendKeys("45");
		telaprincipal.apply().click();
		telaprincipal.adicionandooproduto().click();
		telaprincipal.usernamelogin().sendKeys(excel.sUsuario());
		telaprincipal.passwordlogin().sendKeys(excel.sSenha());
		telaprincipal.login().click();
		telaprincipal.imageviewcart().click();
		String tem10produtos = telaprincipal.verificarquantidade().getText();
		Assert.assertFalse(tem10produtos.contains("45"), "45");
	}

	@AfterMethod
	public void Finaliza(ITestResult result) throws Exception {
		Report.tearDown(result, logger, driver);
		Report.closeReport(extent);
		driver = DriverFactory.FechandoDriver();
	}

	@AfterTest
	public void finalizareport() {
		extent.flush();

	}
}
