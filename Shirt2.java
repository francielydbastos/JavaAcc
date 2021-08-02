package sef.module4.activity;

import java.util.Scanner;

public class Shirt2 {

	//Definindo os atributos da classe Shirt
	private String description;
	private String colorCode;
	private float price; 

	//Definindo o método construtor vazio
	public Shirt2 () {

	}

	//Definindo o método construtor
	public Shirt2 (String description, String colorCode, float price) {
		this.description = description;
		this.colorCode = colorCode;
		this.price = price;
	}

	//Definindo o método Display, que imprime as características do objeto
	public void Display () {

		System.out.println("A descrição dessa camisa é: " + description);
		System.out.println("A cor da camisa é: " + colorCode);
		System.out.println("O preço dessa camisa é: " + price);
	}

	//Define o método Cadastrar, que cadastra novas camisas conforme input e as imprime
	public void Cadastrar() {

		int numCamisas = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Quantas camisas deseja cadastrar?");
		numCamisas = input.nextInt();

		//Verificando se o número de camisas a ser cadastrado é de pelo menos 1.
		if (numCamisas < 1) {

			System.out.println("Mínimo valor para registro é 1.");
		}

		else {

			Shirt2[] camisas = new Shirt2[numCamisas];
			
			for (int i=0; i < numCamisas; i++) {

				System.out.println("Insira uma descrição para a camisa:");
				description = input.next();

				System.out.println("Insira o preço da camisa (formato 00,00):");
				price = input.nextFloat();

				System.out.println("Insira a cor da camisa:");
				colorCode = input.next();

				Shirt2 camisa = new Shirt2(description, colorCode, price);
				camisas[i] = camisa;
				
				camisa.Display();
				System.out.println("");
			}

			System.out.println("Camisas registradas.");

			input.close();
		}

	}

}
