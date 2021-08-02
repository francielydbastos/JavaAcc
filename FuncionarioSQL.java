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

		//Cadastrando o usu�rio
		nomeInput = JOptionPane.showInputDialog(null, "Qual o nome do funcion�rio?", 
				"Sistema de Cadastro de Funcion�rios",
				JOptionPane.QUESTION_MESSAGE);

		posicaoInput = JOptionPane.showInputDialog(null, "Qual a fun��o do funcion�rio?", 
				"Sistema de Cadastro de Funcion�rios",
				JOptionPane.QUESTION_MESSAGE);

		salarioInput = JOptionPane.showInputDialog(null, "Qual o sal�rio do funcion�rio?\n <formato 00.00>", 
				"Sistema de Cadastro de Funcion�rios",
				JOptionPane.QUESTION_MESSAGE);
		salarioDouble = Double.parseDouble(salarioInput);

		try{
			String url = "jdbc:mysql://localhost/funcionario";
			String user = "root";
			String pass = "root";

			//Obtendo conex�o
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");

			//Criando o prepared statement
			PreparedStatement pStmt = cn.prepareStatement("insert into Funcionarios values(?,?,?)");

			//Alterando par�metros do preparedStatement
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
			
			System.out.println(":::::Funcion�rios Cadastrados:::::");
			
			System.out.println("\tNome\tFun��o\tSal�rio");
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