package sef.module4.activity;

public class Cliente {
	
	String nomeCliente;
	String sobrenomeCliente;
	String cpfCliente;
	
	
	//M�todo construtor vazio
	public Cliente () {
		
	}
	
	//M�todo construtor
	public Cliente (String nomeCliente, String sobrenomeCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	//M�todos 'set' para os diferentes atributos da classe Cliente
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	//M�todos 'get' para os diferentes atributos da classe Cliente
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	
	//Definindo o m�todo Exibir, que apresenta o nome do cliente na tela
	public void Exibir() {
		System.out.println("O nome do cliente � " + nomeCliente);
	}
}
