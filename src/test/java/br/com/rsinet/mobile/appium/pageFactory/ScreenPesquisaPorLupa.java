package br.com.rsinet.mobile.appium.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import br.com.rsinet.mobile.appium.testdate.Excel;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScreenPesquisaPorLupa {
	
	private   AndroidDriver<MobileElement> driver;


	public  ScreenPesquisaPorLupa(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement search () {

		MobileElement search = driver.findElement(By.xpath(
				"com.Advantage.aShopping:id/editTextSearch"));
			
		return search;
	}
	public MobileElement lupa () {

		MobileElement lupa = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\\\"Home Page\\\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
		return lupa;
	}
	public MobileElement escolhendolaptop () {

		MobileElement escolhendolaptop = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]"));
		return escolhendolaptop;
	}
	public MobileElement adicionandocarinho () {

		MobileElement adicionandocarinho = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
				return adicionandocarinho;
	}

	

}
