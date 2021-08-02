package sef.module4.activity;

import java.util.Scanner;

public class DriverShirt2 {

	public static void main(String[] args) {

		//Declara��o de vari�veis
		int resposta;
		Shirt2 camisa = new Shirt2();

		Scanner input = new Scanner(System.in);

		//Intera��o inicial e obten��o do input para cadastrar os objetos
		System.out.println("Deseja cadastrar uma nova camisa? Digite o n�mero correspondente:");
		System.out.println("1 = SIM");
		System.out.println("2 = N�O");

		resposta = input.nextInt();

		//Conferindo se o input � v�lido
		if (resposta != 1 && resposta != 2) {
			
			System.out.println("Desculpe-me, ainda n�o reconhe�o esse comando.");
		}

		else {
			
			//Avaliando a resposta e tomando uma decis�o adequada para o caso positivo.
			if (resposta == 1) {
				
				camisa.Cadastrar();
			}

			//Tomada de decis�o para o caso em que a resposta do usu�rio � negativa.
			if (resposta == 2) {

				System.out.println("OK! A aplica��o ser� encerrada.");
			}

			input.close();
		}

	}

}
