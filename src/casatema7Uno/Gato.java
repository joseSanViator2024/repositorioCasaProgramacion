package casatema7Uno;

public class Gato extends Animal{

	private String color;
	
	public Gato(String nombre, int edad, String color) {
		super(nombre, edad);
		this.color=color;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void expresarse() {
		System.out.println("miau!");
	}

}
