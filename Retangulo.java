
public class Retangulo {

	//Definindo atributos
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	
	//Definindo métodos construtores
	public Retangulo () {
		
	}
	
	public Retangulo (double lado1, double lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Definindo métodos Set para os atributos da dimensão do retângulo, mas não para
	//a área e o perímetro, pois eles só devem ser alterados pelo método que os calcula
	//caso haja alteração no valor dos lados.
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	//Definindo métodos Get para os atributos
	public double getLado1() {
		return lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
	//Definindo o método que calcula a área do retângulo
	public double calcularArea(double lado1, double lado2) {
		
		area = lado1*lado2;
		
		return area;
	}
	
	//Definindo o método que calcula o perímetro do retângulo
	public double calcularPerimetro(double lado1, double lado2) {
		
		perimetro = (2 * lado1) + (2 * lado2);
		
		return perimetro;
	}
}
