package casatema8;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		
	}

	@Override
	public double area() {
		double area=(this.base*this.altura)/2;
		return area;
	}

}
