package desafio.dio.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void move() {
		System.out.println("Movendo-se agressivamente...");
		
	}

}
