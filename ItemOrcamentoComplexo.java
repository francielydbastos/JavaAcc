package atv.mod6;

import java.util.ArrayList;

public class ItemOrcamentoComplexo extends ItemOrcamento {

	private ArrayList<ItemOrcamento> itens;
	
	public ItemOrcamentoComplexo() {
		
	}
	
	public ItemOrcamentoComplexo(ArrayList<ItemOrcamento> itens) {
		this.itens = itens;
	}
	
	@Override
	public float getValor() {
		
		float somaValores = 0;
		
		for (ItemOrcamento item : itens) {
			
			somaValores += item.getValor();
		}
		
		return somaValores;
	}
	
	//Recebe como parâmetro o histórico de um subitem e retorna o objeto correspondente ao subitem que possui
	public ItemOrcamento encontraItem(String historico) {
		
		for (ItemOrcamento subitem : itens) {
			
			if (subitem.getHistorico().equals(historico)) {
				return subitem; 
			}	
		}
		
		return null; //caso objeto saia do loop e não seja encontrado
		
	}
}
