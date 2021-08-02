
public class Retangulo {

	//Definindo atributos
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	
	//Definindo m�todos construtores
	public Retangulo () {
		
	}
	
	public Retangulo (double lado1, double lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Definindo m�todos Set para os atributos da dimens�o do ret�ngulo, mas n�o para
	//a �rea e o per�metro, pois eles s� devem ser alterados pelo m�todo que os calcula
	//caso haja altera��o no valor dos lados.
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	//Definindo m�todos Get para os atributos
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
	
	//Definindo o m�todo que calcula a �rea do ret�ngulo
	public double calcularArea(double lado1, double lado2) {
		
		area = lado1*lado2;
		
		return area;
	}
	
	//Definindo o m�todo que calcula o per�metro do ret�ngulo
	public double calcularPerimetro(double lado1, double lado2) {
		
		perimetro = (2 * lado1) + (2 * lado2);
		
		return perimetro;
	}
}
