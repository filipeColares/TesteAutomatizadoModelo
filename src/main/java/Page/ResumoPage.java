package Page;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Elements.ResumoPageElements;
import Setup.TestRule;


public class ResumoPage extends ResumoPageElements{

	public ResumoPage() {
		driver = TestRule.getDriver();
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void consultarTituloPagina() {
		
		esperaElemento(TITULO, 10);
		String titulo = TITULO.getText();
		
		Assert.assertTrue(titulo.contains("Resumo do estudo"));
		//Assert.assertTrue(titulo.equals("Resumo do estudo"));
	}
	
	
}
