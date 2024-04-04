package ejercicioabsanimal;

public class Perro extends Animal{

	private int idChip;
	public enum Raza {PastorAleman, GoldenRetriever,Labrador, Yorkshire, ShibaInu};
	private Raza raza;
	
	public Perro(String nombre, int edad, int idChip, Raza raza) {
		super(nombre, edad);
		this.idChip=idChip;
		this.raza=raza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void expresarse() {
		// TODO Auto-generated method stub
		System.out.println("guau!");
	}

	public int getIdChip() {
		return idChip;
	}

	public void setIdChip(int idChip) {
		this.idChip = idChip;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
	

}
