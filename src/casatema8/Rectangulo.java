package casatema8;

public class Rectangulo extends Poligono{

	public Rectangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		double area=this.base*this.altura;
		return area;
	}

}
