package sef.module4.activity;

public class CarroPrincipal {

	public static void main(String[] args) {

		//Instanciando objeto pelo m�todo construtor
		Carro palio = new Carro("Fiat", "Cinza", (float) 50000.00, false);

		//Instanciando objeto pelo m�todo construtor vazio
		Carro gol = new Carro();

		gol.setMarca("Volkswagen");
		gol.setColorCode("Branco");
		gol.setPrice((float)20000.00);
		gol.setTransitoLento(true) ;

		//Utilizando m�todos buzinar e exibir
		palio.Exibir();
		palio.Buzinar();

		System.out.println(" ");

		System.out.println("A marca do carro �: " + gol.getMarca());
		System.out.println("A cor do carro �: " + gol.getColorCode());
		System.out.println("O pre�o do carro �: R$" + gol.getPrice());
		System.out.println("O tr�nsito est� lento?: " + gol.isTransitoLento());

		gol.Buzinar();

	}

}
