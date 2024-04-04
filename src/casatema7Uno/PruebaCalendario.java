package casatema7Uno;

public class PruebaCalendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendario c1=new Calendario(31, 12, 2000);
		Calendario c2=new Calendario(30, 11, 2000);
		Calendario c3=new Calendario(28, 2, 2000);
		Calendario c4=new Calendario(1, 1, 2001);
		c1.incrementarDia();
		c2.incrementarDia();
		c3.incrementarDia();
		c1.mostrar();
		c2.mostrar();
		c3.mostrar();
		System.out.println(c1.equals(c4));
	}
	

}
