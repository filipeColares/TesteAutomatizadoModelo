package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class LoginPageElements extends SeleniumUtils {

	@FindBy (name = "usuario")
	public WebElement USER;
	
	@FindBy (name = "senha")
	public WebElement PASSWORD;
	
	@FindBy (css = "[class = 'btn btn-primary btn-block btn-flat']")
	public WebElement ENTRAR;

	@FindBy (xpath = "//*[@id=\"formLogin\"]/a")
	public WebElement MSG_CREDENCIAIS;
	
	
}
