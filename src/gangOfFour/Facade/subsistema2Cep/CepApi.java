package gangOfFour.Facade.subsistema2Cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Recife";
	}
	
	public String recuperarEstado(String cep) {
		return "Pernambuco";
	}
	
	public String recuperarRua(String cep) {
		return "Fusquinha Azul";
	}
	
}
