package filme;

public class Filme {
	private String titulo;
	private int duracaoEmMinutos;

	public Filme() {

	}

	public Filme (String titulo, int duracaoEmMinutos) {
		this.titulo = titulo;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public String exibirDuracaoEmHoras() {
		int durMinutos = 0, durHoras = 0;

		durMinutos = duracaoEmMinutos % 60;
		durHoras = duracaoEmMinutos / 60;


		return ("O filme '" + titulo + "' possui " + durHoras + " horas e " + durMinutos + " minutos de duração.");
	}

}
