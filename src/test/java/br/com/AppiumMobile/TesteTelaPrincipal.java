package br.com.AppiumMobile;



import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageFactory.DriverFactory;
import PageFactory.PageAdvantage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteTelaPrincipal {

	public WebDriver driver;
	public PageAdvantage page;

	public void TestecomTestng(WebDriver driver) {
		this.driver = driver;
		page = PageFactory.initElements(driver, PageAdvantage.class);
	}

	@BeforeMethod
	public void before() throws MalformedURLException, InterruptedException {
		driver = DriverFactory.InicializaDriver();
		page = PageFactory.initElements(driver, PageAdvantage.class);
	}

	@Test
	public void teste() {
		page.ClicarLaptop();
		page.EscolhendoLaptop();

	}

	@AfterMethod
	public void afterMethod() {

		DriverFactory.FechandoDriver(driver);
	}

}
