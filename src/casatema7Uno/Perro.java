package casatema7Uno;

public class Perro extends Animal{

	private int idChip;
	public enum Raza {PastorAleman, GoldenRetriever, Labrador, Yorkshire, ShibaInu};
	private Raza raza;
	
	public Perro(String nombre, int edad, int idChip, Raza raza) {
		super(nombre, edad);
		this.idChip=idChip;
		this.raza=raza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void expresarse() {
		System.out.println("guau!");
		
	}

}
