package br.com.rsinet.mobile.appium.pageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.mobile.appium.testdate.Excel;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;




public class PageCadastro {

	private WebDriver driver;
	private WebElement element;
	private Excel excel = new Excel();

	public void PageCadastro (WebDriver driver) {
				PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout")
	private WebElement cadastrar;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement username;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement passaword;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement passawordcomfirm;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement firtname;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement lastname;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement phonenumber;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountriesTitle")
	private WebElement country;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private WebElement paisAlbania;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement state;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement address;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement city;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement zip;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private WebElement termo1;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxAgreeConditions")
	private WebElement termo2;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement register;
	
	@FindBy(how =How.ID, using ="com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menuverificacao;
	
	public void Enter() throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).tap(PointOption.point(989, 1701)).perform();
	}
	
	public void rolartela()throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(458, 1353)).moveTo(PointOption.point(542, 412)).release().perform();
				  		  
	}
	public void rolartela1()throws MalformedURLException {
		(new TouchAction(DriverFactory.InicializaDriver())).press(PointOption.point(487, 1752)).moveTo(PointOption.point(504, 1025)).release().perform();
				  		  
	}
	
	
	public void Menu() {
		menu.click();
	}

	public void Login() {
		login.click();
	}

	public void cadastrar() {
		cadastrar.click();
	}

	public void Username() throws Exception {
		username.click();
		username.sendKeys("JGANA456");
	}

	public void Email() throws InterruptedException {
	//	WebDriverWait wait = new WebDriverWait(driver,10); 
		//Thread.sleep(5000);
		
		email.click();
		email.sendKeys("joice@gmail.com");
	}

	public void Password() throws InterruptedException {
		passaword.click();
		passaword.sendKeys("Natalice2");
	}

	public void Passwordconfirm() {
		passawordcomfirm.click();
		passawordcomfirm.sendKeys("Natalice2");
		
	}

	public void Firstname() {
		firtname.click();
		firtname.sendKeys("Joice");
	}

	public void Lastname() {
		lastname.click();
		lastname.sendKeys("Abreu");
	}

	public void Phonenumber() {
		phonenumber.click();
		phonenumber.sendKeys("(11)941707376");
	}

	public void Country() {
		country.click();
		paisAlbania.click();
		
	}

	public void State() {
		state.click();
		state.sendKeys("Taboao");
	}

	public void Address() {
		address.click();
		address.sendKeys("Rua Albano Leite");
	}

	public void City() {
		city.click();
		city.sendKeys("SP");
	}

	public void Zip() {
		zip.click();
		zip.sendKeys("06773-050");
	}

	public void Termo1() {
		termo1.click();
	}

	public void Termo2() {
		termo2.click();
	}

	public void Register() {
		register.click();
	}
	public void Esperar() throws InterruptedException {
		Thread.sleep(5000);
	}
	
}
