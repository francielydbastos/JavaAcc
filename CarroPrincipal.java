package sef.module4.activity;

public class CarroPrincipal {

	public static void main(String[] args) {

		//Instanciando objeto pelo método construtor
		Carro palio = new Carro("Fiat", "Cinza", (float) 50000.00, false);

		//Instanciando objeto pelo método construtor vazio
		Carro gol = new Carro();

		gol.setMarca("Volkswagen");
		gol.setColorCode("Branco");
		gol.setPrice((float)20000.00);
		gol.setTransitoLento(true) ;

		//Utilizando métodos buzinar e exibir
		palio.Exibir();
		palio.Buzinar();

		System.out.println(" ");

		System.out.println("A marca do carro é: " + gol.getMarca());
		System.out.println("A cor do carro é: " + gol.getColorCode());
		System.out.println("O preço do carro é: R$" + gol.getPrice());
		System.out.println("O trânsito está lento?: " + gol.isTransitoLento());

		gol.Buzinar();

	}

}
