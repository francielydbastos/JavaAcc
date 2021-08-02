package funcionario;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	public Funcionario () {
		
	}
	
	public Funcionario (String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	//M�todo que imprime na tela o nome completo do funcion�rio
	public String nomeCompleto() {
		return (this.nome + " " + this.sobrenome);
	}
	
	//M�todo que calcula o sal�rio do usu�rio conforme inputs de horas trabalhadas e valor por hora
	public double calcularSalario() {
		double salario;
		
		salario = this.horasTrabalhadas * this.valorPorHora;
		
		return salario;
	}
	
	public int incrementarHoras(int horas) {
		return (this.horasTrabalhadas += horas);
	}
	
}
