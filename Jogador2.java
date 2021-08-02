package time;

public class Jogador2 {

	private String nome;
	private int numero;
	private String posicao; //Serão consideradas: Goleiro, Zagueiro, Lateral, Meio Campo e Atacante
	private int qualidade; //0 a 100

	public Jogador2() {

	}

	public Jogador2(String nome, int numero, String posicao, int qualidade) {
		this.nome = nome;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
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

}




