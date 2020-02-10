package br.com.rsinet.mobile.appium.screenfactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.mobile.appium.testdate.Excel;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScreenCadastro {

	private AndroidDriver<MobileElement> driver;

	public ScreenCadastro(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	public MobileElement menu() {
		MobileElement menu = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return menu;
	}

	public MobileElement menuverificacao() {
		MobileElement menuverificacao = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		return menuverificacao;
	}
	public MobileElement login() {
		MobileElement login = driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin"));
		return login;
	}

	public MobileElement cadastrar() {
		MobileElement cadastrar = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout"));
		return cadastrar;
	}

	public MobileElement username() {
		MobileElement username = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		return username;
	}

	public MobileElement email() {
		MobileElement email = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		return email;
	}

	public MobileElement password() {
		MobileElement password = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		return password;
	}

	public MobileElement passwordcomfirm() {
		MobileElement passwordcomfirm = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		return passwordcomfirm;
	}

	public MobileElement firtname() {
		MobileElement firtname = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		return firtname;
	}

	public MobileElement lastname() {
		MobileElement lastname = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		return lastname;
	}

	public MobileElement phonenumber() {
		MobileElement phonenumber = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		return phonenumber;
	}

	public MobileElement country() {
		MobileElement country = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountriesTitle"));
		return country;
	}

	public MobileElement paisAlbania() {
		MobileElement paisAlbania = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
		return paisAlbania;
	}

	public MobileElement state() {
		MobileElement state = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		return state;
	}

	public MobileElement address() {
		MobileElement address = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		return address;
	}

	public MobileElement city() {
		MobileElement city = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		return city;
	}

	public MobileElement zip() {
		MobileElement zip = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		return zip;
	}

	public MobileElement termo1() {
		MobileElement termo1 = driver.findElement(By.id("com.Advantage.aShopping:id/checkBoxRecieveOffers"));
		return termo1;
	}

	public MobileElement termo2() {
		MobileElement termo2 = driver.findElement(By.id("com.Advantage.aShopping:id/checkBoxAgreeConditions"));
		return termo2;
	}

	public MobileElement register() {
		MobileElement register = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		return register;
	}

	public void Enter() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).tap(PointOption.point(989, 1701)).perform();
	}

	public void rolartela() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(458, 1353))
				.moveTo(PointOption.point(542, 412)).release().perform();

	}

	public void rolartela1() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(487, 1752))
				.moveTo(PointOption.point(504, 1025)).release().perform();

	}

	public void Esperar() throws InterruptedException {
		
	//	 WebDriverWait wait = new WebDriverWait(driver, 10);
		 Thread.sleep(5000);
	}

	public MobileElement menuuser() {
		MobileElement menuuser = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		return menuuser;
	}

	public MobileElement verificamsgderror() {
		MobileElement verificamsgderror = driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		return verificamsgderror;

	}
}
