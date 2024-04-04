package casa2aev;

import java.time.LocalDate;

public class Alumno implements Comparable <Alumno> {

	private String nombre;
	private double notaP;
	private double notaL;
	private double notaS;
	
	public Alumno(String nombre, double notaP, double notaL, double notaS) {
		super();
		this.nombre = nombre;
		this.notaP = notaP;
		this.notaL = notaL;
		this.notaS = notaS;
	}
	
	@Override
	public String toString() {
		String resultado=this.nombre+"\n Programacion: "+notaP+" Lenguaje Marcas: "+notaL+" Sistemas: "+notaS+"\n-----------------------------------------------------------";
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaP() {
		return notaP;
	}

	public void setNotaP(double notaP) {
		this.notaP = notaP;
	}

	public double getNotaL() {
		return notaL;
	}

	public void setNotaL(double notaL) {
		this.notaL = notaL;
	}

	public double getNotaS() {
		return notaS;
	}

	public void setNotaS(double notaS) {
		this.notaS = notaS;
	}

	@Override
	public int compareTo(Alumno al) {
		int resultado=this.nombre.compareToIgnoreCase(al.getNombre());
		return resultado;
	}
	
	
}
