package casatema8;

import casatema8.Instrumento.Nota;

public class PruebaInstrumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Piano p1=new Piano();
		p1.add(Instrumento.Nota.DO);
		p1.add(Instrumento.Nota.FA);
		p1.add(Nota.RE);
		p1.interpretar();
	}

}
