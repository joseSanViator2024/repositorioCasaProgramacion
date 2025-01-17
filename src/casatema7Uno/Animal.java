package casatema7Uno;

public abstract class Animal {

	protected String nombre;
	protected int edad;
	
	public abstract void expresarse();

	public Animal(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
