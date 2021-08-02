package time;

import java.util.Comparator;

//Comparador para organizar o ArrayList de jogadores conforme a sua posição
class ComparaPosicao implements Comparator<Jogador2> {

	public int compare(Jogador2 jog1, Jogador2 jog2) {
		String jogPosicao1 = jog1.getPosicao().toUpperCase();
		String jogPosicao2 = jog2.getPosicao().toUpperCase();

		//Retorna jogadores em ordem alfabética de posição
		return jogPosicao1.compareTo(jogPosicao2);
	}
}

//Comparador para organizar a string de jogadores em ordem decrescente de qualidade	
class ComparaQualidade implements Comparator<Jogador2> {

	public int compare(Jogador2 jog1, Jogador2 jog2) {
		int qualiJog1 = jog1.getQualidade();
		int qualiJog2 = jog2.getQualidade();

		//Retorna jogadores em ordem decrescente de qualidade
		return qualiJog2 - qualiJog1;
	}
}