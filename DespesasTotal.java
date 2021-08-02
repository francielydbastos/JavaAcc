package atv.mod6;

import java.util.ArrayList;

public class DespesasTotal extends DespesaDia {
	private String cpf;
	private ArrayList<DespesaDia> despesaTotal; //array que pode receber despesas de um dia ou de um mês
	
	public DespesasTotal(String cpf, ArrayList<DespesaDia> despesaTotal) {
		this.cpf = cpf;
		this.despesaTotal = despesaTotal;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public DespesaMes totalizaMes(int mes) {
		
		float somaDespesa = 0;
		
		for (DespesaDia despesa : despesaTotal) {
			somaDespesa += despesa.getValor();
		}
				
		return (new DespesaMes(mes, somaDespesa));
	}
}
