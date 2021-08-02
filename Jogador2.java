package time;

import java.util.Random;

public class Jogador2 {

	private String nome;
	private int numero;
	private String posicao; //Serão consideradas: Goleiro, Zagueiro, Lateral, Meio Campo e Atacante
	private int qualidade; //0 a 100
	private boolean treinamento;
	private boolean suspenso;
	private int cartaoAmar;
	private int cartaoVerm;
	

	public Jogador2() {

	}

	public Jogador2(String nome, int numero, String posicao, int qualidade, boolean treinamento, int cartaoAmar, int cartaoVerm) {
		this.nome = nome;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.treinamento = treinamento;
		this.cartaoAmar = cartaoAmar;
		this.cartaoVerm = cartaoVerm;
	}

	public boolean isTreinamento() {
		return treinamento;
	}

	public void setTreinamento(boolean treinamento) {
		this.treinamento = treinamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}
	
	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}

	public int getCartaoAmar() {
		return cartaoAmar;
	}

	public void setCartaoAmar(int cartaoAmar) {
		this.cartaoAmar = cartaoAmar;
	}

	public int getCartaoVerm() {
		return cartaoVerm;
	}

	public void setCartaoVerm(int cartaoVerm) {
		this.cartaoVerm = cartaoVerm;
	}

	
	public void sofrerLesao() {
		int lesao;
		int[] probabilidadeLesao = {15, 10, 10, 5, 5, 5, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int randomNumber;
		Random r = new Random();     

		randomNumber = r.nextInt(probabilidadeLesao.length);
		lesao = probabilidadeLesao[randomNumber];

		if (lesao == 1 || lesao == 2) {
			qualidade -= lesao;
		}

		else {
			if (lesao == 15 || lesao == 10 || lesao == 5) {
				qualidade = qualidade - (lesao*qualidade/100);

				if (qualidade < 0) {
					qualidade = 0;
				}
			}
		}
	}

	public void executarTreinamento() {
		int melhoria;
		int[] probabilidadeTreinamento = {5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int randomNumber;
		Random r = new Random();
		
		randomNumber = r.nextInt(probabilidadeTreinamento.length);
		melhoria = probabilidadeTreinamento[randomNumber];

		if (treinamento == false) {
			qualidade += melhoria;
			treinamento = true;

			if (qualidade >= 100) {
				qualidade = 100;
			}
		}
	}
	
	
	public void aplicarCartaoAmarelo(int quantidade) {
		
		if (cartaoAmar < 2) {
			cartaoAmar += quantidade;
		}
	}

	public void aplicarCartaoVermelho() {
		cartaoVerm++;
	}

	public void cumprirSuspensao() {
		if (suspenso) {
			cartaoAmar = 0;
			cartaoVerm = 0;
		}
	}
}




