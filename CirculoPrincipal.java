import javax.swing.JOptionPane;

public class CirculoPrincipal {

	public static void main(String[] args) {
		
		//Definindo vari�veis
		String raioInput;
		double raio, area, perimetro;
		int opcao;
		
		//Intera��o inicial com o usu�rio
		JOptionPane.showMessageDialog(null, "Bem vinde ao C�rculo Calculator!\nInsira o raio do c�rculo a "
				+ "seguir para obter dados de �rea e per�metro. \nAten��o: dimens�es em decimal devem ser inseridas com '.' e n�o ',' !", 
				"C�rculo Calculator", JOptionPane.INFORMATION_MESSAGE);
		
		do {
			//Pegando input do raio do c�rculo com o usu�rio
			raioInput = JOptionPane.showInputDialog(null, "Informe o raio do c�rculo:", "C�rculo Calculator",
					JOptionPane.QUESTION_MESSAGE);
			
			//Convertendo as strings com o valor do raio para valores primitivos double
			raio = Double.parseDouble(raioInput);
			
			//Criando o objeto da classe Circulo com os atributos fornecidos pelo usu�rio
			Circulo circulo = new Circulo(raio);
			
			//Calculando a �rea e o per�metro do c�rculo determinado pelo usu�rio
			area = circulo.calcularArea(raio);
			perimetro = circulo.calcularPerimetro(raio);
			
			//Imprimindo o resultado final na tela
			JOptionPane.showMessageDialog(null, "O raio informado foi " +raio+  ".\nA �rea � " +area+ ".\n" + 
					"O per�metro � "+perimetro+".", "C�rculo Calculator - Resultados", JOptionPane.INFORMATION_MESSAGE);
			
			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","C�rculo Calculator",
				    JOptionPane.YES_NO_OPTION);
		}
		while(opcao == 0);
		
		//Finaliza��o da aplica��o
		JOptionPane.showMessageDialog(null, "Obrigada por usar C�rculo Calculator. Encerrando a aplica��o.", 
				"C�rculo Calculator", JOptionPane.INFORMATION_MESSAGE);
	}
}
