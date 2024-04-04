package casatema8;

public abstract class Poligono {

	protected double base;
	protected double altura;
	
	
	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public abstract double area();
	
}
