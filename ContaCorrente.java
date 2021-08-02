package sef.module4.activity;

public class ContaCorrente {
	
	//Definindo atributos
	private Cliente dadosCliente;
	private String numeroConta;
	private float saldo;
	private String data;

	//Definindo o m�todo construtor vazio...
	public ContaCorrente () {
		
	}
	
	//...E o m�todo construtor com os par�metros
	public ContaCorrente (Cliente dadosCliente, String numeroConta, float saldo, String data) {
		this.dadosCliente = dadosCliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.data = data;
	}
	
	//Definindo o m�todo Depositar
	public void Depositar(float valorDeposito) {
		
		System.out.println("O saldo da conta antes da opera��o �: R$" + saldo);
		System.out.println("Dep�sito em andamento...");
		
		saldo = saldo + valorDeposito;
		
		System.out.println("Dep�sito realizado. Saldo atual: R$" + saldo);
		
	}
	
	//Definindo o m�todo Sacar
	public void Sacar (float valorSaque) {
		
		if (saldo > valorSaque) {
			
			System.out.println("O saldo da conta antes da opera��o �: R$" + saldo);
			System.out.println("Dep�sito em andamento...");
			
			saldo = saldo - valorSaque;
			
			System.out.println("Saque realizado. Saldo atual: R$" + saldo);
		}
		
		else {
			
			System.out.println("Saldo insuficiente para o saque.");
			System.out.println("Saldo dispon�vel: " + saldo);
		}

		
	}
	//Definindo o m�todo Transferir
	public void Transferir (ContaCorrente contaOrigem, ContaCorrente contaDestino, float valorTransfer) {
		
		//Sacando valor da conta de origem
		if (contaOrigem.saldo > valorTransfer) {
			
			contaOrigem.saldo = contaOrigem.saldo - valorTransfer;
			
			//Depositando valor na conta de destino
			
			contaDestino.saldo = contaDestino.saldo + valorTransfer;
			
			System.out.println("Transfer�ncia realizada. Saldo atual da conta de origem �: R$" + contaOrigem.saldo);
		}
		
		else {
			
			System.out.println("Saldo insuficiente para transfer�ncia.");
			System.out.println("Saldo dispon�vel: " + contaOrigem.saldo);
		}
		
	}
	
}
