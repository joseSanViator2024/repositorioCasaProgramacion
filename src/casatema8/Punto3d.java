package casatema8;

public class Punto3d extends Punto{

	private double z;
	
	public Punto3d(double x, double y, double z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}
	
	public double distancia (Punto3d otroPunto) {
		double resultado=0;
		resultado=this.x-otroPunto.x+this.y-otroPunto.y+this.z-otroPunto.z;
		return resultado;
	}
	
	
}
