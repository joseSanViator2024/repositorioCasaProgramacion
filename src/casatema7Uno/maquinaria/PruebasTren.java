package casatema7Uno.maquinaria;

import casatema7Uno.empleados.Maquinistas;
import casatema7Uno.empleados.Mecanicos;
import casatema7Uno.empleados.Mecanicos.Especialidad;

public class PruebasTren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Especialidad fre=casatema7Uno.empleados.Mecanicos.Especialidad.frenos;
		Maquinistas maq1=new Maquinistas("aaa", "111A", 2000, "A");
		Maquinistas maq2=new Maquinistas("bbb", "222B", 2000, "B");
		Maquinistas maq3=new Maquinistas("ccc", "333C", 2000, "C");
		Mecanicos mec1=new Mecanicos("zzz", 666, fre);
		Locomotoras loc1=new Locomotoras(2,3,4,mec1);
		Vagones v1=new Vagones(2,3,4,"caca");
		Trenes t1=new Trenes(loc1,v1 );
	}

}
