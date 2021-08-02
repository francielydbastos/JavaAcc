package filme;

import javax.swing.JOptionPane;

public class FilmePrincipal {

	public static void main(String[] args) {

		String titulo, duracInput;
		int duracMin, opcao;

		do {
			titulo = JOptionPane.showInputDialog(null, "Insira o nome do filme: ", 
					"Cadastro de Filmes",
					JOptionPane.QUESTION_MESSAGE);

			duracInput = JOptionPane.showInputDialog(null, "Insira a duração total do filme '" + titulo + "' em minutos.", 
					"Cadastro de Filmes",
					JOptionPane.QUESTION_MESSAGE);
			duracMin = Integer.parseInt(duracInput);


			Filme novoFilme = new Filme(titulo, duracMin);


			JOptionPane.showMessageDialog(null, novoFilme.exibirDuracaoEmHoras(), "Cadastro de Filmes", JOptionPane.INFORMATION_MESSAGE);


			opcao = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?","Cadastro de Filmes",
					JOptionPane.YES_NO_OPTION);
		}
		while (opcao == 0);

		JOptionPane.showMessageDialog(null, "Obrigada por usar nossa aplicação.", 
				"Cadastro de Filmes", JOptionPane.INFORMATION_MESSAGE);
	}

}
