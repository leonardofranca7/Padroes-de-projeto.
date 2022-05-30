package desafio.dio;

import desafio.dio.facade.Facade;
import desafio.dio.singleton.SingletonEager;
import desafio.dio.singleton.SingletonLazy;
import desafio.dio.singleton.SingletonLazyHolder;
import desafio.dio.strategy.Comportamento;
import desafio.dio.strategy.ComportamentoAgressivo;
import desafio.dio.strategy.ComportamentoDefensivo;
import desafio.dio.strategy.ComportamentoNormal;
import desafio.dio.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Luis", "5487894");

	}

}
