package sef.module4.activity;

import java.util.Scanner;

public class PrincipalContaCorrente {

	public static void main(String[] args) {

		//Definindo vari�veis
		int operacao, escolhaCliente;
		float valor;

		Scanner input = new Scanner(System.in);

		//Instanciando objetos da classe Cliente
		Cliente cliente1 = new Cliente("Namjoon", "Kim", "100.500.333-94");
		Cliente cliente2 = new Cliente("Seokjin", "Kim", "111.222.333-92");
		Cliente cliente3 = new Cliente("Yoongi", "Min", "109.003.555-93");
		Cliente cliente4 = new Cliente("Hoseok", "Jung", "118.002.394-94");
		Cliente cliente5 = new Cliente("Jimin", "Park", "113.110.095-95");
		Cliente cliente6 = new Cliente("Taehyung", "Kim", "130.112.095-95");
		Cliente cliente7 = new Cliente("Jungkook", "Jeon", "101.209.197-97");

		//Instanciando contas correntes para os clientes cadastrados
		ContaCorrente conta1 = new ContaCorrente(cliente1, "120994-7", (float) 5799.00, "25/04/2021");
		ContaCorrente conta2 = new ContaCorrente(cliente2, "041292-7", (float) 20510.00, "30/04/2021");
		ContaCorrente conta3 = new ContaCorrente(cliente3, "090393-7", (float) 300.00, "30/05/2021");
		ContaCorrente conta4 = new ContaCorrente(cliente4, "940218-7", (float) 400.00, "28/02/2021");
		ContaCorrente conta5 = new ContaCorrente(cliente5, "951013-7", (float) 115.00, "19/01/2021");
		ContaCorrente conta6 = new ContaCorrente(cliente6, "301295-7", (float) 739.00, "14/04/2021");
		ContaCorrente conta7 = new ContaCorrente(cliente7, "010997-7", (float) 1234.00, "18/03/2021");

		//Executando m�todos de saque e dep�sito

		System.out.println("Qual opera��o deseja realizar? Digite o n�mero conforme a opera��o desejada.");
		System.out.println("1 = SAQUE");
		System.out.println("2 = DEP�SITO");
		System.out.println("3 = TRANSFER�NCIA \\Em implementa��o\\");

		operacao = input.nextInt();

		if (operacao != 1 && operacao != 2 && operacao != 3) {

			System.out.println("Comando n�o reconhecido.");
		}

		else {

			if (operacao == 1) {

				System.out.println("Insira o valor a ser sacado (formato 00,00): ");
				valor = input.nextFloat();
				
				escolhaCliente = EscolhaCliente();

				if (escolhaCliente != 1 && escolhaCliente != 2 && escolhaCliente != 3 && 
						escolhaCliente != 4 && escolhaCliente != 5 && 
						escolhaCliente != 6 && escolhaCliente != 7) {
					System.out.println("Conta n�o cadastrada no banco de dados.");
				}

				else {
					if (escolhaCliente == 1) {
						conta1.Sacar(valor);
					}

					if (escolhaCliente == 2) {
						conta2.Sacar(valor);
					}

					if (escolhaCliente == 3) {
						conta3.Sacar(valor);
					}

					if (escolhaCliente == 4) {
						conta4.Sacar(valor);
					}

					if (escolhaCliente == 5) {
						conta5.Sacar(valor);
					}

					if (escolhaCliente == 6) {
						conta6.Sacar(valor);
					}

					if (escolhaCliente == 7) {
						conta7.Sacar(valor);
					}
				}

			}


			if (operacao == 2) {

				System.out.println("Insira o valor a ser depositado (formato 00,00): ");
				valor = input.nextFloat();
				
				escolhaCliente = EscolhaCliente();

				if (escolhaCliente != 1 && escolhaCliente != 2 && escolhaCliente != 3 && 
						escolhaCliente != 4 && escolhaCliente != 5 && 
						escolhaCliente != 6 && escolhaCliente != 7) {
					System.out.println("Conta n�o cadastrada no banco de dados.");
				}

				else {
					if (escolhaCliente == 1) {
						conta1.Depositar(valor);
					}

					if (escolhaCliente == 2) {
						conta2.Depositar(valor);
					}

					if (escolhaCliente == 3) {
						conta3.Depositar(valor);
					}

					if (escolhaCliente == 4) {
						conta4.Depositar(valor);
					}

					if (escolhaCliente == 5) {
						conta5.Depositar(valor);
					}

					if (escolhaCliente == 6) {
						conta6.Depositar(valor);
					}

					if (escolhaCliente == 7) {
						conta7.Depositar(valor);
					}
				}

			}

			if (operacao == 3) {
				//Em implementa��o para que o usu�rio escolha as contas envolvidas na transa��o
				//				System.out.println("Selecione a conta de origem da transfer�ncia: ");
				//				escolhaCliente = EscolhaCliente();
				//				
				//				System.out.println("Selecione a conta de destino da transfer�ncia: ");
				//				escolhaCliente2 = EscolhaCliente();

				System.out.println("A opera��o de transfer�ncia est� em implementa��o.");
				System.out.println("A seguir uma simula��o de transfer�ncia"
						+ " da conta de Jimin Park para a conta de Jungkook Jeon.");

				System.out.println("Insira o valor a ser transferido (formato 00,00): ");
				valor = input.nextFloat();
				
				conta1.Transferir(conta5, conta7, valor);

			}
		}

		input.close();
	}






	//M�todo para escolher um cliente para a realiza��o da opera��o
	public static int EscolhaCliente() {

		int escolha;

		Scanner input = new Scanner(System.in);

		System.out.println("Qual o nome do cliente? Digite o n�mero conforme a op��o desejada.");
		System.out.println("1 = Namjoon Kim");
		System.out.println("2 = Seokjin Kim");
		System.out.println("3 = Yoongi Min");
		System.out.println("4 = Hoseok Jung");
		System.out.println("5 = Jimin Park");
		System.out.println("6 = Taehyung Kim");
		System.out.println("7 = Jungkook Jeon");

		escolha = input.nextInt();

		input.close();

		return escolha;
	}
}


