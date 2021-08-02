package atv.mod6;

import java.util.ArrayList;

public class DespesaPrincipal {

	public static void main(String[] args) {

		//Armazenando despesas no arraylist para instanciar objeto com despesa total
		ArrayList<DespesaDia> listaDespesas = new ArrayList<DespesaDia>(); 
		
		listaDespesas.add(new DespesaDia(5, 4, (float) 23.99));
		listaDespesas.add(new DespesaDia(9, 4, (float) 115.00));
		listaDespesas.add(new DespesaDia(15, 4, (float) 9.99));
		listaDespesas.add(new DespesaDia(23, 4, (float) 1.99));
		listaDespesas.add(new DespesaDia(27, 4, (float) 89.99));
				
		DespesasTotal despesaUm = new DespesasTotal("112.523.527-15", listaDespesas);

		imprimeTotal(despesaUm, 4);
		
		
	}

	
	
	
	
	
	
	

	//Método adicional para imprimir os valores calculados por totalizaMes
	public static void imprimeTotal(DespesasTotal despesa, int mes) {
		System.out.print("A despesa total do indivíduo com cpf " + despesa.getCpf() +  " no mês " + mes + 
				" foi de R$");
		System.out.printf("%.2f", despesa.totalizaMes(mes).getValor());
	}
}
