package desafio.dio.facade;

import subsistema.CrmService;
import subsistema2.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperaEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
