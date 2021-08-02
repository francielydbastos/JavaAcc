package sef.module4.activity;

import java.util.Scanner;

public class DriverShirt2 {

	public static void main(String[] args) {

		//Declaração de variáveis
		int resposta;
		Shirt2 camisa = new Shirt2();

		Scanner input = new Scanner(System.in);

		//Interação inicial e obtenção do input para cadastrar os objetos
		System.out.println("Deseja cadastrar uma nova camisa? Digite o número correspondente:");
		System.out.println("1 = SIM");
		System.out.println("2 = NÃO");

		resposta = input.nextInt();

		//Conferindo se o input é válido
		if (resposta != 1 && resposta != 2) {
			
			System.out.println("Desculpe-me, ainda não reconheço esse comando.");
		}

		else {
			
			//Avaliando a resposta e tomando uma decisão adequada para o caso positivo.
			if (resposta == 1) {
				
				camisa.Cadastrar();
			}

			//Tomada de decisão para o caso em que a resposta do usuário é negativa.
			if (resposta == 2) {

				System.out.println("OK! A aplicação será encerrada.");
			}

			input.close();
		}

	}

}
