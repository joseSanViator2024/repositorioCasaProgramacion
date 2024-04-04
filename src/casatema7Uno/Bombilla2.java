package casatema7Uno;

public class Bombilla2 {

	private boolean bombillaIndividual;
	public static boolean InterruptorGeneral;
	
	
	public Bombilla2(boolean bombillaIndividual) {
		super();
		this.bombillaIndividual = bombillaIndividual;
	}
	
	public boolean estado() {
		boolean resultado=false;
		if(this.bombillaIndividual==true&&InterruptorGeneral==true) {
			resultado=true;
		}
		return resultado;
	}

	
	public void setBombillaIndividual(boolean bombillaIndividual) {
		this.bombillaIndividual = bombillaIndividual;
	}
	public static boolean isInterruptorGeneral() {
		return InterruptorGeneral;
	}
	public static void setInterruptorGeneral(boolean interruptorGeneral) {
		InterruptorGeneral = interruptorGeneral;
	}
}
