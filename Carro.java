package sef.module4.activity;

public class Carro  {

	//Definindo os atributos
	private String marca;
	private String colorCode;
	private float price;
	private boolean transitoLento;

	//M�todo construtor vazio
	public Carro () {

	}

	//M�todo construtor
	public Carro (String marca, String colorCode, float price, boolean transitoLento) {

		this.marca = marca;
		this.colorCode = colorCode;
		this.price = price;
		this.transitoLento = transitoLento;
	}

	//Setters para os par�metros
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setTransitoLento(boolean transitoLento) {
		this.transitoLento =  transitoLento;
	}

	//Getters para os par�metros
	public String getMarca() {
		return marca;
	}

	public String getColorCode() {
		return colorCode;
	}

	public float getPrice() {
		return price;
	}

	public boolean isTransitoLento() {
		return transitoLento;
	}

	//M�todo Buzinar
	public void Buzinar () {

		if(transitoLento) {

			System.out.println("!!!FONN FONNN!!! (**buzinando**)");
		}

		else {
			System.out.println("Melhor n�o buzinar...");
		}
	}

	//M�todo Exibir
	public void Exibir () {
		System.out.println("A marca do carro �: " + marca);
		System.out.println("A cor do carro �: " + colorCode);
		System.out.println("O pre�o desse carro �: R$" + price);
		System.out.println("O tr�nsito est� lento? " + transitoLento);
	}
}
