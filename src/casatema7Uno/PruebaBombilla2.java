package casatema7Uno;

public class PruebaBombilla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla b1=new Bombilla(true);
		Bombilla b2=new Bombilla(false);
		
		System.out.println(Bombilla.isInterruptorGeneral());
		System.out.println(b1.estadoBombilla());
		System.out.println(b2.estadoBombilla());
		Bombilla.setInterruptorGeneral(true);
		System.out.println(b1.estadoBombilla());
		System.out.println(b2.estadoBombilla());
	}

}
