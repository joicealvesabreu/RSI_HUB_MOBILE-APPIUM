package br.com.rsinet.mobile.appium.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.mobile.appium.testdate.Excel;

public class PageTelaincicial {

//	public MobileElement element;
	private WebDriver driver;
	private static WebElement element;
	

	public void PageAdvance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
	private WebElement clicarLaptop;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.TextView[1]")
	private WebElement escolhendolaptop;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement adicionandooproduto;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutProductQuantity")
	private WebElement quatidadeclicar;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement quantidadedproduto;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement apply;

	@FindBy(how = How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private WebElement usernamelogin;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private WebElement passwordlogin;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private WebElement login;
	
	@FindBy(how = How.ID, using ="com.Advantage.aShopping:id/imageViewCart")
	private WebElement imageviewcart;
	
	@FindBy(how = How.XPATH, using ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement verificanomedoproduto;
	
	@FindBy(how = How.XPATH, using = "com.Advantage.aShopping:id/textViewCartQuantity")
	private WebElement verificarquantidade;
	
	
	
	
	public void ClicarLaptop() {
		clicarLaptop.click();
	}

	public void EscolhendoLaptop() {
		escolhendolaptop.click();

	}

	public void Adicionandooproduto() {
		adicionandooproduto.click();
	}

	public void Quantidadeclicar() {
		quatidadeclicar.click();

	}

	public void Quantidadedproduto() {
		quantidadedproduto.sendKeys("45");
	}

	public void Apply() {
		apply.click();
	}

	public void Usermanelogin(String senha) {
		usernamelogin.sendKeys();
		
	}

	public void Passwordlogin(String password) {
		passwordlogin.sendKeys(password);
		
	}

	public void Login() {
		login.click();

	}
	public void Imageviewcart(){
		imageviewcart.click();
	}
	
	
	public String Verificanomedoproduto() {
		return verificanomedoproduto.getText();
		
	}
	public String verificarquantidadede45produtonocarinho() {
		return verificarquantidade.getText();
	}
	
}
