package funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FuncionarioPrincipal {

	public static void main(String[] args) {

		String nome, sobrenome, numFuncionariosInput, valorHoraInput, horasTrabalhadasInput;
		double valorPorHora = 0;
		int horasTrabalhadas = 0, contador = 0, numFuncionarios = 0, opcao = 0, opcao2 = 0;

		//Pegando input de quantos funcion�rios ser�o cadastrados
		try {
			numFuncionariosInput = JOptionPane.showInputDialog(null, "Bem vinde � Calculadora de Sal�rio!\n"
					+ "Quantos funcion�rios gostaria de cadastrar?", "Calculadora de Sal�rio",
					JOptionPane.QUESTION_MESSAGE);
			numFuncionarios = Integer.parseInt(numFuncionariosInput);
		}

		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas n�meros inteiros.", 
					"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inesperado.", 
					"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
		}

		//Definindo um array para cadastrar o n�mero de funcion�rios especificado pelo usu�rio
		Funcionario[] funcionarios = new Funcionario[numFuncionarios];

		do {
			//Pegando input das informa��es do funcion�rio
			nome = JOptionPane.showInputDialog(null, "Informe o nome do funcion�rio:", "Calculadora de Sal�rio",
					JOptionPane.QUESTION_MESSAGE);

			sobrenome = JOptionPane.showInputDialog(null, "Agora, informe o sobrenome do funcion�rio:", "Calculadora de Sal�rio",
					JOptionPane.QUESTION_MESSAGE);

			try {
				valorHoraInput = JOptionPane.showInputDialog(null, "Qual o sal�rio desse funcion�rio por hora?", "Calculadora de Sal�rio",
						JOptionPane.QUESTION_MESSAGE);
				valorPorHora = Double.parseDouble(valorHoraInput);
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas n�meros no formato 00.00 .", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			try {
				horasTrabalhadasInput = JOptionPane.showInputDialog(null, "Informe o n�mero de horas trabalhadas pelo funcion�rio:", "Calculadora de Sal�rio",
						JOptionPane.QUESTION_MESSAGE);
				horasTrabalhadas = Integer.parseInt(horasTrabalhadasInput);
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas n�meros inteiros.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			//Criando o objeto da classe Funcionario com os atributos fornecidos pelo usu�rio e armazenando no array
			Funcionario funcionario1 = new Funcionario(nome, sobrenome);
			funcionario1.setHorasTrabalhadas(horasTrabalhadas);
			funcionario1.setValorPorHora(valorPorHora);
			funcionarios[contador] = funcionario1;

			JOptionPane.showMessageDialog(null, "Funcion�rio cadastrado com sucesso!.", 
					"Calculadora de Sal�rio", JOptionPane.INFORMATION_MESSAGE);

			contador++;
		}
		while(contador < numFuncionarios);

		//Executando os m�todos para imprimir o nome completo do funcion�rio e seu sal�rio
		//e imprimindo na tela, pois ainda n�o consegui formatar a tabela p/ imprimir pelo JOptionPane :\
		for (int i=0; i < funcionarios.length; i++) {
			System.out.println("O nome completo do funcion�rio � " + funcionarios[i].nomeCompleto()
					+ " e seu sal�rio � R$" + funcionarios[i].calcularSalario());
		}

		//Verificando se usu�rio deseja aumentar o n�mero de horas de algum funcion�rio
		Scanner input = new Scanner(System.in);

		System.out.println("\nDeseja incrementar o n�mero de horas de algum funcion�rio?");

		do {
			System.out.println("1 = SIM");
			System.out.println("2 = N�O");

			try {
				opcao = input.nextInt();
			}

			catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas 1 ou 2 para prosseguir.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Insira 1 ou 2 para prosseguir.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}
		}
		while (opcao != 1 && opcao !=2);

		if (opcao == 2) {
			System.out.println("Encerrando a aplica��o! Obrigada por utilizar a Calculadora de Sal�rio.");
		}
		else {
			System.out.println("Deseja atualizar a hora de qual funcion�rio? Digite a op��o correspondente:");
			for (int i=0; i < funcionarios.length; i++) {
				System.out.println(i + " = " + funcionarios[i].nomeCompleto() + " | Horas atuais: " + funcionarios[i].getHorasTrabalhadas());
			}
			opcao = input.nextInt();

			System.out.println("Insira o n�mero de horas extras (valor inteiro) a serem adicionadas a esse funcion�rio: ");

			try {
				opcao2 = input.nextInt();
			}

			catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite um valor inteiro.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}

			//Atualizando o n�mero de horas
			if (opcao2 < 0) {
				JOptionPane.showMessageDialog(null, "Valor de horas extras deve ser positivo.", 
						"Calculadora de Sal�rio", JOptionPane.ERROR_MESSAGE);
			}
			
			else {
				funcionarios[opcao].incrementarHoras(opcao2);
				System.out.println("Horas extras atualizadas para o funcion�rio " + funcionarios[opcao].getNome() + ".");
				System.out.println("Seu novo sal�rio � R$" + funcionarios[opcao].calcularSalario() + ".");
			}
		}

		input.close();
	}
}
