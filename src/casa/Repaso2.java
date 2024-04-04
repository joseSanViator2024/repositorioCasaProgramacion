package casa;

import java.util.Random;
import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
	ejercicio6(1,100);
	}
	public static void ejercicio1() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Hora");
		int hora=teclado.nextInt();
		System.out.println("Minuto");
		int min=teclado.nextInt();
		System.out.println("Segundo");
		int seg=teclado.nextInt();
		int horaSegundo=hora*3600;
		int minSegundo=min*60;
		int sumaSeg=horaSegundo+minSegundo+seg;
		int HoraDada=12*3600+60*30;
		int diferencia=sumaSeg-HoraDada;
		int diferencia2=Math.abs(diferencia);
		System.out.println(diferencia2);
	}
	public static double ejercicio2(double radio, double h) {
		double PI=Math.PI;
		double radio2=Math.pow(radio, 2);
		double volumen=(PI*radio2*h)/3;
		return volumen;
	}
	public static void ejercicio4() {
		double min=20;
		double max=30;
		double i=1;
		double raiz=1;
		double resultado=1;
		for(i=min; i<=max; i++) {
			raiz=Math.sqrt(2*i);
			resultado=Math.pow(3, raiz);
			System.out.print(resultado + " ");
		}
	}
	public static double ejercicio5(int a, int b, int c, int d) {
	int i=1;
	int j=1;
	int suma=1;
	int cantidad=0;
	double media=1;
		if(a>b) {
			for(i=b; i<=a; i++) {
				if(i%c==0&&i%d!=0) {
					suma=suma+i;
					cantidad++;
					System.out.print(i+ " ");
				}
			}
		}
		if(a<b) {
			for(j=a; j<=b; j++) {
				if(j%c==0&&j%d!=0) {
					suma=suma+j;
					cantidad++;
					System.out.print(j+ " ");
				}
			}
		}
		media=suma/cantidad;
		System.out.print("la media es ");
		return media;
	}
	public static void ejercicio6(int min, int max) {
		Random rand=new Random();
		int aleatorio=1;
		aleatorio=rand.nextInt(20,41);
		int valor=1;
		int i=1;
		for (i=1; i<=aleatorio; i++) {
			valor=rand.nextInt(min,max);
			System.out.println(valor+ " de " + i);
		}
	}
}
