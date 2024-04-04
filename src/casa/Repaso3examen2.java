///////////////OJO CON LOS ARRAYS INICIALIZADOS EN 0, NORMALMENTE DO WHILE PARA QUE ENTREN UNA VEZ Y DETRO DE AHI AUMENTAR TAMAÑO ARRAY//////////////////


package casa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Repaso3examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio12Dos();
	}
	public static int [] eliminarEnRango(int[]tabla, int min, int max) {
		int[] definitivo=new int[0];
		for(int i=0; i<tabla.length; i++) {
			if(tabla[i]<min||tabla[i]>max) {
				definitivo=Arrays.copyOf(definitivo, definitivo.length+1);
				definitivo[definitivo.length-1]=tabla[i];
			}
		}
		return definitivo;
	}
	public static int[] filtrarArray(int[]entrada, int min, int max, boolean opcion) {
		int[] definitivo=new int[0];
		if(max>min) {
			for(int i=0; i<entrada.length; i++) {
				if(opcion&&(entrada[i]>=min&&entrada[i]<=max)) {//el limite maximo no me lo respeta//
					definitivo=Arrays.copyOf(definitivo, definitivo.length+1);
					definitivo[definitivo.length-1]=entrada[i];					
				}
				if(!opcion&&(entrada[i]<min||entrada[i]>max)) {
					definitivo=Arrays.copyOf(definitivo, definitivo.length+1);
					definitivo[definitivo.length-1]=entrada[i];
				}
			}
		}
		return definitivo;
	}
	
	public static int[]ejercicio3(int min, int max, int cantidad){
		int[]definitivo=new int[cantidad];
		Random aleatorio=new Random();
		if(min+5<=max) {
			for(int i=0; i<definitivo.length; i++) {
				definitivo[i]=aleatorio.nextInt(min, max+1);
				
			}
		}else {
			cantidad=0;
		}
		return definitivo;
	}
	public static void ejercicio3b() {
		int[] tabla=ejercicio3(1,25,50);
		Arrays.sort(tabla);
		for(int valor:tabla) {
			System.out.print(valor+ " ");
		}	
	}
	public static void ejercicio4() {
		double [][] bidimensional=new double [6][7];
		double valor1=0;
		double valor2=0;
		for(int i=0; i<bidimensional.length; i++) {
			for(int k=0; k<bidimensional[i].length; k++) {
				valor1=(Math.pow(i, 2))+Math.pow(k, 2);
				valor2=Math.sqrt(valor1);
				valor2=valor2*100;
				valor2=Math.round(valor2);
				valor2=valor2/100;
				bidimensional[i][k]=valor2;
			}
		}
		for( double [] resultado:bidimensional) {//OJO EL FOR EACH DE BIDIMENSIONALES VS UNIDIMENSIONALES: for(tipoDato [] a:Array) VS for(tipoDato a:Array)
			System.out.println(Arrays.toString(resultado));
		}
	}
	public static int[] insertarEnPosicion(int[] tabla, int valor, int posicion) {
		int[] resultado=new int [0];
		
		if(posicion>=tabla.length) {
			return tabla;
		}else {
			resultado=Arrays.copyOf(tabla, (tabla.length+1));
			for(int i=resultado[resultado.length-2]; i>=posicion; i--) {
				resultado[i+1]=resultado[i];
			}
			resultado[posicion]=valor;
		}
		return resultado;
	}
	public static int ejercicio6(byte[] tabla) {
		int resultado=0;
		for(int i=0; i<tabla.length; i++) {
			resultado=resultado+(int) (tabla[i]*(Math.pow(2, tabla.length-i-1)));
			System.out.println(resultado);
		}
		return resultado;
	}
	public static int[] ejercicio7a(int min, int max) {
		int[] resultado=new int[0];
		for(int i=min; i<=max; i++) {
			if(i%3==0&&i%2!=0) {
			resultado=Arrays.copyOf(resultado, resultado.length+1);
			resultado[resultado.length-1]=i;
			}
		}
		return resultado;
	}
	public static void ejercicio7b() {
		int[] resultado=ejercicio7a(1,300);//llamar a una funcion desde otra para probar con XXX valores indicados en el enunciado
		for(int a:resultado) {
			System.out.println(a);
		}
	}
	public static void ejercicio8() {
		double[][] definitivo=new double [4][7];
		double valor=0;
		for(int n=0; n<definitivo.length; n++) {
			for(int m=0; m<definitivo[n].length; m++) {
				valor=Math.sqrt(Math.pow(n,m));
				valor=valor*100;
				valor=Math.round(valor);
				valor=valor/100;
				definitivo[n][m]=valor;
			}
		}
		for(int n=0; n<definitivo.length; n++) {//formato tabla
			for(int m=0; m<definitivo[n].length; m++) {
				System.out.print(definitivo[n][m] + " ");
			}
			System.out.println("");
		}	
		for(double [] a:definitivo) {//formato array 
			System.out.println(Arrays.toString(a));
		}
	}
	public static void ejercicio9() {
		Scanner teclado=new Scanner(System.in);
		double[]  tabla=new double [0];
		double valor=0;
		do {
			System.out.println("Introduce un numero o un valor negativo para finalizar");
			valor=teclado.nextDouble();
			if(valor>=0) {
				tabla=Arrays.copyOf(tabla, tabla.length+1);
				tabla[tabla.length-1]=valor;
			}	
		}while(valor>=0);
		
		double [] tabla2=new double[tabla.length];
		for(int i=0; i<tabla.length; i++) {
			tabla2[i]=tabla[tabla.length-1-i];
		}
		System.out.println(Arrays.toString(tabla2));
		Arrays.sort(tabla2);
		System.out.println(Arrays.toString(tabla2));
	}
	public static void ejercicio10() {
		int[] tabla=new int[24];
		Random aleatorio=new Random();
		int cuenta1=0;
		int cuenta2=0;
		int cuenta3=0;
		int cuenta4=0;
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=aleatorio.nextInt(1,21);
		}
		System.out.println(Arrays.toString(tabla));
		for(int i=0; i<tabla.length; i++) {
			if(tabla[i]>=1&&tabla[i]<=5) {
				cuenta1++;
			}
			if(tabla[i]>=6&&tabla[i]<=10) {
				cuenta2++;
			}
			if(tabla[i]>=11&&tabla[i]<=15) {
				cuenta3++;
			}
			if(tabla[i]>=16&&tabla[i]<=20) {
				cuenta4++;
			}
		}
		System.out.println(" hay "+ cuenta1 + " numeros entre 1 y 5");
		System.out.println(" hay "+ cuenta2 + " numeros entre 6 y 10");
		System.out.println(" hay "+ cuenta3 + " numeros entre 11 y 15");
		System.out.println(" hay "+ cuenta4 + " numeros entre 16 y 20");
	}
	public static void ejercicio11(int [] tabla) {
		boolean cambios=true;
		int i=0;
		int aux=0;
		do {
			cambios=false;
			for(i=0; i<tabla.length-1; i++) {
				if(tabla[i+1]<tabla[i]) {
					aux=tabla[i];
					tabla[i]=tabla[i+1];
					tabla[i+1]=aux;
					cambios=true;
				}
			}
		}while(cambios==true);
		System.out.println(Arrays.toString(tabla));
		
		/*int[] tabla= {1,2,7,4,9,0,5,2,0,0};
		ejercicio11(tabla);*///main
	}
	/*Crea una funcion que reciba un array de numeros enteros entre 0 y 20 (aleatorios)
	 * (extremos incluidos) como parametro de entrada y que cuente y muestre por pantalla cuantas veces se 
	 * repite cada numero. A continuacion, muestra un mensaje indicando cual es el numero que mas veces
	 * se repite y la cantidad de veces que lo hace y el que menos se repite y la cantidad de veces que lo hace
	 */
	public static void repaso2811examen1(int[] tabla) {
		int[] indice=new int[21];//la longitud de este array que servira de indice sera igual al valor maximo que pueda tomar el array tabla
		int maximo=0;
		int minimo=10;
		int indiceMaximo=0;
		int indiceMinimo=0;
		for(int i=0; i<tabla.length; i++) {
					indice[tabla[i]]++;//sumara 1 en cada posicion del array indice segun el valor que tenga tabla [i] 
		}
		System.out.println(Arrays.toString(indice));
		//recorro el array indice generado
		for(int i=0; i<indice.length; i++) {
			if(indice[i]>maximo) {
				maximo=indice[i]; //muestra el valor maximo del array indice (ese valor maximo es el numero de veces que se repite el numero, que es el situado en la posicion i
				indiceMaximo=i; //muestra el numero i que tiene el mayor numero de repeticiones
			}
			if(indice[i]<minimo) {
				minimo=indice[i];
				indiceMinimo=i;
			}
		}
		System.out.println("El numero que mas veces se repite es " + indiceMaximo + " y se repite " + maximo);
		System.out.println("El numero que menos veces se repite es "+ indiceMinimo  + " y se repite "+ minimo);
		
		/*Random aleatorio=new Random();
		int[] tabla=new int [15];
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=aleatorio.nextInt(0,21);
		}
		System.out.println(Arrays.toString(tabla));
		repaso2811examen1(tabla);*///al  main
		
	}
	/*Dado un array bidimensional que almacena las notas decimales de 3 examenes de cada alumno (5 alumnos)
	 * Cada fila almacenara la informacion de los exemenes de un alumno, el valor de la columna 0 es la calificacion
	 * del primer examen, la columna 1 la del segundo y la columna 2 la del tercero
	 * Se pide calcular la nota media ponderada de cada alumno teniendo en cuenta que el primer examen cuenta un 45%, el segundo un 20% y el
	 * tercer un 35% de la calificacion total
	 * Tambien, muestra la nota media global de la clase en cada trimestre
	 */
	
	public static void repaso2811examen2() {
		Scanner teclado=new Scanner(System.in);
		double [] [] array=new double [5][3];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println("Introduzca la nota del " + (j+1) +" trimestre del alumno " + (i+1));
				array[i][j]=teclado.nextDouble();
			}
		}
		for(double [] a:array) {
			System.out.println(Arrays.toString(a));
		}
		double mediaTotalTrimestre1=0;
		double mediaTotalTrimestre2=0;
		double mediaTotalTrimestre3=0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(j==0) {
					mediaTotalTrimestre1=mediaTotalTrimestre1+array[i][j];
				}
				if(j==1) {
					mediaTotalTrimestre2=mediaTotalTrimestre2+array[i][j];
				}
				if(j==2) {
					mediaTotalTrimestre3=mediaTotalTrimestre3+array[i][j];
				}
			}	
		}	
		mediaTotalTrimestre1=mediaTotalTrimestre1*0.45/5;
		mediaTotalTrimestre2=mediaTotalTrimestre2*0.2/5;
		mediaTotalTrimestre3=mediaTotalTrimestre3*0.3/5;
		System.out.println(mediaTotalTrimestre1);
		System.out.println(mediaTotalTrimestre2);
		System.out.println(mediaTotalTrimestre3);
	}
	//falta de hacer la media de cada alumno
	
	
	public static void ejercicio1() {
		int [] tabla=new int[12];
		Random teclado=new Random();
		int suma=0;
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=teclado.nextInt(1,101);
			suma=suma+tabla[i];
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println(suma);
	}
	public static void ejercicio2() {
		int[] array=new int[5];
		Scanner teclado=new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			array[i]=teclado.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int[] invertido=new int[5];
		for(int i=0; i<array.length; i++) {
			invertido[array.length-1-i]=array[i];
		}
		System.out.println(Arrays.toString(invertido));
	}
	public static int maximo(int[] t) {
		int valor=0;
		for(int i=0; i<t.length; i++) {
			if(t[i]>valor) {
				valor=t[i];
			}
		}
		return valor;
	}
	public static int[] rellenaPares(int longitud, int fin) {
		int[] resultado=new int[longitud];
		Random aleatorio=new Random();
		int numero=2;
		for(int i=0; i<resultado.length; i++) {
			do {
				numero=aleatorio.nextInt(2, fin+1);
			}while(numero%2!=0);
			resultado[i]=numero;
		}
		System.out.println(Arrays.toString(resultado));
		Arrays.sort(resultado);
		return resultado;
	}
	public static int ejercicio5(int [] tabla1, int [] aciertos) {
		int acertados=0;
		int numero=0;
		System.out.print("numeros acertados ");
		for(int i=0; i<tabla1.length; i++) {
			for(int j=0; j<aciertos.length; j++) {
				if(tabla1[i]==aciertos[j]) {
					acertados++;
					numero=tabla1[i];
					System.out.print(numero + " ");
				}
			}
		}
		System.out.println("");
		System.out.println("Total aciertos ");
		return acertados;
	}
	public static int [] sinRepetidos(int[]t) {
		int [] resultado=new int[0];
		boolean coincide=false;
		for(int i=0; i<t.length; i++) {
			coincide=false;
			for(int j=0; j<resultado.length; j++) {
				if(t[i]==resultado[j]) {
					coincide=true;
				}
			}
				if(coincide==false) {
					resultado=Arrays.copyOf(resultado, resultado.length+1);
					resultado[resultado.length-1]=t[i];
				}
		}
		return resultado;
	}
	public static void ejercicio7(int[]tablaInicial) {
		int[] tablaPares=new int [0];
		int[] tablaImpares=new int [0];
		for(int i=0; i<tablaInicial.length; i++) {
			if(tablaInicial[i]%2==0) {
				tablaPares=Arrays.copyOf(tablaPares, tablaPares.length+1);
				tablaPares[tablaPares.length-1]=tablaInicial[i];
			}
			if(tablaInicial[i]%2!=0) {
				tablaImpares=Arrays.copyOf(tablaImpares, tablaImpares.length+1);
				tablaImpares[tablaImpares.length-1]=tablaInicial[i];
			}
		}
		Arrays.sort(tablaPares);
		Arrays.sort(tablaImpares);
		System.out.println(Arrays.toString(tablaPares));
		System.out.println(Arrays.toString(tablaImpares));
	}
	
	public static void ejercicio9(int longitud) {/////////////////MAL//////////////////
		int[] codigo=new int [longitud];
		Random aleatorio=new Random();
		for(int i=0; i<codigo.length; i++) {
			codigo[i]=aleatorio.nextInt(1,6);
		}
		Scanner teclado=new Scanner (System.in);
		int[] miClave=new int [longitud];
		do {
			for(int i=0; i<miClave.length; i++) {
				System.out.println("Introduce el digito " + (i+1) +" de su clave");
				miClave[i]=teclado.nextInt();
			}
		
			for(int i=0;i<codigo.length; i++) {
				if(miClave[i]>codigo[i]) {
					System.out.println("digito " + (i+1) + " mayor a codigo");
				}
				if(miClave[i]<codigo[i]) {
					System.out.println("digito " + (i+1) + " menor a codigo");
				}
				if(miClave[i]==codigo[i]) {
					System.out.println("digito " + (i+1) + " igual a codigo");
				}
			}
		}while(miClave!=codigo);
	}
	public static void ejercicio10Dos() {
		int[][] bidimensional=new int [5][5];
		for(int i=0; i<bidimensional.length; i++) {
			for(int j=0; j<bidimensional[i].length; j++) {
				bidimensional[i][j]=2*i*j;
			}
		}
		for(int i=0; i<bidimensional.length;i++) {
			for(int j=0; j<bidimensional[i].length; j++) {
				System.out.print(bidimensional[i][j]+" ");
			}
		}
	}
	

	
}
