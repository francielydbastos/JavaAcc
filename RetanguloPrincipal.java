import javax.swing.JOptionPane;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		
		//Definindo vari�veis
		String primeiroLado, segundoLado;
		double lado1, lado2, area, perimetro;
		int opcao;
		
		//Intera��o inicial com o usu�rio
		JOptionPane.showMessageDialog(null, "Bem vinde ao Ret�ngulo Calculator!\nInsira os dados a "
				+ "seguir para obter dados de �rea e per�metro. \nAten��o: dimens�es em decimal devem ser inseridas com '.' e n�o ',' !", 
				"Ret�ngulo Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			//Pegando input das dimens�es do ret�ngulo com o usu�rio
			primeiroLado = JOptionPane.showInputDialog(null, "Informe o primeiro lado do ret�ngulo:", "Ret�ngulo Calculator",
					JOptionPane.QUESTION_MESSAGE);
			segundoLado = JOptionPane.showInputDialog(null, "Informe o segundo lado do ret�ngulo:", "Ret�ngulo Calculator", 
					JOptionPane.QUESTION_MESSAGE);
			
			//Convertendo as strings com o valor dos lados para valores primitivos double
			lado1 = Double.parseDouble(primeiroLado);
			lado2 = Double.parseDouble(segundoLado);
			
			//Criando o objeto da classe ret�ngulo com os atributos fornecidos pelo usu�rio
			Retangulo retangulo = new Retangulo(lado1, lado2);
			
			//Calculando a �rea e o per�metro do ret�ngulo determinado pelo usu�rio
			area = retangulo.calcularArea(lado1, lado2);
			perimetro = retangulo.calcularPerimetro(lado1, lado2);
			
			//Imprimindo o resultado final na tela
			JOptionPane.showMessageDialog(null, "As dimens�es informadas foram " +lado1+ " e " +lado2+ ".\nA �rea � " +area+ ".\n" + 
					"O per�metro � "+perimetro+".", "Ret�ngulo Calculator - Resultados", JOptionPane.INFORMATION_MESSAGE);
			
			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","Ret�ngulo Calculator",
				    JOptionPane.YES_NO_OPTION);
		}
		while(opcao == 0);
		
		//Finaliza��o da aplica��o
		JOptionPane.showMessageDialog(null, "Obrigada por usar Ret�ngulo Calculator. Encerrando a aplica��o.", 
				"Ret�ngulo Calculator", JOptionPane.INFORMATION_MESSAGE);
	}

}
