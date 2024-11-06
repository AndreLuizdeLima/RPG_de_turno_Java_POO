package utilities;

import java.util.Random;

public class Aleatoridade {

	Random random = new Random();
	
	private int numeroAleatorio;
	private int quemJoga;
	
	public int rolaDados() {
		
		numeroAleatorio = random.nextInt(20) + 1;
			
		return numeroAleatorio;
		
	}
	
	public int quemJoga() {
		quemJoga = random.nextInt(2);
		
		return quemJoga;
	}
	
}
