package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAdvantage {

//	public MobileElement element;
	private WebDriver driver;
	private WebElement element;

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
	
	public void ClicarLaptop() {

		clicarLaptop.click();
	}

	public void EscolhendoLaptop() {
		// WebDriverWait wait2 = new WebDriverWait(driver, 10);
		// wait2.until(ExpectedConditions.elementToBeClickable(escolhendolaptop));
		escolhendolaptop.click();

	}

	public void Adicionandooproduto() {
		adicionandooproduto.click();
	}

}
