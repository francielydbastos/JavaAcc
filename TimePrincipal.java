package time;

import java.util.ArrayList;
import java.util.Collections;
import time.ComparaQualidade;

public class TimePrincipal {

	public static void main(String[] args) {
		
		//Criando ArrayList e adicionando jogadores que compõem o timeUm
		ArrayList<Jogador2> timeUm = new ArrayList<Jogador2>();
		
		timeUm.add(new Jogador2("Fábio", 1, "Goleiro", 78));
		timeUm.add(new Jogador2("Rafael", 12, "Goleiro", 80));
		timeUm.add(new Jogador2("Dedé", 26, "Zagueiro", 83));
		timeUm.add(new Jogador2("Leo", 3, "Zagueiro", 76));
		timeUm.add(new Jogador2("Victorino", 4, "Zagueiro", 74));
		timeUm.add(new Jogador2("Bruno Rodrigo", 33, "Zagueiro", 73));
		timeUm.add(new Jogador2("Paulão", 86, "Zagueiro", 74));
		timeUm.add(new Jogador2("Egídio", 6, "Lateral", 73));
		timeUm.add(new Jogador2("Mayke", 32, "Lateral", 77));
		timeUm.add(new Jogador2("Ceará", 2, "Lateral", 72));
		timeUm.add(new Jogador2("Diego Renan", 98, "Lateral", 78));
		timeUm.add(new Jogador2("Everton", 23, "Lateral", 69));
		timeUm.add(new Jogador2("Lucas Silva", 16, "Meio Campo", 82));
		timeUm.add(new Jogador2("Leandro Guerreiro", 55, "Meio Campo", 72));
		timeUm.add(new Jogador2("Henrique", 8, "Meio Campo", 77));
		timeUm.add(new Jogador2("Éverton Ribeiro", 17, "Meio Campo", 84));
		timeUm.add(new Jogador2("Ricardo Goulart", 31, "Meio Campo", 84));
		timeUm.add(new Jogador2("Júlio Baptista", 10, "Meio Campo", 76));
		timeUm.add(new Jogador2("Anselmo Ramon", 99, "Atacante", 75));
		timeUm.add(new Jogador2("Vinícius Araújo", 30, "Atacante", 84));
		timeUm.add(new Jogador2("Willian", 41, "Atacante", 78));
		timeUm.add(new Jogador2("Dagoberto", 11, "Atacante", 77));
		timeUm.add(new Jogador2("Borges", 9, "Atacante", 76));

		//Instanciando time Cruzeiro, com os jogadores cadastrados
		Time cruzeiro = new Time("Cruzeiro Esporte Clube", "CRU", "02/01/1921", timeUm);
				
		//---------------------------------------------------------------//
		
		//Criando ArrayList e adicionando jogadores que compõem o timeDois
		ArrayList<Jogador2> timeDois = new ArrayList<Jogador2>();
		
		timeDois.add(new Jogador2("Victor", 1, "Goleiro", 79));
		timeDois.add(new Jogador2("Giovanni", 87, "Goleiro", 75));
		timeDois.add(new Jogador2("Rafael Marques", 13, "Zagueiro", 76));
		timeDois.add(new Jogador2("Gilberto Silva", 15, "Zagueiro", 75));
		timeDois.add(new Jogador2("Jemerson", 36, "Zagueiro", 72));
		timeDois.add(new Jogador2("Richarlyson", 20, "Lateral", 73));
		timeDois.add(new Jogador2("Junior Cesar", 6, "Lateral", 72));
		timeDois.add(new Jogador2("Marcos Rocha", 2, "Lateral", 81));
		timeDois.add(new Jogador2("Réver", 4, "Zagueiro", 83));
		timeDois.add(new Jogador2("Leonardo Silva", 3, "Zagueiro", 77));
		timeDois.add(new Jogador2("Carlos Cesar", 26, "Lateral", 70));
		timeDois.add(new Jogador2("Michel Macedo", 29, "Lateral", 74));
		timeDois.add(new Jogador2("Pierre", 5, "Meio Campo", 75));
		timeDois.add(new Jogador2("Lucas Cândido", 14, "Meio Campo", 75));
		timeDois.add(new Jogador2("Leandro Donizete", 8, "Meio Campo", 72));
		timeDois.add(new Jogador2("Ronaldinho", 10, "Meio Campo", 82));
		timeDois.add(new Jogador2("Diego Tardelli", 9, "Meio Campo", 79));
		timeDois.add(new Jogador2("Josué", 28, "Meio Campo", 74));
		timeDois.add(new Jogador2("Neto Berola", 25, "Atacante", 78));
		timeDois.add(new Jogador2("Jô", 7, "Atacante", 82));
		timeDois.add(new Jogador2("Guilherme", 17, "Atacante", 78));
		timeDois.add(new Jogador2("Alecsandro", 19, "Atacante", 73));
		timeDois.add(new Jogador2("Dátolo", 99, "Atacante", 73));

		//Instanciando time Atlético, com os jogadores cadastrados
		Time atletico = new Time("Clube Atlético Mineiro", "CAM", "25/03/1908", timeDois);
		
		//Imprimindo a escalação dos dois times
		System.out.println("ESCALAÇÃO: " + cruzeiro.getNome() + " (" + cruzeiro.getSigla() + ")");
		cruzeiro.relacionarJogadores();
		
		System.out.println(" ");
		
		System.out.println("ESCALAÇÃO: " + atletico.getNome() + " (" + atletico.getSigla() + ")");
		atletico.relacionarJogadores();
		
	}

}
