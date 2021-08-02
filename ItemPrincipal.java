package atv.mod6;

import java.util.ArrayList;


public class ItemPrincipal {

	public static void main(String[] args) {
		
		//Armazenando itens no arraylist e instanciando um objeto da classe ItemOrcamentoComplexo
		ArrayList<ItemOrcamento> listaItens = new ArrayList<ItemOrcamento>();
		
		listaItens.add(new ItemOrcamento("Bolsa", (float) 55.99));
		listaItens.add(new ItemOrcamento("Camisa de bot�o", (float) 25.99));
		listaItens.add(new ItemOrcamento("Cal�a jeans", (float) 86.99));
		listaItens.add(new ItemOrcamento("Bon�", (float) 15.99));
		listaItens.add(new ItemOrcamento("T�nis", (float) 109.99));
		
		
		ItemOrcamentoComplexo itens = new ItemOrcamentoComplexo(listaItens);
		
		
		//Testando m�todos
		System.out.println("A soma do valor de todos os itens cadastrados � R$" + itens.getValor());
		
		retornoEncontraItem(itens, "T�nis");
		retornoEncontraItem(itens, "Camiseta");
		retornoEncontraItem(itens, "Cal�a jeans");
		
	}
	
	
	
	
	
	
	//M�todo complementar ao encontraItem
	public static void retornoEncontraItem(ItemOrcamentoComplexo itens, String historico) {
		
		if (itens.encontraItem(historico) == null) {
			
			System.out.println("O item com hist�rico '" + historico + "' n�o foi encontrado na lista!");
		}
		
		else {
			System.out.println("Item encontrado! O valor desse item � R$" + itens.encontraItem(historico).getValor());
		}
	}
}
