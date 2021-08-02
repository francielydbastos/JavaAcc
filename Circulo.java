
import java.lang.Math;

public class Circulo {
	//Definindo atributos
		private double raio;
		private double area;
		private double perimetro;
		
		//Definindo m�todos construtores
		public Circulo () {
			
		}
		
		public Circulo (double raio) {
			
			this.raio = raio;
		}
		
		//Definindo m�todos Set para o atributo raio, mas n�o para �rea e per�metro pois s�
		//devem ser alterados pela m�todo que os calcula caso haja mudan�a no valor do raio
		public void setRaio(double raio) {
			this.raio = raio;
		}
		
		//Definindo m�todos Get para os atributos
		public double raio() {
			return raio;
		}
			
		public double getArea() {
			return area;
		}
		
		public double setPerimetro() {
			return perimetro;
		}
		
		//Definindo o m�todo que calcula a �rea do c�rculo
		public double calcularArea(double raio) {
			
			area = Math.PI * Math.pow(raio, 2);
			
			return area;
		}
		
		//Definindo o m�todo que calcula o per�metro do c�rculo
		public double calcularPerimetro(double raio) {
			
			perimetro = 2 * Math.PI * raio;
			
			return perimetro;
		}
}
