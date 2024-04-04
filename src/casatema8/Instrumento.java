package casatema8;

import java.util.Arrays;

import hojatareas8.Instrumento.Notas;

public abstract class Instrumento {

	public enum Nota {DO,RE,MI,FA,SOL,LA,SI};
	protected Nota nota;
	protected Nota [] melodia;

	public Instrumento() {
		super();
		melodia= new Nota[0];
	}
	
	
	public void add (Nota nota) {
		this.melodia=Arrays.copyOf(this.melodia, this.melodia.length+1);
		this.melodia[this.melodia.length-1]=nota;
	}	
	public abstract void interpretar();
}
