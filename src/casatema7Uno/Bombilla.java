package casatema7Uno;

public class Bombilla {

	private boolean bEncendida;
	private static boolean interruptorGeneral;
	
	
	
	public Bombilla(boolean bEncendida) {
		super();
		this.bEncendida = bEncendida;
	}
	
	
	public boolean estadoBombilla() {
		boolean resultado=false;
		if(this.bEncendida==true&&interruptorGeneral==true){
			resultado=true;
		}
		return resultado;
	}
	
	
	public void setbEncendida(boolean bEncendida) {
		this.bEncendida = bEncendida;
	}
	public static boolean isInterruptorGeneral() {
		return interruptorGeneral;
	}
	public static void setInterruptorGeneral(boolean interruptorGeneral) {
		Bombilla.interruptorGeneral = interruptorGeneral;
	}
	
}
