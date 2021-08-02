package jogador;

public class JogadorPrincipal {

	public static void main(String[] args) {

		//Cadastrando jogadores
		Jogador jogador1 = new Jogador(1, "Marcos Roberto", "Marcos", "1973-08-04", 1, "Goleiro", 90, 1, 0, false, true);
		Jogador jogador2 = new Jogador(2, "Carlos Evangelista", "Cafu", "1970-06-07", 2, "Lateral direito", 99, 2, 0, false, false);
		Jogador jogador3 = new Jogador(3, "Ricardo Rodrigues", "Ricardinho", "1976-05-23", 7, "Meio campo", 85, 0, 0, false, false);
		Jogador jogador4 = new Jogador(4, "Ronaldo Nazário", "Fenômeno", "1976-09-18", 9, "Atacante", 96, 0, 0, true, true);
		Jogador jogador5 = new Jogador(5, "Ronaldo Moreira", "Ronaldinho Gaúcho", "1980-03-21", 11, "Meio campo", 93, 3, 0, false, false);
		Jogador jogador6 = new Jogador(6, "Nelson da Silva", "Dida", "1973-10-07", 12, "Goleiro", 95, 0, 0, false, false);
		Jogador jogador7 = new Jogador(7, "Ricardo Leite", "Kaká", "1982-04-22", 23, "Meio campo", 85, 1, 0, false, true);
		Jogador jogador8 = new Jogador(8, "Marcos Santos", "Vampeta", "1974-03-13", 18, "Volante", 89, 0, 1, false, true);
		Jogador jogador9 = new Jogador(9, "Roberto Carlos Rocha", "Roberto Carlos", "1973-04-10", 6, "Lateral esquerdo", 88, 0, 0, false, true);
		Jogador jogador10 = new Jogador(10, "Lucimar Ferreira", "Lúcio", "1978-05-08", 3, "Zagueiro", 92, 1, 0, false, true);
		Jogador jogador11 = new Jogador(11, "José Vitor Roque Júnior", "Roque Jr.", "1976-08-31", 4, "Zagueiro", 83, 0, 0, false, true);

		//Armazenando jogadores cadastrados no array time
		Jogador[] time = new Jogador[11];
		time[0] = jogador1;
		time[1] = jogador2;
		time[2] = jogador3;
		time[3] = jogador4;
		time[4] = jogador5;
		time[5] = jogador6;
		time[6] = jogador7;
		time[7] = jogador8;
		time[8] = jogador9;
		time[9] = jogador10;
		time[10] = jogador11;

		imprimirPlantel(time);
		
		//Treinando o time
		for (int i = 0; i < time.length; i++) {
			time[i].executarTreinamento();
		}
		
		System.out.println(":::Após treinamento!:::");
		imprimirPlantel(time);
		
		//Aplicando lesões aleatórias
		for (int i = 0; i < time.length; i++) {
			time[i].sofrerLesao();
		}
		
		System.out.println(":::Após lesões!:::");
		imprimirPlantel(time);
		
		//Aplicando alguns cartões
		time[0].aplicarCartaoAmarelo(1);
		time[6].aplicarCartaoAmarelo(1);
		time[5].aplicarCartaoVermelho();
		
		System.out.println(":::Após cartões!:::");
		imprimirPlantel(time);
		
		//Cumprindo suspensões
		for (int i = 0; i < time.length; i++) {
			time[i].cumprirSuspensao();;
		}
		
		System.out.println(":::Após cumprir suspensões!:::");
		imprimirPlantel(time);
	}

	
	
	
	//Método para imprimir
	public static void imprimirPlantel (Jogador[] time) {
		System.out.println("Seleção Brasileira de 2002:");
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i].getPosicao() + ": " + time[i].getNumero() + " - " + time[i].getNome() + " (" + time[i].getApelido() + ") - " 
					+ time[i].getDataNascimento() + " - QUALIDADE: " + time[i].getQualidade() + " - CONDIÇÃO: " + time[i].verificarCondicaoDeJogo());
		}
		System.out.println("      ");
	}
}
