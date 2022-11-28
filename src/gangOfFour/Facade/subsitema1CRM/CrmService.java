package gangOfFour.Facade.subsitema1CRM;

public class CrmService {

	private CrmService() {}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado, String rua) {
		System.out.println("Cliente salvo no sistema do CRM: ");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		System.out.println(rua);
	}
}
