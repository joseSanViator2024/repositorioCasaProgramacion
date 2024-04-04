package ejercicioabsanimal;

public class Gato extends Animal{

	private String color;
	
	public Gato(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color=color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void expresarse() {
		// TODO Auto-generated method stub
		System.out.println("miau!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
