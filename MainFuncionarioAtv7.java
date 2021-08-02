package funcionário.atv7;

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

		System.out.println(":::Bem vinde ao Sistema de Cadastro de Funcionários.:::");
		System.out.println("Quantos funcionários deseja cadastrar? ");

		try {
			validaInput(numFuncionarios = input.nextInt());
		}

		catch (InputMismatchException e) {
			System.out.println("O valor inserido não é reconhecido. Favor inserir apenas valores numéricos.");
		}

		catch (Exception FuncInputCustomException) {
			System.out.println(FuncInputCustomException);
		}

		if (numFuncionarios > 0) {

			FuncionarioAtv7[] funcionariosLista = new FuncionarioAtv7 [numFuncionarios];

			do {

				System.out.println("Insira o nome do funcionário:");
				nome = input.next();

				System.out.println("Insira o cpf do funcionário:");
				cpf = input.next();

				System.out.println("Insira a matrícula do funcionário:");
				matricula = input.next();

				System.out.println("Insira a data de admissão do funcionário (formato DD/MM/AAAA):");
				admissao = input.next();

				System.out.println("Insira o salário do funcionário (Formato 0000,00): R$");
				salario = input.nextDouble();


				FuncionarioAtv7 funcionario = new FuncionarioAtv7(nome, cpf, matricula, salario, LocalDate.parse(admissao, formatter));
				funcionariosLista[contador] = funcionario;

				contador++;
			}
			while (contador < numFuncionarios);

			//Imprimindo informações sobre os funcionários
			imprimirLista(funcionariosLista);

			//

			System.out.println("::Obrigada por usar o Sistema de Cadastro de Funcionários.::");

			input.close();
		}

		else {
			
			System.out.println("::Obrigada por usar o Sistema de Cadastro de Funcionários.::");
			
			input.close();
		}
	}






	//Método para impressão da lista dos funcionários
	public static void imprimirLista(FuncionarioAtv7[] listaFunc) {

		for (FuncionarioAtv7 funcionario: listaFunc) {

			System.out.println("\nNOME: " + funcionario.getNome() + " | MATRÍCULA: " + funcionario.getMatricula() + 
					"\nSALÁRIO LÍQUIDO MENSAL: R$" + funcionario.calcularGanhoLiquidoMensal() + " | SALÁRIO LÍQUIDO ANUAL: R$" +
					funcionario.calcularGanhoLiquidoAnual());

			System.out.println("\n------------------------------------------------------------------");
		}
	}

	//Método para pegar exceção quando usuário insere 0
	public static void validaInput(int input) throws FuncInputCustomException {
		if (input <= 0) {
			throw new FuncInputCustomException("Valor deve ser maior que zero!");
		}
	}
}
