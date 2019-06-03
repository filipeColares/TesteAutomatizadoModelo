package Page;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Elements.LoginPageElements;
import Setup.TestRule;

public class LoginPage extends LoginPageElements{

	String url = "xxxxxxx";
	
	

	public LoginPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(),this);
		//driver.navigate().to(url);
	}
	
	
	public void goToSystem() {
		driver.navigate().to(url);
	}
	
	public void mensagemCredenciaisInvalidas() {
		String msg = MSG_CREDENCIAIS.getText();
		
		Assert.assertTrue(msg.contains("Senha Inválida"));
	}
}
