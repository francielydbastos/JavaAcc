package atv.mod6;

public class DespesaMes {
	private int mes; //mês da despesa
	private float valor; //valor da despesa
	
	public DespesaMes() {
		
	}
	
	public DespesaMes(int mes, float valor) {
		
		this.mes = mes;
		this.valor = valor;	
	}
	
	public int getMes() {
		return mes;
	}
	
	public float getValor() {
		return valor;
	}
}
