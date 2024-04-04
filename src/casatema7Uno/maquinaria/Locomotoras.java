package casatema7Uno.maquinaria;

import casatema7Uno.empleados.Mecanicos;

public class Locomotoras {

	private int matricula;
	private int potencia;
	private int anyoFab;
	private Mecanicos mec;
	
	
	public Locomotoras(int matricula, int potencia, int anyoFab, Mecanicos mec) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.anyoFab = anyoFab;
		this.mec = mec;
	}
	
	
}
