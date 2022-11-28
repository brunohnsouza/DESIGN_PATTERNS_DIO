package gangOfFour.Facade;

import gangOfFour.Facade.subsistema2Cep.CepApi;
import gangOfFour.Facade.subsitema1CRM.CrmService;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		String rua = CepApi.getInstancia().recuperarRua(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado, rua);
		
	}

}
