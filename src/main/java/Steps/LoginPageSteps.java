package Steps;




import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.PageFactory;
import Elements.LoginPageElements;
import Page.LoginPage;
import Setup.TestRule;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class LoginPageSteps extends LoginPageElements {

	LoginPage loginPage = new LoginPage();
	
	public LoginPageSteps() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(),this);
	}
	
	@Dado ("^que eu acesse o sistema$")
	public void acessarSistema() {
		loginPage.goToSystem();
		
	}
	
	@Quando ("^Insiro usuario e senha valido$")
	public void inserirUsuarioESenha(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		
		USER.sendKeys(list.get(0).get("usuario"));
		PASSWORD.sendKeys(list.get(0).get("senha"));
		ENTRAR.click();
	}

	
	@Quando("Insiro usuario e senha invalido")
	public void usuarioESenhaInvalido(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		
		USER.sendKeys(list.get(0).get("usuario"));
		PASSWORD.sendKeys(list.get(0).get("senha"));
		ENTRAR.click();
	}
	
	@Entao("O sistema deve exibir uma mensagem na tela informando que nao foi possivel o login")
	public void mensagemCredenciaisInvalidas() {
		loginPage.mensagemCredenciaisInvalidas();
	}

}
