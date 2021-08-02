package sef.module4.activity;

public class ContaCorrente {
	
	//Definindo atributos
	private Cliente dadosCliente;
	private String numeroConta;
	private float saldo;
	private String data;

	//Definindo o método construtor vazio...
	public ContaCorrente () {
		
	}
	
	//...E o método construtor com os parâmetros
	public ContaCorrente (Cliente dadosCliente, String numeroConta, float saldo, String data) {
		this.dadosCliente = dadosCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.data = data;
	}
	
	//Definindo o método Depositar
	public void Depositar(float valorDeposito) {
		
		System.out.println("O saldo da conta antes da operação é: R$" + saldo);
		System.out.println("Depósito em andamento...");
		
		saldo = saldo + valorDeposito;
		
		System.out.println("Depósito realizado. Saldo atual: R$" + saldo);
		
	}
	
	//Definindo o método Sacar
	public void Sacar (float valorSaque) {
		
		if (saldo > valorSaque) {
			
			System.out.println("O saldo da conta antes da operação é: R$" + saldo);
			System.out.println("Depósito em andamento...");
			
			saldo = saldo - valorSaque;
			
			System.out.println("Saque realizado. Saldo atual: R$" + saldo);
		}
		
		else {
			
			System.out.println("Saldo insuficiente para o saque.");
			System.out.println("Saldo disponível: " + saldo);
		}

		
	}
	//Definindo o método Transferir
	public void Transferir (ContaCorrente contaOrigem, ContaCorrente contaDestino, float valorTransfer) {
		
		//Sacando valor da conta de origem
		if (contaOrigem.saldo > valorTransfer) {
			
			contaOrigem.saldo = contaOrigem.saldo - valorTransfer;
			
			//Depositando valor na conta de destino
			
			contaDestino.saldo = contaDestino.saldo + valorTransfer;
			
			System.out.println("Transferência realizada. Saldo atual da conta de origem é: R$" + contaOrigem.saldo);
		}
		
		else {
			
			System.out.println("Saldo insuficiente para transferência.");
			System.out.println("Saldo disponível: " + contaOrigem.saldo);
		}
		
	}
	
}
