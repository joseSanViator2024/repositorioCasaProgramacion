package casatema7Uno;

import java.time.LocalDate;

public class Calendario {

	private int dia;
	private int mes;
	private int anyo;
	
	
	public Calendario(int dia, int mes, int anyo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	public Calendario(int dia, int mes) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anyo=LocalDate.now().getYear();
	}
	public Calendario() {
		super();
		this.dia=LocalDate.now().getDayOfYear();
		this.mes=LocalDate.now().getMonthValue();
		this.anyo=LocalDate.now().getYear();
	}
	
	public void incrementarDia() {
		this.dia=this.dia+1;
		if(this.dia==32&&(this.mes==1|this.mes==3|this.mes==5|this.mes==7|this.mes==8|this.mes==10|this.mes==12)){
			if(this.mes==12) {
				this.mes=1;
				this.anyo=this.anyo+1;
				this.dia=1;
			}else {
			this.dia=1;
			this.mes=this.mes+1;
			}
		}
		if(this.dia==31&&(this.mes==4|this.mes==6|this.mes==9|this.mes==11)){
			this.dia=1;
			this.mes=this.mes+1;
		}
		if(this.dia==29&&(this.mes==2)){
			this.dia=1;
			this.mes=this.mes+1;
		}
	}
	public void incrementarMes() {
		
		if(this.mes==12) {
			this.mes=1;
		}else {
			this.mes=this.mes+1;
		}
	}
	public void incrementarAño(int cantidad) {
		this.anyo=this.anyo+cantidad;
	}
	public void mostrar() {
		String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		System.out.println("Es el" + this.dia + " de " + meses[this.mes-1] + " de " + this.anyo);
	}
	public boolean equals (Calendario otraFecha) {
		boolean resultado=false;
		if(this.anyo==otraFecha.anyo&&this.mes==otraFecha.mes&&this.anyo==otraFecha.anyo) {
			resultado=true;
		}
		return resultado;
	}
	
	
	
	
}
