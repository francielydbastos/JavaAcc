package funcion�rio.atv7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFuncionarioAtv7 {

	public static void main(String[] args) {

		int numFuncionarios = 0, contador = 0;
		double salario;
		String nome, cpf, matricula, admissao;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		Scanner input = new Scanner(System.in);

		System.out.println(":::Bem vinde ao Sistema de Cadastro de Funcion�rios.:::");
		System.out.println("Quantos funcion�rios deseja cadastrar? ");

		try {
			validaInput(numFuncionarios = input.nextInt());
		}

		catch (InputMismatchException e) {
			System.out.println("O valor inserido n�o � reconhecido. Favor inserir apenas valores num�ricos.");
		}

		catch (Exception FuncInputCustomException) {
			System.out.println(FuncInputCustomException);
		}

		if (numFuncionarios > 0) {

			FuncionarioAtv7[] funcionariosLista = new FuncionarioAtv7 [numFuncionarios];

			do {

				System.out.println("Insira o nome do funcion�rio:");
				nome = input.next();

				System.out.println("Insira o cpf do funcion�rio:");
				cpf = input.next();

				System.out.println("Insira a matr�cula do funcion�rio:");
				matricula = input.next();

				System.out.println("Insira a data de admiss�o do funcion�rio (formato DD/MM/AAAA):");
				admissao = input.next();

				System.out.println("Insira o sal�rio do funcion�rio (Formato 0000,00): R$");
				salario = input.nextDouble();


				FuncionarioAtv7 funcionario = new FuncionarioAtv7(nome, cpf, matricula, salario, LocalDate.parse(admissao, formatter));
				funcionariosLista[contador] = funcionario;

				contador++;
			}
			while (contador < numFuncionarios);

			//Imprimindo informa��es sobre os funcion�rios
			imprimirLista(funcionariosLista);

			//

			System.out.println("::Obrigada por usar o Sistema de Cadastro de Funcion�rios.::");

			input.close();
		}

		else {
			
			System.out.println("::Obrigada por usar o Sistema de Cadastro de Funcion�rios.::");
			
			input.close();
		}
	}






	//M�todo para impress�o da lista dos funcion�rios
	public static void imprimirLista(FuncionarioAtv7[] listaFunc) {

		for (FuncionarioAtv7 funcionario: listaFunc) {

			System.out.println("\nNOME: " + funcionario.getNome() + " | MATR�CULA: " + funcionario.getMatricula() + 
					"\nSAL�RIO L�QUIDO MENSAL: R$" + funcionario.calcularGanhoLiquidoMensal() + " | SAL�RIO L�QUIDO ANUAL: R$" +
					funcionario.calcularGanhoLiquidoAnual());

			System.out.println("\n------------------------------------------------------------------");
		}
	}

	//M�todo para pegar exce��o quando usu�rio insere 0
	public static void validaInput(int input) throws FuncInputCustomException {
		if (input <= 0) {
			throw new FuncInputCustomException("Valor deve ser maior que zero!");
		}
	}
}
