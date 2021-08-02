package filme;

import junit.framework.TestCase;

public class TestarFilme extends TestCase {

	Filme filme = new Filme();
	
	//Testando métodos get
	public void testGetTitulo() {
		assertNull(filme.getTitulo());
	}
	
	public void testGetDuracaoEmMinutos() {
		assertEquals(0, filme.getDuracaoEmMinutos());
	}
	
	
	//Testando métodos set
	public void testSetTitulo() {
		filme.setTitulo("Os Vingadores");
		assertEquals("Os Vingadores", filme.getTitulo());
		
		filme.setTitulo("Princesa Mononoke");
		assertEquals("Princesa Mononoke", filme.getTitulo());
		
		filme.setTitulo("Spirited Away");
		assertEquals("Spirited Away", filme.getTitulo());
	}

	public void testSetDuracaoEmMinutos() {
		filme.setDuracaoEmMinutos(142);
		assertEquals(142, filme.getDuracaoEmMinutos());
		
		filme.setDuracaoEmMinutos(150);
		assertEquals(150, filme.getDuracaoEmMinutos());
		
		filme.setDuracaoEmMinutos(93);
		assertEquals(93, filme.getDuracaoEmMinutos());
	}	
	
	
	//Testando método exibirDuracaoEmHoras
	public void testExibirDuracaoEmHoras() {
		
		filme.setTitulo("Os Vingadores");
		filme.setDuracaoEmMinutos(142);
		
		assertEquals("O filme 'Os Vingadores' possui 2 horas e 22 minutos de duração.", (filme.exibirDuracaoEmHoras()));
		
		filme.setTitulo("Princesa Mononoke");
		filme.setDuracaoEmMinutos(60);
		
		assertEquals("O filme 'Princesa Mononoke' possui 1 horas e 0 minutos de duração.", (filme.exibirDuracaoEmHoras()));
		
		filme.setTitulo("Spirited Away");
		filme.setDuracaoEmMinutos(15);
		
		assertEquals("O filme 'Spirited Away' possui 0 horas e 15 minutos de duração.", (filme.exibirDuracaoEmHoras()));
	}
}

