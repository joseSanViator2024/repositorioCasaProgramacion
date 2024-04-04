package casatema8;

import hojatareas8.Hora;
import hojatareas8.HoraExacta;

public class PruebaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora h1=new Hora(21,5);
		HoraExacta h2=new HoraExacta(0,0,0);
		HoraExacta h3=new HoraExacta(23,59,59);
		
		
		System.out.println(h1.setHora(10));
		System.out.println(h1.toString());
		System.out.println(h1.setMinutos(80));
		h1.inc();
		System.out.println(h1);
		h2.inc();
		System.out.println(h2);
		h3.inc();
		System.out.println(h3);
		System.out.println(h2.equals(h3));
		
		Hora horaPolimorf=new HoraExacta(00, 00, 00);
		HoraExacta horaa=new HoraExacta(0, 0, 0);
		System.out.println(horaa.equals(horaPolimorf));
	}

}
