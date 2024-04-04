package casatema8;

public class Hora {

	protected int hora;
	protected int min;
	
	
	public Hora(int hora, int min) {
		super();
		this.hora = hora;
		this.min = min;
	}
	
	public void inc() {
		this.min++;
		if(min==60) {
			hora++;
			min=1;
			if(hora==24) {
				hora=0;
			}
		}
	}
	public boolean setMinutos(int valor) {
		boolean resultado=true;
		if(valor>59) {
			resultado=false;
		}else {
			min=valor;
		}
		return resultado;
	}
	public boolean setHora(int valor) {
		boolean resultado=true;
		if(valor>23) {
			resultado=false;
		}else {
			hora=valor;
		}
		return resultado;
	}
	@Override
	public String toString() {
		String resultado="";
		resultado=this.hora+":"+this.min;
		return resultado;
	}
}
