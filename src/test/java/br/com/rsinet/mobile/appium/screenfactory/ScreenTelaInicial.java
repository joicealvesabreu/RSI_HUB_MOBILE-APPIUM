package br.com.rsinet.mobile.appium.screenfactory;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScreenTelaInicial {

	
	private AndroidDriver<MobileElement> driver;

	public ScreenTelaInicial(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		
	}

	public MobileElement clicarLaptop() {

		MobileElement clicarLaptop = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
			

		return clicarLaptop;
	}

	public MobileElement escolhendolaptop() {

		MobileElement escolhendolaptop = driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]"));
		return escolhendolaptop;
	}

	public MobileElement adicionandooproduto() {
		MobileElement adicionandooproduto = driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
				return adicionandooproduto;
	}

	public MobileElement quatidadeclicar() {
		MobileElement quatidadeclicar = driver.findElement(By.id( "com.Advantage.aShopping:id/linearLayoutProductQuantity"));
				return quatidadeclicar;
	}

	public MobileElement quantidadedproduto() {
		
		MobileElement quantidadedproduto = driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
				return quantidadedproduto;
	}

	public MobileElement apply() {
		MobileElement apply = driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));
				return apply;
	}

	public MobileElement usernamelogin() {
		MobileElement usernamelogin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"));
				return usernamelogin;
	}

	public MobileElement passwordlogin() {
		MobileElement passwordlogin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"));
				return passwordlogin;
	}

	public MobileElement login() {
		MobileElement login = driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
				return login;
	}

	public MobileElement imageviewcart() {
		MobileElement imageviewcart = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewCart"));
				return imageviewcart;
	}

	public MobileElement verificanomedoproduto() {
		MobileElement verificanomedoproduto = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
				return verificanomedoproduto;
	}

	public MobileElement verificarquantidade() {
		MobileElement  verificarquantidade = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartQuantity"));
				return verificarquantidade;
	}
	public MobileElement nomeProduroConfirmar() {
		MobileElement nomeProduroConfirmar = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartProductName"));
		return  nomeProduroConfirmar;
	}

}
