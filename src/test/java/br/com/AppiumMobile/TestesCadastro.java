package br.com.AppiumMobile;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import PageFactory.DriverFactory;
import PageFactory.PageAdvantage;
import PageFactory.PageCadastro;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;



public class TestesCadastro {

	public AndroidDriver<MobileElement> driver;
	public PageCadastro page;
	
	@Before
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PageCadastro.class);
	}

	@Test
	public void teste() throws InterruptedException, MalformedURLException {
		page.Menu();
		page.Login();
		page.cadastrar();
		page.Username();
		page.Email();
		page.Password();
		page.Enter();
		page.Passwordconfirm();
		page.Enter();
		page.Firstname();
		page.Enter();
		page.Lastname();
		page.Enter();
		page.Phonenumber();
		page.Enter();
		page.Country();
		page.Enter();
		page.State();
		page.Enter();
		page.Address();
		page.Enter();
		page.City();
		page.Enter();
		page.Zip();
		page.Termo1();
		page.Termo2();
	//	page.Register();

	}

	@After
	public void afterMethod() {
		
	//	DriverFactory.FechandoDriver(driver);
	}

}
