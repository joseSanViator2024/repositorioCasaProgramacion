package casatema7Uno;

import java.util.Arrays;

public class Lista {

	private int [] array;

	public Lista() {
		super();
		this.array= new int [0];
	}
	
	public int elementos() {
		int resultado=0;
		resultado=this.array.length;
		return resultado;
	}
	
	public void insertarFinal(int numero) {
		this.array=Arrays.copyOf(array, array.length+1);
		this.array[array.length-1]=numero;
	}
	public void inertarInicio(int numero) {
		this.array=Arrays.copyOf(array, array.length+1);
		for(int i=array.length-1; i>0; i--) {
			this.array[i]=this.array[i-1];
		}
		this.array[0]=numero;
	}
	public void insertarLugar(int numero, int lugar) {
		this.array=Arrays.copyOf(array, array.length+1);
		for(int i=array.length-1; i>lugar; i--) {
			this.array[i]=this.array[i-1];
		}
		this.array[lugar]=numero;
	}
	public void aniadirLista(int [] lista) {
		int tamaño=this.array.length;
		this.array=Arrays.copyOf(array, lista.length);
		int contador=0;
		for(int i=tamaño;i<array.length; i++) {
			this.array[i]=lista[contador];
			contador++;
		}
	}
	public void print() {
		for(int resultado:this.array) {
			System.out.println(resultado);
		}
	}
	
	public static void concatena (Lista l1, Lista [] l2) {
		int tamaño=l1.length;
		this.array=Arrays.copyOf(array, lista.length);
		int contador=0;
		for(int i=tamaño;i<array.length; i++) {
			this.array[i]=lista[contador];
			contador++;
		}
	}
	}
	
}
