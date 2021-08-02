package atv.mod6;

import java.util.ArrayList;


public class ItemPrincipal {

	public static void main(String[] args) {
		
		//Armazenando itens no arraylist e instanciando um objeto da classe ItemOrcamentoComplexo
		ArrayList<ItemOrcamento> listaItens = new ArrayList<ItemOrcamento>();
		
		listaItens.add(new ItemOrcamento("Bolsa", (float) 55.99));
		listaItens.add(new ItemOrcamento("Camisa de botão", (float) 25.99));
		listaItens.add(new ItemOrcamento("Calça jeans", (float) 86.99));
		listaItens.add(new ItemOrcamento("Boné", (float) 15.99));
		listaItens.add(new ItemOrcamento("Tênis", (float) 109.99));
		
		
		ItemOrcamentoComplexo itens = new ItemOrcamentoComplexo(listaItens);
		
		
		//Testando métodos
		System.out.println("A soma do valor de todos os itens cadastrados é R$" + itens.getValor());
		
		retornoEncontraItem(itens, "Tênis");
		retornoEncontraItem(itens, "Camiseta");
		retornoEncontraItem(itens, "Calça jeans");
		
	}
	
	
	
	
	
	
	//Método complementar ao encontraItem
	public static void retornoEncontraItem(ItemOrcamentoComplexo itens, String historico) {
		
		if (itens.encontraItem(historico) == null) {
			
			System.out.println("O item com histórico '" + historico + "' não foi encontrado na lista!");
		}
		
		else {
			System.out.println("Item encontrado! O valor desse item é R$" + itens.encontraItem(historico).getValor());
		}
	}
}
