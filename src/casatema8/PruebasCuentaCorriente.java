package casatema8;

public class PruebasCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente c1=new CuentaCorriente("1111a", "aaaa");
		CuentaCorriente c2=new CuentaCorriente("2222b", "bbbb", 20000);
		
		c1.mostrarInfo();
		c2.mostrarInfo();
		
		c1.Ingresar(590);
		c1.Retirar(200);
		c1.mostrarInfo();
		System.out.println(c1.Retirar(1000));
		
		
	}

}
