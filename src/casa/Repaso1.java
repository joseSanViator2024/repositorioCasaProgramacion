package casa;

import java.util.Random;
import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=fibonacci(8);
		System.out.println(resultado);
		
	}
	//hoja 3: 4,5,9,12
	public static void ejercicio4T3() {
		Scanner teclado=new Scanner (System.in);
		int altura=1;
		int arbolMasAlto=0;
		int contador=0;
		int arbolAlto=0;
		for(contador=0; altura>0; contador++) {
			System.out.println("introduzca la altura del arbol " + contador + " o -1 si desea finalizar");
			altura=teclado.nextInt();
			if(arbolMasAlto<altura) {
				arbolMasAlto=altura;
				arbolAlto=contador;
			}	
		}
		System.out.println("el arbol mas alto es el " + arbolAlto + " con uns altura de " + arbolMasAlto);
	}
	public static void ejercicio5T3() {
		Random random=new Random();
		Scanner teclado=new Scanner(System.in);
		int minimo=1;
		int maximo=101;
		int numero1=1;
		int numero2=1;
		int contador=1;
		int solucion=1;
		int resultado=1;
		for(contador=0; solucion==resultado; contador++) {
			numero1=random.nextInt(minimo, maximo);
			numero2=random.nextInt(minimo, maximo);
			resultado=numero1+numero2;
			System.out.println("introduce la suma de " + numero1 + " + " + numero2);
			solucion=teclado.nextInt();
		}
		System.out.println("Ha realizado un total de " + (contador-1) + " operaciones correctamente");
	}
	public static void ejercicio9T3() {
		Scanner teclado=new Scanner(System.in);
		int suspenso=0;
		int aprobado=0;
		int notable=0;
		int sobresaliente=0;
		double notaAcumulada=0;
		double notaMedia=1;
		int i=0;
		double nota=1;
		for (i=1; i<=6; i++) {
			System.out.println("Introduce la nota del examen " + i);
			nota=teclado.nextDouble();
			if(nota>0&&nota<=4.9) {
				suspenso++;
			}
			if(nota>4.9&&nota<=6.9) {
				aprobado++;
			}
			if(nota>6.9&&nota<=8.9) {
				notable++;
			}
			if(nota>8.9&&nota<=10) {
				sobresaliente++;
			}
			notaAcumulada+=nota;
		}
		notaMedia=notaAcumulada/(i-1);
		System.out.println("la nota media es " + notaMedia + " .Tiene " + suspenso + " suspensos, " + aprobado + " aprobados, " + notable +" notables, " + sobresaliente + " sobresalientes.");
	}
	public static void ejercicio12T3() {
		int n=0;
		System.out.println("introduzca un numero para crear un triangulo de base y altura de ese numero");
		Scanner teclado=new Scanner(System.in);
		n=teclado.nextInt();
		int i=0;
		int j=0;
		int k=0;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//hoja 4: 5,6,9,14
	public static boolean ejercicio5T4(String letra) {
		boolean resultado=false;
		if(letra=="a"||letra=="e"||letra=="i"||letra=="o"||letra=="u"||letra=="A"||letra=="E"||letra=="I"||letra=="O"||letra=="U") {
			resultado=true;
			return resultado;
		}else {
			return resultado;
		}
	}
	public static boolean ejercicio6T4(int numero) {
		boolean primo=false;
		int i=1;
		if(numero==0||numero==1) {
			return primo;
		}
		if(numero==2) {
			primo=true;
			return primo;
		}else {
			for(i=2; i<numero; i++) {
				if(numero%i!=0) {
					primo=true;
					return primo;
				}else{
					return primo;
				}
			}
		}
		return primo;//pongo esta linea porque he de acabar la funcion con return, aunque sea irrelevante ya que nunca va a llegar a leerlo
	}
	public static double ejercicio9T4(double a, int n) {
		double resultado=1;
		int i=1;
		if(n<0) {
			System.out.println("exponente no valido");
		}
		if(n==0) {
			return resultado;
		}
		if(n>0) {
			for (i=1; i<=n; i++) {
				resultado=resultado*a;		
			}
		}		
		return resultado;
	}
	public static double ejercicio9T4recursivo(double a, int n) {
		double resultado=1;
		if(n<0) {
			System.out.println("exponente no valido");
		}
		if(n==0) {
			return resultado;
		}
		if(n>0) {
			resultado=a* ejercicio9T4recursivo(a,n-1);
		}
		return resultado;
	}
	////////////////////////////////////////////////////////////////////////////////
	private static int fibonacci(int n) {
		
		int resultado=0;
		if(n==0) {
			resultado=1;

		}else if(n==1) {
			resultado=1;
		}else {
			resultado=fibonacci(n-1)+fibonacci(n-2);
		}
		return resultado;
	}
	///////////////////////////////////////////////////////////////////////////////////
	
}
