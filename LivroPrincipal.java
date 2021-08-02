package livro;

import java.util.Scanner;

public class LivroPrincipal {

	public static void main(String[] args) {

		int numLivros = 0, paginasTotal = 0, paginasLidas = 0, contador = 0;
		String nomeLivro;

		Scanner input = new Scanner(System.in);
		//Um Scanner separado com delimitador para a String nomeLivro pois usando o mesmo estava causando erro ao pular a linha do scanner seguinte
		Scanner inputStr= new Scanner(System.in); 
		inputStr.useDelimiter("\n");

		System.out.println(":::Sistema de Cadastro de Livros:::");
		System.out.println("Quantos livros deseja cadastrar? ");
		numLivros = input.nextInt();

		if (numLivros <= 0) {

			System.out.println("Encerrando a aplica��o.");
		}

		//Cadastrando n�mero de livros solicitado pelo usu�rio
		if (numLivros > 0) {

			Livro[] livrosLista = new Livro [numLivros];

			do {

				System.out.println("Qual o nome do livro?");
				nomeLivro = inputStr.nextLine();

				System.out.println("Quantas p�ginas tem o livro " + nomeLivro + "?");
				paginasTotal = input.nextInt();

				System.out.println("Quantas p�ginas do livro voc� j� leu?");
				paginasLidas = input.nextInt();

				System.out.println("\nLivro cadastrado com sucesso!\n");
				
				Livro livrosCadastro = new Livro(nomeLivro, paginasTotal, paginasLidas);
				livrosLista[contador] = livrosCadastro;

				contador++;
			}
			while (contador < numLivros);

			//Imprimindo e calculando p�ginas lidas
			System.out.println("\n:::::Livros Cadastrados:::::\n");
			for (Livro livro : livrosLista) {
				System.out.println("NOME: " + livro.getTitulo() + " :: N� P�GINAS: " + livro.getQtdPaginas() + 
						" :: P�GINAS LIDAS: " + livro.getPaginasLidas());
				System.out.println("PROGRESSO: " + livro.verificarProgresso() + "%\n");
			}

			System.out.println("\nEncerrando a aplica��o!");
		}


		input.close();
		inputStr.close();
	}
}