package casatema8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {

	private String titulo;
	private String director;
	private int duracion;
	public enum Genero {accion, aventura, terror, comedia};
	private Genero gen;
	
	
	public Pelicula(String titulo, String director, int duracion, Genero gen) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.gen = gen;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public Genero getGen() {
		return gen;
	}


	public void setGen(Genero gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		int horas=duracion/60;
		int minutos=duracion%60;
		String resultado="titulo: " + this.titulo + " director: " + this.director + " duracion: " + horas +"h, " + minutos + "min "+ " genero: " + this.gen;
		return resultado;
	}
}
