package casatema8;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private double saldo;
	private static String banco="Santander";
	
	
	public CuentaCorriente(String dni) {
		super();
		this.dni = dni;
	}

	public CuentaCorriente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo=0;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public void Ingresar(double valor) {
		this.saldo=this.saldo+valor;
	}
	
	public boolean Retirar(double valor) {
		boolean resultado=false;
		if(saldo>valor) {
			resultado=true;
			this.saldo=this.saldo-valor;
		}
		return resultado;
	}
	public void mostrarInfo() {
		System.out.println("info de la cuenta: dni:" + this.dni + " nombre: " + this.nombre + " saldo: "+ this.saldo + " banco:v" + this.banco);
	}
}
