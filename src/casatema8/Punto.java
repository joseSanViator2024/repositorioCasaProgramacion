package casatema8;

public class Punto {

	protected double x;
	protected double y;
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double distancia (Punto otroPunto) {
		double resultado=0;
		resultado=this.x-otroPunto.x+this.y-otroPunto.y;
		return resultado;
	}
	public boolean equals (Punto otroPunto) {
		boolean resultado=false;
		if(this.x==otroPunto.x&&this.y==otroPunto.y) {
			resultado=true;
		}
		return resultado;
	}
	
}
