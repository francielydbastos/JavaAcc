package atv.mod6;

public class ItemOrcamento {
	private String historico; //histórico do item, aqui considerado como o nome
	private float valor; //valor do item
	
	public ItemOrcamento() {
		
	}
	
	public ItemOrcamento (String historico, float valor) {
		this.historico = historico;
		this.valor = valor;
	}

	public String getHistorico() {
		return historico;
	}

	public float getValor() {
		return valor;
	}
	
	
}
