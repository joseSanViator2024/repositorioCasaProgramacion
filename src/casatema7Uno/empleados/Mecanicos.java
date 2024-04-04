package casatema7Uno.empleados;

public class Mecanicos {

	private String nombre;
	private int telefono;
	public enum Especialidad {frenos, hidraulica, electricidad, motor};
	private Especialidad esp;
	
	public Mecanicos(String nombre, int telefono, Especialidad esp) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.esp = esp;
	}
	
	
	
}