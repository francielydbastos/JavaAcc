package funcionario.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class FuncionarioSQL {

	public static void main (String[] args) {


		String nomeInput, posicaoInput, salarioInput;
		double salarioDouble;

		//Cadastrando o usuário
		nomeInput = JOptionPane.showInputDialog(null, "Qual o nome do funcionário?", 
				"Sistema de Cadastro de Funcionários",
				JOptionPane.QUESTION_MESSAGE);

		posicaoInput = JOptionPane.showInputDialog(null, "Qual a função do funcionário?", 
				"Sistema de Cadastro de Funcionários",
				JOptionPane.QUESTION_MESSAGE);

		salarioInput = JOptionPane.showInputDialog(null, "Qual o salário do funcionário?\n <formato 00.00>", 
				"Sistema de Cadastro de Funcionários",
				JOptionPane.QUESTION_MESSAGE);
		salarioDouble = Double.parseDouble(salarioInput);

		try{
			String url = "jdbc:mysql://localhost/funcionario";
			String user = "root";
			String pass = "root";

			//Obtendo conexão
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			//Criando o prepared statement
			PreparedStatement pStmt = cn.prepareStatement("insert into Funcionarios values(?,?,?)");

			//Alterando parâmetros do preparedStatement
			pStmt.setString(1, nomeInput);
			pStmt.setString(2, posicaoInput);
			pStmt.setDouble(3, salarioDouble);

			//Executando a query
			int rows = pStmt.executeUpdate();
			cn.commit();	
			System.out.println(rows + " row(s) added!");
			System.out.println();


			//Imprimindo tabela completa
			ResultSet rs = pStmt.executeQuery("SELECT * FROM Funcionarios");
			
			System.out.println(":::::Funcionários Cadastrados:::::");
			
			System.out.println("\tNome\tFunção\tSalário");
			while (rs.next()) {
				String name = rs.getString("nome");
				String job = rs.getString("funcao");
				double salario = rs.getDouble("salario");
				System.out.println(name+" | "+job+" | "+salario);
			}

			cn.close();
		}

		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}
}