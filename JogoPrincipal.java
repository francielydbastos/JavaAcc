package jogo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import time.Jogador2;
import time.Time;

public class JogoPrincipal {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		//Criando ArrayList e adicionando jogadores que compõem o timeUm
		ArrayList<Jogador2> timeUm = new ArrayList<Jogador2>();

		timeUm.add(new Jogador2("Fábio", 1, "Goleiro", 78, true, 0, 0));
		timeUm.add(new Jogador2("Rafael", 12, "Goleiro", 80, true, 0, 0));
		timeUm.add(new Jogador2("Dedé", 26, "Zagueiro", 83, false, 0, 0));
		timeUm.add(new Jogador2("Leo", 3, "Zagueiro", 76, true, 0, 0));
		timeUm.add(new Jogador2("Victorino", 4, "Zagueiro", 74, false, 0, 0));
		timeUm.add(new Jogador2("Bruno Rodrigo", 33, "Zagueiro", 73, true, 0, 0));
		timeUm.add(new Jogador2("Paulão", 86, "Zagueiro", 74, true, 0, 0));
		timeUm.add(new Jogador2("Egídio", 6, "Lateral", 73, true, 0, 0));
		timeUm.add(new Jogador2("Mayke", 32, "Lateral", 77, true, 0, 0));
		timeUm.add(new Jogador2("Ceará", 2, "Lateral", 72, false, 0, 0));
		timeUm.add(new Jogador2("Diego Renan", 98, "Lateral", 78, false, 0, 0));
		timeUm.add(new Jogador2("Everton", 23, "Lateral", 69, false, 0, 0));
		timeUm.add(new Jogador2("Lucas Silva", 16, "Meio Campo", 82, false, 0, 0));
		timeUm.add(new Jogador2("Leandro Guerreiro", 55, "Meio Campo", 72, true, 0, 0));
		timeUm.add(new Jogador2("Henrique", 8, "Meio Campo", 77, false, 0, 0));
		timeUm.add(new Jogador2("Éverton Ribeiro", 17, "Meio Campo", 84, true, 0, 0));
		timeUm.add(new Jogador2("Ricardo Goulart", 31, "Meio Campo", 84, true, 0, 0));
		timeUm.add(new Jogador2("Júlio Baptista", 10, "Meio Campo", 76, false, 0, 0));
		timeUm.add(new Jogador2("Anselmo Ramon", 99, "Atacante", 75, false, 0, 0));
		timeUm.add(new Jogador2("Vinícius Araújo", 30, "Atacante", 84, true, 0, 0));
		timeUm.add(new Jogador2("Willian", 41, "Atacante", 78, false, 0, 0));
		timeUm.add(new Jogador2("Dagoberto", 11, "Atacante", 77, false, 0, 0));
		timeUm.add(new Jogador2("Borges", 9, "Atacante", 76, true, 0, 0));

		//Instanciando time mandante
		Time cruzeiro = new Time("Cruzeiro Esporte Clube", "CRU", "02/01/1921", timeUm);

		//---------------------------------------------------------------//

		//Criando ArrayList e adicionando jogadores que compõem o timeDois
		ArrayList<Jogador2> timeDois = new ArrayList<Jogador2>();

		timeDois.add(new Jogador2("Victor", 1, "Goleiro", 79, false, 0, 0));
		timeDois.add(new Jogador2("Giovanni", 87, "Goleiro", 75, true, 0, 0));
		timeDois.add(new Jogador2("Rafael Marques", 13, "Zagueiro", 76, true, 0, 0));
		timeDois.add(new Jogador2("Gilberto Silva", 15, "Zagueiro", 75, true, 0, 0));
		timeDois.add(new Jogador2("Jemerson", 36, "Zagueiro", 72, true, 0, 0));
		timeDois.add(new Jogador2("Richarlyson", 20, "Lateral", 73, false, 0, 0));
		timeDois.add(new Jogador2("Junior Cesar", 6, "Lateral", 72, false, 0, 0));
		timeDois.add(new Jogador2("Marcos Rocha", 2, "Lateral", 81, false, 0, 0));
		timeDois.add(new Jogador2("Réver", 4, "Zagueiro", 83, true, 0, 0));
		timeDois.add(new Jogador2("Leonardo Silva", 3, "Zagueiro", 77, false, 0, 0));
		timeDois.add(new Jogador2("Carlos Cesar", 26, "Lateral", 70, true, 0, 0));
		timeDois.add(new Jogador2("Michel Macedo", 29, "Lateral", 74, false, 0, 0));
		timeDois.add(new Jogador2("Pierre", 5, "Meio Campo", 75, true, 0, 0));
		timeDois.add(new Jogador2("Lucas Cândido", 14, "Meio Campo", 75, false, 0, 0));
		timeDois.add(new Jogador2("Leandro Donizete", 8, "Meio Campo", 72, true, 0, 0));
		timeDois.add(new Jogador2("Ronaldinho", 10, "Meio Campo", 82, false, 0, 0));
		timeDois.add(new Jogador2("Diego Tardelli", 9, "Meio Campo", 79, true, 0, 0));
		timeDois.add(new Jogador2("Josué", 28, "Meio Campo", 74, true, 0, 0));
		timeDois.add(new Jogador2("Neto Berola", 25, "Atacante", 78, true, 0, 0));
		timeDois.add(new Jogador2("Jô", 7, "Atacante", 82, true, 0, 0));
		timeDois.add(new Jogador2("Guilherme", 17, "Atacante", 78, true, 0, 0));
		timeDois.add(new Jogador2("Alecsandro", 19, "Atacante", 73, true, 0, 0));
		timeDois.add(new Jogador2("Dátolo", 99, "Atacante", 73, false, 0, 0));

		//Instanciando time visitante
		Time atletico = new Time("Clube Atlético Mineiro", "CAM", "25/03/1908", timeDois);

		//Instanciando um objeto na classe Jogo
		
		Jogo jogoUm = new Jogo(cruzeiro, atletico, LocalDate.parse("26/04/2021", formatter), "Mineirão", "Belo Horizonte");
		
		//Começou a partida//
		jogoUm.gerarLesao();
		jogoUm.gerarCartoes();
		jogoUm.gerarResultado();
		
		//Fim da partida//
		jogoUm.permitirTreinamento();
	}

}
