import javax.swing.JOptionPane;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		
		//Definindo variáveis
		String primeiroLado, segundoLado;
		double lado1, lado2, area, perimetro;
		int opcao;
		
		//Interação inicial com o usuário
		JOptionPane.showMessageDialog(null, "Bem vinde ao Retângulo Calculator!\nInsira os dados a "
				+ "seguir para obter dados de área e perímetro. \nAtenção: dimensões em decimal devem ser inseridas com '.' e não ',' !", 
				"Retângulo Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			//Pegando input das dimensões do retângulo com o usuário
			primeiroLado = JOptionPane.showInputDialog(null, "Informe o primeiro lado do retângulo:", "Retângulo Calculator",
					JOptionPane.QUESTION_MESSAGE);
			segundoLado = JOptionPane.showInputDialog(null, "Informe o segundo lado do retângulo:", "Retângulo Calculator", 
					JOptionPane.QUESTION_MESSAGE);
			
			//Convertendo as strings com o valor dos lados para valores primitivos double
			lado1 = Double.parseDouble(primeiroLado);
			lado2 = Double.parseDouble(segundoLado);
			
			//Criando o objeto da classe retângulo com os atributos fornecidos pelo usuário
			Retangulo retangulo = new Retangulo(lado1, lado2);
			
			//Calculando a área e o perímetro do retângulo determinado pelo usuário
			area = retangulo.calcularArea(lado1, lado2);
			perimetro = retangulo.calcularPerimetro(lado1, lado2);
			
			//Imprimindo o resultado final na tela
			JOptionPane.showMessageDialog(null, "As dimensões informadas foram " +lado1+ " e " +lado2+ ".\nA área é " +area+ ".\n" + 
					"O perímetro é "+perimetro+".", "Retângulo Calculator - Resultados", JOptionPane.INFORMATION_MESSAGE);
			
			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","Retângulo Calculator",
				    JOptionPane.YES_NO_OPTION);
		}
		while(opcao == 0);
		
		//Finalização da aplicação
		JOptionPane.showMessageDialog(null, "Obrigada por usar Retângulo Calculator. Encerrando a aplicação.", 
				"Retângulo Calculator", JOptionPane.INFORMATION_MESSAGE);
	}

}
