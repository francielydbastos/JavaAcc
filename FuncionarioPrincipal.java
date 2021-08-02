package funcionario;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FuncionarioPrincipal {

	public static void main(String[] args) {

		String nome, sobrenome, numFuncionariosInput, valorHoraInput, horasTrabalhadasInput;
		double valorPorHora = 0;
		int horasTrabalhadas = 0, contador = 0, numFuncionarios = 0, opcao = 0, opcao2 = 0;

		//Pegando input de quantos funcionários serão cadastrados
		try {
			numFuncionariosInput = JOptionPane.showInputDialog(null, "Bem vinde à Calculadora de Salário!\n"
					+ "Quantos funcionários gostaria de cadastrar?", "Calculadora de Salário",
					JOptionPane.QUESTION_MESSAGE);
			numFuncionarios = Integer.parseInt(numFuncionariosInput);
		}

		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas números inteiros.", 
					"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
		}

		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor inesperado.", 
					"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
		}

		//Definindo um array para cadastrar o número de funcionários especificado pelo usuário
		Funcionario[] funcionarios = new Funcionario[numFuncionarios];

		do {
			//Pegando input das informações do funcionário
			nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário:", "Calculadora de Salário",
					JOptionPane.QUESTION_MESSAGE);

			sobrenome = JOptionPane.showInputDialog(null, "Agora, informe o sobrenome do funcionário:", "Calculadora de Salário",
					JOptionPane.QUESTION_MESSAGE);

			try {
				valorHoraInput = JOptionPane.showInputDialog(null, "Qual o salário desse funcionário por hora?", "Calculadora de Salário",
						JOptionPane.QUESTION_MESSAGE);
				valorPorHora = Double.parseDouble(valorHoraInput);
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas números no formato 00.00 .", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			try {
				horasTrabalhadasInput = JOptionPane.showInputDialog(null, "Informe o número de horas trabalhadas pelo funcionário:", "Calculadora de Salário",
						JOptionPane.QUESTION_MESSAGE);
				horasTrabalhadas = Integer.parseInt(horasTrabalhadasInput);
			}

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas números inteiros.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			//Criando o objeto da classe Funcionario com os atributos fornecidos pelo usuário e armazenando no array
			Funcionario funcionario1 = new Funcionario(nome, sobrenome);
			funcionario1.setHorasTrabalhadas(horasTrabalhadas);
			funcionario1.setValorPorHora(valorPorHora);
			funcionarios[contador] = funcionario1;

			JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!.", 
					"Calculadora de Salário", JOptionPane.INFORMATION_MESSAGE);

			contador++;
		}
		while(contador < numFuncionarios);

		//Executando os métodos para imprimir o nome completo do funcionário e seu salário
		//e imprimindo na tela, pois ainda não consegui formatar a tabela p/ imprimir pelo JOptionPane :\
		for (int i=0; i < funcionarios.length; i++) {
			System.out.println("O nome completo do funcionário é " + funcionarios[i].nomeCompleto()
					+ " e seu salário é R$" + funcionarios[i].calcularSalario());
		}

		//Verificando se usuário deseja aumentar o número de horas de algum funcionário
		Scanner input = new Scanner(System.in);

		System.out.println("\nDeseja incrementar o número de horas de algum funcionário?");

		do {
			System.out.println("1 = SIM");
			System.out.println("2 = NÃO");

			try {
				opcao = input.nextInt();
			}

			catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite apenas 1 ou 2 para prosseguir.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Insira 1 ou 2 para prosseguir.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}
		}
		while (opcao != 1 && opcao !=2);

		if (opcao == 2) {
			System.out.println("Encerrando a aplicação! Obrigada por utilizar a Calculadora de Salário.");
		}
		else {
			System.out.println("Deseja atualizar a hora de qual funcionário? Digite a opção correspondente:");
			for (int i=0; i < funcionarios.length; i++) {
				System.out.println(i + " = " + funcionarios[i].nomeCompleto() + " | Horas atuais: " + funcionarios[i].getHorasTrabalhadas());
			}
			opcao = input.nextInt();

			System.out.println("Insira o número de horas extras (valor inteiro) a serem adicionadas a esse funcionário: ");

			try {
				opcao2 = input.nextInt();
			}

			catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado. Por gentileza digite um valor inteiro.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inesperado.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}

			//Atualizando o número de horas
			if (opcao2 < 0) {
				JOptionPane.showMessageDialog(null, "Valor de horas extras deve ser positivo.", 
						"Calculadora de Salário", JOptionPane.ERROR_MESSAGE);
			}
			
			else {
				funcionarios[opcao].incrementarHoras(opcao2);
				System.out.println("Horas extras atualizadas para o funcionário " + funcionarios[opcao].getNome() + ".");
				System.out.println("Seu novo salário é R$" + funcionarios[opcao].calcularSalario() + ".");
			}
		}

		input.close();
	}
}
