package jogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import time.Time;
import time.Jogador2;

public class Jogo {
	private Time mandante;
	private Time visitante;
	private LocalDate dataDoJogo;
	private String estadio;
	private String cidade;
	private int placarMandante;
	private int placarVisitante;

	public Jogo() {

	}


	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public LocalDate getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(LocalDate dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getPlacarMandante() {
		return placarMandante;
	}

	public void setPlacarMandante(int placarMandante) {
		this.placarMandante = placarMandante;
	}

	public int getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(int placarVisitante) {
		this.placarVisitante = placarVisitante;
	}


	public Jogo(Time mandante, Time visitante, LocalDate dataDoJogo, String estadio, String cidade) {

		this.mandante = mandante;
		this.visitante = visitante;
		this.dataDoJogo = dataDoJogo;
		this.estadio = estadio;
		this.cidade = cidade;
	}

	
	public void gerarResultado() {

		int qualiMandante = 0, qualiVisitante = 0, vitoria = 0, randomNumber = 0;

		int[] probabilidadeVitoria1 = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2}; //20% empate, 50% vitoria quali maior, 30$ vitoria quali menor
		int[] probabilidadeVitoria2 = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}; //caso as qualidades sejam iguais, maior chance de empate

		Random r = new Random();

		randomNumber = r.nextInt(probabilidadeVitoria1.length);


		//Calculando a qualidade total dos titulares do time mandante
		mandante.relacionarJogadores();
		for (Jogador2 jogador: mandante.getTitulares()) {
			qualiMandante += jogador.getQualidade();
		}

		//Calculando a qualidade total dos titulares do time visitante
		visitante.relacionarJogadores();
		for (Jogador2 jogador: visitante.getTitulares()) {
			qualiVisitante += jogador.getQualidade();
		}

		//Determinando qual time venceu com base na qualidade e na probabilidade de vencer
		if (qualiMandante > qualiVisitante) {

			vitoria = probabilidadeVitoria1[randomNumber];

			if (vitoria == 1) {
				System.out.print("O time vencedor é ");
				System.out.println(mandante.getNome());
			}

			if (vitoria == 2) {
				System.out.print("O time vencedor é ");
				System.out.println(visitante.getNome());
			}

			if (vitoria == 0) {
				System.out.println("Deu empate!");
			}
		}

		if (qualiMandante < qualiVisitante) {

			vitoria = probabilidadeVitoria1[randomNumber];

			if (vitoria == 1) {
				System.out.print("O time vencedor é ");
				System.out.println(visitante.getNome());
			}

			if (vitoria == 2) {
				System.out.print("O time vencedor é ");
				System.out.println(mandante.getNome());
			}

			if (vitoria == 0) {
				System.out.println("Deu empate!");
			}
		}

		if (qualiMandante == qualiVisitante) {

			vitoria = probabilidadeVitoria2[randomNumber];

			if (vitoria == 1) {
				System.out.print("O time vencedor é ");
				System.out.println(mandante.getNome());
			}

			if (vitoria == 2) {
				System.out.print("O time vencedor é ");
				System.out.println(visitante.getNome());
			}

			if (vitoria == 0) {
				System.out.println("Deu empate!");
			}
		}
	}


	public void gerarLesao() {
		
		int lesao, time, titular, random1, random2, random3, contador = 0;
		int[] numLesao = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}; //40% chance 0 lesão, 30% chance 1 lesão e 30% chance 2 lesões
		int[] selecionaTime = {0, 1}; //0 é mandante e 1 é visitante
		int[] selecionaTitular = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //para selecionar um dos titulares
		
		Random r = new Random();     

		random1 = r.nextInt(numLesao.length);
		lesao = numLesao[random1];

		do
		{
			random2 = r.nextInt(selecionaTime.length);
			time = selecionaTime[random2];
			
			if (time == 0) {
				ArrayList<Jogador2> titulares;
				
				mandante.relacionarJogadores();
				titulares = mandante.getTitulares();
				
				random3 = r.nextInt(selecionaTitular.length);
				titular = selecionaTitular[random3];
				
				//Chamando método sofrerLesao da classe Jogador2 para aplicar lesão no jogador selecionado
				titulares.get(titular).sofrerLesao();
				
				System.out.println("O jogador " + titulares.get(titular).getNome() + " do time " + mandante.getNome() + " foi lesionado!");	
				
			}
			
			if (time == 1) {
				ArrayList<Jogador2> titulares;
				
				visitante.relacionarJogadores();
				titulares = visitante.getTitulares();
				
				random3 = r.nextInt(selecionaTitular.length);
				titular = selecionaTitular[random3];
				
				//Chamando método sofrerLesao da classe Jogador2 para aplicar lesão no jogador selecionado
				titulares.get(titular).sofrerLesao();
				
				System.out.println("O jogador " + titulares.get(titular).getNome() + " do time " + visitante.getNome() + " foi lesionado!");
			}
			
			contador++;
		}
		while (contador < lesao);
	}

	public void gerarCartoes() {
		int cartao, time, titular, random1, random2, random3, contador = 0;
		int[] numCartao = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int[] selecionaTime = {0, 1}; //0 é mandante e 1 é visitante
		int[] selecionaTitular = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //para selecionar um dos titulares
		
		Random r = new Random();     

		random1 = r.nextInt(numCartao.length);
		cartao = numCartao[random1];

		do
		{
			random2 = r.nextInt(selecionaTime.length);
			time = selecionaTime[random2];
			
			if (time == 0) {
				ArrayList<Jogador2> titulares;
				
				mandante.relacionarJogadores();
				titulares = mandante.getTitulares();
				
				random3 = r.nextInt(selecionaTitular.length);
				titular = selecionaTitular[random3];
				
				//Chamando método sofrerLesao da classe Jogador2 para aplicar lesão no jogador selecionado
				titulares.get(titular).aplicarCartaoAmarelo(1);
				
				System.out.println("O jogador " + titulares.get(titular).getNome() + " do time " + mandante.getNome() + " foi amarelado!");	
				
			}
			
			if (time == 1) {
				ArrayList<Jogador2> titulares;
				
				visitante.relacionarJogadores();
				titulares = visitante.getTitulares();
				
				random3 = r.nextInt(selecionaTitular.length);
				titular = selecionaTitular[random3];
				
				//Chamando método sofrerLesao da classe Jogador2 para aplicar lesão no jogador selecionado
				titulares.get(titular).aplicarCartaoAmarelo(1);;
				
				System.out.println("O jogador " + titulares.get(titular).getNome() + " do time " + visitante.getNome() + " foi amarelado!!");
			}
			
			contador++;
		}
		while (contador < cartao);
	}
	
	public void permitirTreinamento() {
		
		for (Jogador2 jogador: mandante.getPlantel()) {
			
			jogador.setTreinamento(false);
		}
		
		for (Jogador2 jogador: visitante.getPlantel()) {
			
			jogador.setTreinamento(false);
		}
	}
}
