package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PagePesquisandoPorMassa {
	private WebDriver driver;
	private WebElement element;

	public void PagePesquisandoPorMassa (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	

}
