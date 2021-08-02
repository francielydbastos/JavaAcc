package funcion�rio.atv7;

import java.time.LocalDate;

public class FuncionarioAtv7 {

	private String nome;
	private String cpf;
	private String matricula;
	private double salario; //sal�rio bruto
	private LocalDate dataAdmissao;	

	//M�todos Construtores
	public FuncionarioAtv7() {

	}

	public FuncionarioAtv7(String nome, String cpf, String matricula, double salario, LocalDate dataAdmissao) {

		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}


	//Getters e Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}



	public void receberAumento(double aumento) {

		salario += aumento;
	}

	public double calcularGanhoBrutoAnual() {

		double ganhoBrutoAnual;
		
		return (ganhoBrutoAnual = 13 * salario); //Considerando o 13� sal�rio
	}

	//Calcula o imposto anual pago pelo funcion�rio, considerando descontos do INSS e IR
	public double calcularImposto() {

		double impostoAnual;

		//Descontos de 11% do INSS e, APENAS PARA SAL�RIO ACIMA DE R$2500, descontos de 17,5% do valor excedente a 2500
		//Considerando que a base de c�lculo para o IR � o salario bruto - desconto do INSS
		//Considerando tamb�m o 13� sal�rio

		if (salario > 2500) {

			return (impostoAnual = ( ((salario * 0.11) - 2500) * 0.175) * 13);
		}

		else {

			return (impostoAnual = (salario * 0.11) * 13);
		}
	}

	public double calcularGanhoLiquidoMensal() {

		double salarioLiquido;

		//Descontos de 11% do INSS e, APENAS PARA SAL�RIO ACIMA DE R$2500, descontos de 17,5% do valor excedente a 2500
		//Considerando que a base de c�lculo para o IR � o salario bruto - desconto do INSS
		
		if (salario > 2500) {

			return (salarioLiquido = (salario - ( ( (salario * 0.11) - 2500) * 0.175) ) );
		}

		else {

			return (salarioLiquido = (salario - (salario * 0.11) ) );
		}
	}

	public double calcularGanhoLiquidoAnual() {
		
		return (this.calcularGanhoBrutoAnual() - this.calcularImposto()); //Ganho bruto anual - imposto total anual
		
	}

}
