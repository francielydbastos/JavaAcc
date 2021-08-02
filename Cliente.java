package sef.module4.activity;

public class Cliente {
	
	String nomeCliente;
	String sobrenomeCliente;
	String cpfCliente;
	
	
	//Método construtor vazio
	public Cliente () {
		
	}
	
	//Método construtor
	public Cliente (String nomeCliente, String sobrenomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	//Métodos 'set' para os diferentes atributos da classe Cliente
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	//Métodos 'get' para os diferentes atributos da classe Cliente
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	
	//Definindo o método Exibir, que apresenta o nome do cliente na tela
	public void Exibir() {
		System.out.println("O nome do cliente é " + nomeCliente);
	}
}
