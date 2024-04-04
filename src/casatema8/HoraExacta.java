package casatema8;

public class HoraExacta extends Hora {

	private int seg;
	
	public HoraExacta(int hora, int min, int seg) {
		super(hora, min);
		this.seg=seg;
		
	}

	public boolean setSegundo(int valor) {
		boolean resultado=true;
		if(valor>59) {
			resultado=false;
		}
		return resultado;
	}
	@Override
	public void inc() {
		this.seg++;
		if(this.seg>59) {
			this.seg=0;
			this.min++;
			if(this.min>59) {
				this.min=0;
				this.hora++;
				if(this.hora>23) {
					this.hora=0;
				}
			}
		}
	}
	public boolean equals(Object o1) {
		HoraExacta h1=(HoraExacta)o1;
		boolean resultado=false;
		if(this.hora==h1.hora&&this.min==h1.min&&this.seg==h1.seg) {
			resultado=true;
		}
		return resultado;
	}
}
