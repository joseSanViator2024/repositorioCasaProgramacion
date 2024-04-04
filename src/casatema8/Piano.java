package casatema8;

import java.util.Arrays;

import casatema8.Instrumento.Nota;

public class Piano extends Instrumento {

	public Piano() {
		super();
	}
	
	@Override
	public void interpretar() {
		for(int i=0; i<this.melodia.length; i++) {
		System.out.println(this.melodia[i]);
		}
	}

}
