package jogador;

import java.util.Random;

public class Jogador {

	private int id;
	private String nome;
	private String apelido;
	private String dataNascimento;
	private int numero;
	private String posicao;
	private int qualidade; //0 a 100
	private int cartoes; //número de cartões amarelos recebidos pelo jogador, vai de 0 a 3
	private int cartaoVerm; //número de cartões vermelhos recebidos pelo jogador, vai de 0 a 1
	private boolean tribunal; //determina se jogador foi ou não suspenso pelo tribunal
	private boolean treinamento; //determina se o jogador treinou ou não
	private boolean suspenso;

	public Jogador() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public int getCartaoVerm() {
		return cartaoVerm;
	}

	public void seCartaoVerm(int cartaoVerm) {
		this.cartaoVerm = cartaoVerm;
	}

	public boolean isTribunal() {
		return tribunal;
	}

	public void setTribunal(boolean tribunal) {
		this.tribunal = tribunal;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}

	public boolean isTreinamento() {
		return treinamento;
	}

	public void setTreinamento(boolean treinamento) {
		this.treinamento = treinamento;
	}


	public Jogador (int id, String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade, int cartoes,
			int cartaoVerm, boolean tribunal, boolean treinamento) {
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade; 
		this.cartoes = cartoes;
		this.cartaoVerm = cartaoVerm;
		this.tribunal = tribunal;
		this.treinamento = treinamento;
	}

	public String verificarCondicaoDeJogo() {
		String suspensao = "";
		if (cartoes >= 3 || cartaoVerm == 1 || tribunal == true) {

			suspenso = true;

			return (suspensao = "Suspenso!");
		}

		else {
			suspenso = false;

			if (cartoes == 2) {
				return (suspensao = "Pendurado!");
			}
			else {
				return (suspensao = "Tá tranquilo!");
			}
		}

	}

	public void aplicarCartaoAmarelo(int quantidade) {
		cartoes += quantidade;
	}

	public void aplicarCartaoVermelho() {
		cartaoVerm++;
	}

	public void cumprirSuspensao() {
		if (suspenso) {
			cartoes = 0;
			cartaoVerm = 0;
			tribunal = false;
		}
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
}
