import java.sql.SQLException;

import entities.Arquetipo;
import entities.Raca;
import utilities.CalculadoraDePoderes;


public class Main {

	public static void main(String[] args) throws SQLException {
	
		//IniciandoBanco iniciandoBanco = new IniciandoBanco();
		//iniciandoBanco.IniciandoBanco();
		
		//RepositoryRaca repositoryRaca = new RepositoryRaca();
		//RepositoryArquetipo repositoryArquetipo = new RepositoryArquetipo();
		//RepositoryPersonagem repositoryPersonagem = new RepositoryPersonagem();
		
		//Personagem personagem = new Personagem("Andre", repositoryRaca.buscarRacaPorNome("Humanos")  , repositoryArquetipo.buscarArquetipoPorNome("Mago") );
		//repositoryPersonagem.salvarPersonagem(personagem);
		
		CalculadoraDePoderes calcular = new CalculadoraDePoderes();
		
		System.out.println(calcular.calculaVida(1, 1));
		
		Raca raca = new Raca();
		Arquetipo arquetipo = new Arquetipo();
		
		
		
	}

}
