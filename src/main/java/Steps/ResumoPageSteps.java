package Steps;

import Page.ResumoPage;
import cucumber.api.java.pt.Entao;

public class ResumoPageSteps{

	ResumoPage resumo = new ResumoPage();
	
	@Entao ("^O sistema deve abrir na tela de resumo do estudo$")
	public void verificaPaginaResumo() {
		resumo.consultarTituloPagina();
	}
}
