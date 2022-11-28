package mainTests;

import gangOfFour.Strategy.Comportamento;
import gangOfFour.Strategy.ComportamentoAgressivo;
import gangOfFour.Strategy.ComportamentoDefensivo;
import gangOfFour.Strategy.ComportamentoNormal;
import gangOfFour.Strategy.Robo;

public class StrategyTest {
	public static void main(String[] args) {

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo bumblebee = new Robo();
		
		bumblebee.setStrategy(normal);
		
		bumblebee.andar();
		bumblebee.andar();
		
		System.out.println();
		
		bumblebee.setStrategy(defensivo);
		
		bumblebee.andar();
		bumblebee.andar();
		
		System.out.println();
		
		bumblebee.setStrategy(agressivo);
		
		bumblebee.andar();
		bumblebee.andar();
		
	}

}
