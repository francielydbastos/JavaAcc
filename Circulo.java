
import java.lang.Math;

public class Circulo {
	//Definindo atributos
		private double raio;
		private double area;
		private double perimetro;
		
		//Definindo métodos construtores
		public Circulo () {
			
		}
		
		public Circulo (double raio) {
			
			this.raio = raio;
		}
		
		//Definindo métodos Set para o atributo raio, mas não para área e perímetro pois só
		//devem ser alterados pela método que os calcula caso haja mudança no valor do raio
		public void setRaio(double raio) {
			this.raio = raio;
		}
		
		//Definindo métodos Get para os atributos
		public double raio() {
			return raio;
		}
			
		public double getArea() {
			return area;
		}
		
		public double setPerimetro() {
			return perimetro;
		}
		
		//Definindo o método que calcula a área do círculo
		public double calcularArea(double raio) {
			
			area = Math.PI * Math.pow(raio, 2);
			
			return area;
		}
		
		//Definindo o método que calcula o perímetro do círculo
		public double calcularPerimetro(double raio) {
			
			perimetro = 2 * Math.PI * raio;
			
			return perimetro;
		}
}
