import javax.swing.JOptionPane;

public class CirculoPrincipal {

	public static void main(String[] args) {
		
		//Definindo variáveis
		String raioInput;
		double raio, area, perimetro;
		int opcao;
		
		//Interação inicial com o usuário
		JOptionPane.showMessageDialog(null, "Bem vinde ao Círculo Calculator!\nInsira o raio do círculo a "
				+ "seguir para obter dados de área e perímetro. \nAtenção: dimensões em decimal devem ser inseridas com '.' e não ',' !", 
				"Círculo Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			//Pegando input do raio do círculo com o usuário
			raioInput = JOptionPane.showInputDialog(null, "Informe o raio do círculo:", "Círculo Calculator",
					JOptionPane.QUESTION_MESSAGE);
			
			//Convertendo as strings com o valor do raio para valores primitivos double
			raio = Double.parseDouble(raioInput);
			
			//Criando o objeto da classe Circulo com os atributos fornecidos pelo usuário
			Circulo circulo = new Circulo(raio);
			
			//Calculando a área e o perímetro do círculo determinado pelo usuário
			area = circulo.calcularArea(raio);
			perimetro = circulo.calcularPerimetro(raio);
			
			//Imprimindo o resultado final na tela
			JOptionPane.showMessageDialog(null, "O raio informado foi " +raio+  ".\nA área é " +area+ ".\n" + 
					"O perímetro é "+perimetro+".", "Círculo Calculator - Resultados", JOptionPane.INFORMATION_MESSAGE);
			
			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","Círculo Calculator",
				    JOptionPane.YES_NO_OPTION);
		}
		while(opcao == 0);
		
		//Finalização da aplicação
		JOptionPane.showMessageDialog(null, "Obrigada por usar Círculo Calculator. Encerrando a aplicação.", 
				"Círculo Calculator", JOptionPane.INFORMATION_MESSAGE);
	}
}
