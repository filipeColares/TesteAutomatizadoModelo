package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class ResumoPageElements extends SeleniumUtils{

	@FindBy (css = "[class = 'page-title']")
	public WebElement TITULO;
}
