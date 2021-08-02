package livro;

import junit.framework.TestCase;

public class TestarLivros extends TestCase {

	Livro livroFavorito = new Livro();

	//Testando métodos get dos três atributos
	public void testGetTitulo() {
		assertNull(livroFavorito.getTitulo());
	}
	
	public void testGetQtdPaginas() {
		assertEquals(0, livroFavorito.getQtdPaginas());
	}
	
	public void testGetPaginasLidas() {
		assertEquals(0, livroFavorito.getPaginasLidas());
	}

	
	//Testando métodos set dos três atributos
	public void testSetTitulo() {
		livroFavorito.setTitulo("O Pequeno Príncipe");
		assertEquals("O Pequeno Príncipe", livroFavorito.getTitulo());
		
		livroFavorito.setTitulo("Os Sete Maridos de Evelyn Hugo");
		assertEquals("Os Sete Maridos de Evelyn Hugo", livroFavorito.getTitulo());
		
		livroFavorito.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
		assertEquals("Harry Potter e o Prisioneiro de Azkaban", livroFavorito.getTitulo());
	}

	public void testSetQtdPaginas() {
		livroFavorito.setQtdPaginas(98);
		assertEquals(98, livroFavorito.getQtdPaginas());
		
		livroFavorito.setQtdPaginas(150);
		assertEquals(150, livroFavorito.getQtdPaginas());
		
		livroFavorito.setQtdPaginas(999);
		assertEquals(999, livroFavorito.getQtdPaginas());
	}


	public void testSetPaginasLidas() {
		livroFavorito.setPaginasLidas(20);
		assertEquals(20, livroFavorito.getPaginasLidas());
		
		livroFavorito.setPaginasLidas(250);
		assertEquals(250, livroFavorito.getPaginasLidas());
		
		livroFavorito.setPaginasLidas(999);
		assertEquals(999, livroFavorito.getPaginasLidas());
	}

	
	
	//Testando método verificarProgresso
	public void testVerificarProgresso() {
		
		livroFavorito.setQtdPaginas(98);
		livroFavorito.setPaginasLidas(20);
		
		assertEquals(20.408, (livroFavorito.verificarProgresso()), 0.01);
		
		
		livroFavorito.setQtdPaginas(98);
		livroFavorito.setPaginasLidas(50);
		
		assertEquals(51.020, (livroFavorito.verificarProgresso()), 0.01);
		
		
		livroFavorito.setQtdPaginas(100);
		livroFavorito.setPaginasLidas(50);
		
		assertEquals(50, (livroFavorito.verificarProgresso()), 0.01);
	}
}
