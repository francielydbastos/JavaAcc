package time;

import java.util.ArrayList;
import java.util.Collections;
import time.ComparaQualidade;

public class Time {
	private String nome;
	private String sigla;
	private String fundacao;
	private ArrayList<Jogador2> plantel;
	private ArrayList<Jogador2> relacionados;

	public Time() {

	}

	public Time(String nome, String sigla, String fundacao, ArrayList<Jogador2> plantel) {
		this.nome = nome;
		this.sigla = sigla;
		this.fundacao = fundacao;
		this.plantel = plantel;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setApelido(String sigla) {
		this.sigla = sigla;
	}

	public String getFundacao() {
		return fundacao;
	}

	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}

	public ArrayList<Jogador2> getPlantel() {
		return plantel;
	}

	public void setPlantel(ArrayList<Jogador2> plantel) {
		this.plantel = plantel;
	}

	public ArrayList<Jogador2> getRelacionados() {
		return relacionados;
	}

	public void setRelacionados(ArrayList<Jogador2> relacionados) {
		this.relacionados = relacionados;
	}

	//Método que seleciona 11 titulares e 7 reservas, conforme sua qualidade
	//Ainda será atualizado para levar em consideração as posições
	public void relacionarJogadores() {

		ArrayList<Jogador2> relacionados = new ArrayList<Jogador2>();
		this.relacionados = relacionados;

		int numRelacionados = 18;

		//Organizando Array em ordem decrescente de qualidade
		Collections.sort(plantel, new ComparaQualidade());

		//imprimindo a lista dos relacionados
		System.out.println(" ");
		for (int i = 0; i < numRelacionados; i++) {

			relacionados.add(plantel.get(i));

			System.out.println(relacionados.get(i).getNumero() + " " + relacionados.get(i).getNome() + " (Posição: " + relacionados.get(i).getPosicao()
					+ " | Qualidade: " + relacionados.get(i).getQualidade() + ")");
		}

		
	}

}
