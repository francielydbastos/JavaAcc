package sef.module4.activity;

public class Carro  {

	//Definindo os atributos
	private String marca;
	private String colorCode;
	private float price;
	private boolean transitoLento;

	//Método construtor vazio
	public Carro () {

	}

	//Método construtor
	public Carro (String marca, String colorCode, float price, boolean transitoLento) {

		this.marca = marca;
		this.colorCode = colorCode;
		this.price = price;
		this.transitoLento = transitoLento;
	}

	//Setters para os parâmetros
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

	//Getters para os parâmetros
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

	//Método Buzinar
	public void Buzinar () {

		if(transitoLento) {

			System.out.println("!!!FONN FONNN!!! (**buzinando**)");
		}

		else {
			System.out.println("Melhor não buzinar...");
		}
	}

	//Método Exibir
	public void Exibir () {
		System.out.println("A marca do carro é: " + marca);
		System.out.println("A cor do carro é: " + colorCode);
		System.out.println("O preço desse carro é: R$" + price);
		System.out.println("O trânsito está lento? " + transitoLento);
	}
}
