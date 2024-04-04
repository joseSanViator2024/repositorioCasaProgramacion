package casa;

import java.util.Random;
import java.util.Scanner;

public class octubre222023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzBuzzT4(20);
		
	///////hoja 3: 4,5,9,12; hoja 4: 5, 6, 9, 14; examen e12022
	}
///////////////////////////////////Hoja tareas 3---IMPORTANTES---: 4, 5, 8, 9, 12	
	public static void ejercicio1() {
		Scanner teclado=new Scanner(System.in);
		int numero=1;
		System.out.println("introduzca un numero o 0 para acabar");
		numero=teclado.nextInt();
		do {
		if (numero%2==0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		if (numero>0) {
			System.out.println("positivo");
		}else {
			System.out.println("negativo");
		}
		int exponente=2;
		int cuadrado= (int) Math.pow(numero, exponente);
		System.out.println(cuadrado);
		System.out.println("introduzca un numero o 0 para acabar");
		numero=teclado.nextInt();
		}while (numero!=0);
		System.out.println("programa finalizado");
	}
	public static void ejercicio2() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduca la edad del alumno o un numero negativo para finalizar");
		double edad=teclado.nextDouble();
		double sumaEdades=0;
		double mediaEdades=0;
		double numeroAlumnos=0;
		double mayorEdad=0;
		for (double i=1; edad>0; i++) {
			numeroAlumnos=i;
			sumaEdades=sumaEdades+edad;
			if(edad>=18) {
				mayorEdad++;
			}
			mediaEdades=sumaEdades/i;
			System.out.println("Introduca la edad del alumno o un numero negativo para finalizar");
			edad=teclado.nextDouble();
		}
			
		System.out.println("La media de edades es " + mediaEdades + " el numero de alumnos es " + numeroAlumnos + " la suma de todas las edades es " + sumaEdades + " y hay " + mayorEdad + " alumnos mayores de edad");
		
	}
	public static void ejercicio3() {
		int minimo=1;
		int maximo=100;
		Random aleatorio=new Random();
		int random=aleatorio.nextInt(minimo, maximo);
		Scanner teclado=new Scanner(System.in);
		int numero=1;
		do{
			System.out.println("introduzca numero de 1 al 100 o -1 si se rinde");
			numero=teclado.nextInt();
			if(numero<random&&numero!=-1) {
				System.out.println("menor");
			}
			if(numero>random) {
				System.out.println("mayor");
			}
		}while(numero!=random&&numero!=-1);
		if(numero==-1) {
			System.out.println("se ha rendido");
		}
		if (numero==random) {
			System.out.println("correcto!!");
		}
	}
	public static void ejercicio4() {
		Scanner teclado=new Scanner(System.in);
		double altura=1;
		double alturaMaxima=0;
		int arbolMasAlto=0;
		double contador=0;
		int i=0;
		for (i=0; altura!=-1; i++) {
			System.out.println("introduzca altura del arbol numero " + i);
			altura=teclado.nextDouble();
			double maximo=Math.max(altura, altura);
			if (altura>alturaMaxima) {
				alturaMaxima=altura;
				arbolMasAlto=i;
			}
			
		}
		System.out.println("el arbol mas alto es el " + arbolMasAlto );
	}
	public static void ejercicioAlturas() {
		double alturaMaxima=1;
		double alturaMinima=10;//pongo numero muy alto, ya que al medir el valor mas pequeño ha de ser menor a la inicializacion
		double personaMasAlta=1;
		double personaMasBaja=1;
		double mediaAlturas=1;
		double totalAlturas=1;
		double altura=1;
		int i=0;//inicializo aqui porque si inicializo dentro del for solo lo tiene en cuenta ahi
		Scanner teclado=new Scanner(System.in);
		for (i=1; altura!=0; i++) {
			System.out.println("introduzca la altura del alumno " + i);
			altura=teclado.nextDouble();
			if(altura>alturaMaxima) {
				alturaMaxima=altura;
				personaMasAlta=i;
			}
			if(altura<alturaMinima&&altura>0) {
				alturaMinima=altura;
				personaMasBaja=i;	
			}
			totalAlturas=altura+totalAlturas;
		}
		mediaAlturas=totalAlturas/(i-2);
		System.out.println("la media es " + mediaAlturas + " el numero de alumnos es " + (i-2) + " la persona mas alta es el alumno " + personaMasAlta + " y mide " + alturaMaxima + " la persona mas baja es el alumno " + personaMasBaja + " y mide " + alturaMinima );

	}
	public static void ejercicio5() {
		int minimo=1;
		int maximo=100;
		Random aleatorio=new Random();
		int random1=aleatorio.nextInt(minimo,maximo);
		int random2=aleatorio.nextInt(minimo,maximo);
		int suma=random1+random2;
		int i=0;
		int solucion=suma;
		Scanner teclado=new Scanner(System.in);
		for (i=0; solucion==suma; i++) {
			random1=aleatorio.nextInt(minimo,maximo);
			random2=aleatorio.nextInt(minimo,maximo);
			suma=random1+random2;
			System.out.println("indique la suma de ambos numeros " + random1 + " "+ random2);
			solucion=teclado.nextInt();
		}
			System.out.println(" ha realizado correctamente " + (i-1) + " ejercicios ");

	}
	public static void ejercicio6() {
		int minimo=1;
		int maximo=100;
		for(minimo=1; minimo<=maximo; minimo++) {
			if(minimo%2==0&&minimo%3==0&&minimo%8!=0) {
				System.out.println(minimo);		
			}
		}
	}
	public static void ejercicio8() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("introduzca un numero ");
		int numero=teclado.nextInt();
		int factorial=1;
		for(int i=1; i<=numero; i++) {
			factorial=factorial*i;

		}
		System.out.println("el factorial del numero " + numero + " es " + factorial);
	}
	public static void ejercicio9() {
		Scanner teclado=new Scanner (System.in);
		int suspensos=0;
		int aprobados=0;
		int notables=0;
		int sobresalientes=0;
		double notaMedia=0;
		for(int i=1; i<=6; i++) {
			System.out.println("introduzca la nota " + i);
			double nota=teclado.nextDouble();
			notaMedia=notaMedia+nota;
			if(nota>0&&nota<=4.9) {
				suspensos++;
			}
			if(nota>=5&&nota<=6.9) {
				aprobados++;	
			}
			if(nota>=7&&nota<=8.9) {
				notables++;
			}
			if(nota>=9&&nota<=10) {
				sobresalientes++;
			}
		}
		notaMedia=notaMedia/6;
		System.out.println(" nota media " + notaMedia);
		System.out.println("ha obtenido " + suspensos + " suspensos, " + aprobados + " aprobados, " + notables + " notables, " + sobresalientes +" sobresalientes.");
	}
	public static void ejercicio10() {
		Scanner teclado=new Scanner (System.in);
		double numero=teclado.nextDouble();
		///////////////////////////////////////////////////////////////////////
	}
	public static void ejercicio11() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("indique un numero y le mostrare los numero primos comprendidos entre 1 y ese numero");
		int numero=teclado.nextInt();
		int minimo=1;
		int i=1;
		int j=1;
		for (i=2; i<numero; i++) {
			for (j=2; j<i;j++) {
				if(i%j!=0) {
					System.out.println(i);
				}	
			}
		}
	}
	public static void ejercicio12() {
		Scanner teclado=new Scanner(System.in);
		int numero=teclado.nextInt();
		int i=1;
		int j=1;
		int k=1;
		String asterisco="*";
		for (k=1; k<=numero; k++) {
			for (i=1; i<=numero-k; i++) {
			System.out.print(" ");
			}
			for(j=1; j<=k; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (k=1; k<=numero; k++) {
			for (i=1; i<=k; i++) {
			System.out.print(" ");
			}
			for(j=1; j<=numero-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	
	//////////////////////////////////////////Hoja tareas 4---IMPORTANTES--- 5, 6, 7, 9, 10, 13, 14
	public static void ejercicio1T4(int numero1, int numero2) {
		for (int i=numero1+1; i<numero2; i++) {
			System.out.println(i);
		}
	}
	public static void ejercicio2T4(int n1, int n2, int n3) {
		System.out.println(" numeros pares entre " + n1 + " y " + n2 + " son "); 
		for (int i=n1+1; i<n2; i++) {
			if(i%2==0) {
				System.out.println( i);
			}
		}	
		System.out.println(" numeros divisibles entre 3 entre " + n2 + " y " + n3 + " son " );
		for (int j=n2+1; j<n3; j++) {
			if(j%3==0) {
				System.out.println(j);	
			}
		}
	}
	public static double ejercicio3T4(double radio, double altura) {
		double PI=3.14;
		double volumen=1;
		double base=radio;
		double exponente=2;
		double radioCuadrado=Math.pow(base,  exponente);
		volumen=PI*radioCuadrado*altura;
	return volumen;
		
	}
	public static int ejercicio4T4(int num1, int num2) {
		int resultado=1;
		if(num1>num2) {
			resultado=num1;
		}
		if(num1<num2) {
				resultado=num2;
		}
	return resultado;
	}
	public static boolean ejercicio5T4(String letra) {

		if (letra=="a"||letra=="e"||letra=="i"||letra=="o"||letra=="u"||letra=="A"||letra=="E"||letra=="I"||letra=="O"||letra=="U") {
			return true;
		}else {
			return false;
		}
		
		
	}
	public static boolean ejercicio6T4(int numero) {
		boolean resultado=true;
		if (numero==2) {
			resultado=true;
			return resultado;
		}
		if (numero==1) {
			resultado=false;
			return resultado;
		}
		if (numero!=1&&numero!=2){
			for (int i=2; i<numero; i++) {	
				if(numero%i!=0) {
					resultado=true;
					return resultado;
				}
				if(numero%i==0) {
					resultado=false;
					return resultado;
				}
			}
		}return resultado;
	}
	public static double calculadora(double num1, double num2, double operacion) {
		double resultado=1;
		if(operacion==1) {
			resultado=num1+num2;
			System.out.println(" la suma de " + num1 + " y " + num2 + " es ");
			
		}
		if(operacion==2) {
			resultado=num1-num2;
			System.out.println(" la resta de " + num1 + " y " + num2 + " es ");
			
		}
		if(operacion==3) {
			resultado=num1*num2;
			System.out.println(" la multiplicacion de " + num1 + " y " + num2 + " es ");
			
		}
		if(operacion==4) {
			if(num2==0) {
				resultado=0;
			System.out.println("no puede dividir entre ");
			}else {
				resultado=num1/num2;
				System.out.println(" la division de " + num1 + " y " + num2 + " es ");
				
			}
		}return resultado;
	}
	public static int ejercicio9T4(int a, int n) {
		int i=1;
		int resultado=1;
		if(n>0) {
			for(i=1; i<=n; i++) {
				resultado=resultado*a;
			}
		}
		if(n==0) {
			resultado=1;
		}
		return resultado;
	}
	public static int ejercicio9T4recursivo(int a, int n) {
		int i=1;
		int resultado=1; 
		if (n>1) {
			resultado=a*ejercicio9T4recursivo(a, n-1);
		}
		return resultado;
	}
	public static int ejercicio10T4(int n) {
		int resultado=1;
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n>1) {
			resultado=ejercicio10T4(n-1)+ejercicio10T4(n-2);
		}
		return resultado;
	}
	public static int ejercicio12T4(int horas1, int min1, int seg1, int horas2, int min2, int seg2) {
		int horasminutos1=horas1*3600+min1*60;
		int horasminutos2=horas2*3600+min2*60;
		int totalSeg1=horasminutos1+seg1;
		int totalSeg2=horasminutos2+seg2;
		int resultado=totalSeg1-totalSeg2;
		return resultado;
		}
	public static void ejercicio13T4(int valor1, int valor2, int cantidad) {
		Random random=new Random();
		int aleatorio=1;
		for(int i=1; i<=cantidad; i++) {
			aleatorio=random.nextInt(valor1, valor2);
			System.out.println(aleatorio);
		}
	}
	public static int ejercicio14T4(int n) {
		int resultado=1;
		if(n>0) {
			resultado=n*ejercicio14T4(n-1);
		}
		if(n==0) {
			resultado=1;
		}
		return resultado;
	}
	
	public static void fizzBuzzT4(int n) {
		for (int i=1; i<=n; i++) {
			if(i%3==0&&i%4!=0) {
				System.out.println("fizz");
			}
			if(i%4==0&&i%3!=0) {
				System.out.println("buzz");
			}
			if(i%4==0&&i%3==0) {
				System.out.println("fizzbuzz");
			}
			if(i%4!=0&&i%3!=0)
			System.out.println(i);
		}
	}
	
	
	
	/////Examen 2022 T1:
	public static short ejercicio3E22T1(int limiteInferior, int limiteSuperior) {
		short k=0;
		if(limiteSuperior>limiteInferior) {
			for(int i=limiteInferior; i<=limiteSuperior; i++) {
				if(i%3==0&&i%4==0) {
					k++;
				}
			}
		}else {
			System.out.println("el limite superior introducido no es valido");
		}
		return k;
	}
	public static void ejercicio4E22T1() {
		Scanner teclado=new Scanner (System.in);
		double altura=1;
		int indicePersonaMasAlta=1;
		int indicePersonaMasBaja=1;
		double media=1;
		double alturaMaxima=0;
		double alturaMinima=5;
		double sumaAlturas=0;
		int k=0;
		for(k=1; altura>0; k++) {
			System.out.println("Introduzca la altura del alumno k o un 0 para finalizar");
			altura=teclado.nextDouble();
			
			if(altura>alturaMaxima) {
				alturaMaxima=altura;
				indicePersonaMasAlta=k;
			}
			if(altura<alturaMinima&&altura!=0) {
				alturaMinima=altura;
				indicePersonaMasBaja=k;
			}
		sumaAlturas=sumaAlturas+altura;
		}
		media=sumaAlturas/(k-2);
		System.out.println("la altura media es " + media + " la persona mas alta es " + indicePersonaMasAlta + " con " + alturaMaxima + " la persona mas baja es " + indicePersonaMasBaja + " con " + alturaMinima);
	}
		
	public static void ejercicio5E22T1(int n) {
		System.out.print(n+"-->");
		int calculo1=1;
		int calculo2=1;
		do {
			if(n%2==0) {
				calculo1=n/2;
				System.out.print(calculo1+"-->");
				n=calculo1;
			}
			if(n%2!=0&&n!=1) {
				calculo2=(n*3)+1;
				System.out.print(calculo2+"-->");
				n=calculo2;
			}
		}while(n>1);
	}
	
	public static void ejercicio6E22T1() {
		int min=1;
		int max=100;
		for(int i=min; i<=max; i++) {
			double raiz=Math.sqrt(i);
			System.out.println(raiz);
		}
	}
	public static void ejercicio7E22T1() {
		int min=1;
		int max=10;
		Scanner teclado=new Scanner (System.in);
		Random aleatorio=new Random();
		int numero1=0;
		int numero2=0;
		int resultado=1;
		int calculo=1;
		int cuenta=0;
		do {
			numero1=aleatorio.nextInt(1,10);
			numero2=aleatorio.nextInt(1,10);
			resultado=numero1*numero2;
			System.out.println("introduzca el resultado de la multiplicacion de " + numero1 + " x " + numero2);
			calculo=teclado.nextInt();
			cuenta++;
		}while(calculo==resultado);
		System.out.println("Ha realizado un total de " + (cuenta-1) + " calculos correctos");
	}
}
