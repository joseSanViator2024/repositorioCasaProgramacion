package casatema6;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class casat6 {

	
	//3 strings
	//localdate 1.5
	//Regex 1
	//2 crear clases 1.5 + 0.75

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//T6: 1,2,3,5,7,8,9
		//REGEX:1,2,3,4,6,7,8,9---¿10,11,12?
		ej3();
	}

	//Ej: Hacer una funcion que cuente cuantas veces aparece una palabra y en que posiciones lo hace
	
	public static void ej1(String palabra) {
		String frase="Hola que tal esta y que tal todo";
		int posicion=0;
		int veces=0;
		int indice=0;
		do {
			if(posicion!=-1) {
				posicion=frase.indexOf(palabra, indice);
				if(posicion!=-1) {
					System.out.println("la palabra aparece en la posicion" + posicion);
					indice=posicion+palabra.length();
					veces++;
				}
			}	
		}while(posicion!=-1);
		System.out.println("la palabra " + palabra + " aparece " + veces);
		
	}
	
	//Ej:Crea una funcion que pida al usuario una frase de cualquier longitud, le de la vuelta y muestre el resultado por
		//pantalla. Ejemplo: Para la frase "el libro es negro" debe mostrar "orgen se orbil le". Ademas, calcula cuantas 
		//vocales tiene la frase y muestra dicho valor por pantalla
	
	public static void ej2(String frase) {
		String reves="";
		int numeroVocales=0;
		for(int i=frase.length()-1; i>=0; i--) {
			reves+=frase.charAt(i);
			reves=reves.toLowerCase();
			if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u') {
				numeroVocales++;
			}
		}
		System.out.println(reves);
		System.out.println("numero vocales" + numeroVocales);
		
	}
	
	//Ej:Realiza un programa que lea una frase introducida por teclado por el usuario y muestre dicha frase ordenando todas
		//sus palabras de manera alfabetica pero en orden inverso ("Maria" iria antes que "ave"). Por ejemplo, para frase: 
		//"el aguila vuela sobre el valle" deberia mostrar "valle vuela sobre el aguila".
	
	public static void ej3() {
		System.out.println("Introduzca una frase separada por especios");
		Scanner teclado=new Scanner(System.in);
		String frase=teclado.nextLine();
		String [] arrayFrase=frase.split(" ");
		String [] arrayFraseReves= new String [arrayFrase.length];
		Arrays.sort(arrayFrase);
		System.out.println(Arrays.toString(arrayFrase));
		int contador=0;
		for(int i=arrayFrase.length-1; i>=0; i--) {
			arrayFraseReves[contador]=arrayFrase[i];
			contador++;
		}
		
		for(String variable:arrayFraseReves) {
			System.out.print(variable+" ");
		}
	}
	
	/*4. Diseñar una función que solicite al usuario una frase y una palabra. El
	programa le dirá al usuario cuántas veces aparece la palabra en la frase.
	Ten en cuenta que dos palabras pueden estar separados por más
	caracteres que el espacio simple, como, por ejemplo, la coma y el punto.*/
	
	public static void ejercicio4(String frase, String palabra) {
		int veces=0;
		int busca=0;
		for(int i=0; i<frase.length(); i++) {
			busca=frase.indexOf(palabra, i);
			System.out.println(busca);
			if(busca>=0) {
				veces++;
				i+=busca+palabra.length();//sumo la posicion en la que encontro la palabra y la longitud de la palabra
			}
		}
		System.out.println(veces);
	}
	/*5. Escribe un programa que solicite al usuario dos palabras y le diga si dos
	palabras son anagramas una de otra. Recordatorio: una palabra es un
	anagrama de otra si una se puede construir con las mismas letras que la
	otra, pero cambiadas de orden. Ejemplo: amor, roma y ramo son
	anagramas.*/
	
	public static void ejercicio5(String palabra1, String palabra2) {
		boolean anagrama=false;
		char letra='a';
		int contador=0;
		int busca=0;
		char [] arrayDePalabra2=new char [0];
		for(int i=0; i<palabra1.length(); i++) {
			letra=palabra1.charAt(i);
			busca=palabra2.indexOf(letra);//busco la letra i  de palabra1 en palabra2
			if(busca>=0) {//si encuentra, añadira esa letra a un array
				arrayDePalabra2=Arrays.copyOf(arrayDePalabra2, arrayDePalabra2.length+1);
				arrayDePalabra2[contador]=letra;
				contador++;//el contador es para ir sumando de uno en uno las posiciones
			}
		}
		if(arrayDePalabra2.length==palabra2.length()) {//sera anagrama si la longitude del array coincide con la longitud de la palabra2
			anagrama=true;
		}
		System.out.println(arrayDePalabra2);
		System.out.println(anagrama);
	}
	
	/*7. Implementa una aplicación que, una vez introducido un texto, permita
	reemplazar todas las ocurrencias de una palabra por otra distinta.*/
	public static void ejercicio7(String texto, String palabra1, String palabra2) {
		//supongo que esta separada por espacios:
		String [] array=texto.split(" ");
		for(int i=0; i<array.length; i++) {
			if(array[i].equalsIgnoreCase(palabra1)) {
				array[i]=palabra2;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	/*8. Crea un programa que lea una frase del usuario por teclado y muestre
	una frase que contenga las mismas palabras pero en la que éstas estén
	ordenadas de manera alfabética. Ejemplo: Para “El despertador es rojo”
	mostraría “despertador el es rojo”.*/
	public static void ejercicio8() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce texto");
		String texto=teclado.nextLine();
		texto=texto.toLowerCase();
		String [] array=texto.split(" ");
		Arrays.sort(array);
		for(String orden:array) {
			System.out.println(orden);
		}
		
	}
	/*9. Diseña una aplicación que implemente una pequeña agenda. Mediante un
	menú, el usuario podrá:
	
	1-Añadir un nuevo contacto (con nombre y teléfono)
	2-Buscar un teléfono de un contacto a partir de un nombre.
	3-Mostrar la información de todos los contactos ordenados
	alfabéticamente por nombre.
	Puedes codificar el nombre y el teléfono en una única cadena mediante
	“nombre:teléfono”.*/
	
	public static void ejercicio9() {
		String [] agenda=new String [0];
		int opcion=0;
		do {
			System.out.println("Introduce una opcion 1-Introducir contacto nombre:telefono 2-Buscar contacto por nombre 3-Mostrar contactos ordenados alfabeticamente 4-Salir");
			Scanner teclado=new Scanner(System.in);
			boolean encuentra=false;
			opcion=teclado.nextInt();
			switch (opcion) {
				case 1:
					teclado.nextLine();
					System.out.println("Introduce contacto");
					String contacto=teclado.nextLine();
					agenda=Arrays.copyOf(agenda, agenda.length+1);
					agenda[agenda.length-1]=contacto;
					break;
				case 2:
					teclado.nextLine();
					System.out.println("Introduce nombre para buscar contacto");
					String nombre=teclado.nextLine();
					for(int i=0; i<agenda.length; i++) {
						encuentra=agenda[i].contains(nombre);
						if(encuentra==true) {
							System.out.println(agenda[i]);
						}
					}
					break;
				case 3: 
					Arrays.sort(agenda);
					for (String var:agenda) {
						System.out.println(var);
					}
			}
		}while(opcion!=4);
	}
	
	public static void fechas() {
		LocalDate fecha1=LocalDate.of(2010, 12, 30);
		System.out.println(fecha1.getMonth());
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		String fechaFormateada=fecha1.format(formato);
		System.out.println(fechaFormateada);
		
		LocalDate fecha2=LocalDate.now();
		Period periodo;
		periodo=Period.between(fecha1, fecha2);
		int dias=periodo.getDays();
		System.out.println(dias);
		
		long diferencia=ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println(diferencia);
	}
	
	/*regex validar dni y matricula; 1,7 dates; 8,9 decimal*/
	
	//1
	public static void ejercicio1() {
		//a
		LocalDateTime fecha=LocalDateTime.now();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("d/MM/yyyy");
		String fechaFormateada=fecha.format(formato);
		System.out.println(fechaFormateada);
		//b
		DateTimeFormatter formatob=DateTimeFormatter.ofPattern("d/M/yyyy");
		String fechaFormateadab=fecha.format(formatob);
		System.out.println(fechaFormateadab);
		//d
		DateTimeFormatter formatoc=DateTimeFormatter.ofPattern("d/MMMM/yy");
		String fechaFormateadac=fecha.format(formatoc);
		System.out.println(fechaFormateadac);
		//e
		DateTimeFormatter formatoe=DateTimeFormatter.ofPattern("d ' de ' MMMM ' del ' yyyy");
		String fechaFormateadae=fecha.format(formatoe);
		System.out.println(fechaFormateadae);
		//f
		DateTimeFormatter formatof=DateTimeFormatter.ofPattern("'Dia:'d'Mes:'MMMM 'Año:'yyyy");
		String fechaFormateadaf=fecha.format(formatof);
		System.out.println(fechaFormateadaf);
		//g
		DateTimeFormatter formatog=DateTimeFormatter.ofPattern("d-MMMM-yyyy");
		String fechaFormateadag=fecha.format(formatog);
		System.out.println(fechaFormateadag);
		//h
		DateTimeFormatter formatoh=DateTimeFormatter.ofPattern("dd-MM-yy");
		String fechaFormateadah=fecha.format(formatoh);
		System.out.println(fechaFormateadah);
	}
	
	public static void ejercicio7() {
		System.out.println("Indique su fecha cumple formato xx/xx/xxxx");
		Scanner teclado=new Scanner (System.in);
		String fecha=teclado.nextLine();
		String[] arrayFecha=fecha.split("/");
		int dia=Integer.parseInt(arrayFecha[0]);
		int mes=Integer.parseInt(arrayFecha[1]);
		int anyo=Integer.parseInt(arrayFecha[2]);
		LocalDate fechaOk=LocalDate.of(anyo, mes, dia);
		LocalDate fechaHoy=LocalDate.now();
		
		long diferencia=ChronoUnit.DAYS.between(fechaOk, fechaHoy);
		System.out.println(diferencia);
	}
	
	public static void ejercicio8a(double numero) {
		DecimalFormat formato= new DecimalFormat("#.##");
		String numeroString=formato.format(numero);
		System.out.println(numeroString);
	}
	public static String ejercicio9(double numero) {
		String resultado="";
		DecimalFormat formato=new DecimalFormat("0.000");
		resultado=formato.format(numero);
		return resultado;
	}

	public static void matricula() {
		String regex="^[0-9]{4}+[-]{1}+[A-Z]{3}";
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduzca matricula");
		String entrada=teclado.nextLine();
		boolean ok=entrada.matches(regex);
		System.out.println(ok);
	}
	
	public static void dni() {
		String regex="^[0-9]{8}[A-Z]{1}$";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce dni");
		String dni=teclado.nextLine();
		boolean ok=dni.matches(regex);
		System.out.println(ok);
	}
	
	public static int calcularValorPalabra(String palabra) {
		int resultado=0;
		int [] valorLetra= {1,3,3,2,1,4,2,4,1,8,0,1,3,1,1,3,5,1,1,1,1,4,0,8,4,10};
		int valorASCI=97;
		int valorASCIZ=241;
		int valor=0;
		for(int i=0; i<palabra.length(); i++) {
			valor=(int)palabra.charAt(i);//IMPORTANTE->TOMAR VALOR DE CHAR EN TABLA ASCII
			if(valor==valorASCIZ) {
				resultado+=8;
			}else {
			resultado+=valorLetra[valor-valorASCI];
			}
		}
		return resultado;
	}
	public static void ejercicio2Prueba() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("indica frase separada por espacios");
		String frase=teclado.nextLine();
		frase=frase.toLowerCase();
		String[] arrayFrase=frase.split(" ");
		String fraseFinal="";
		String palabraMasCorta="palabramuylargapalabramuylargalalsalsaldasdlsalddasdlasdad";
		String palabraMasLarga="";
		for(int i=0; i<arrayFrase.length; i++) {
			if(arrayFrase[i].length()<palabraMasCorta.length()) {
				palabraMasCorta=arrayFrase[i];
			}
			if(arrayFrase[i].length()>palabraMasLarga.length()) {
				palabraMasLarga=arrayFrase[i];
			}
			if(arrayFrase[i].length()<=2) {
				fraseFinal+=arrayFrase[i].toLowerCase()+" ";
			}
			if(arrayFrase[i].length()>=3&&arrayFrase[i].length()<=5) {
				fraseFinal+=arrayFrase[i].toUpperCase()+" ";
			}
			if(arrayFrase[i].length()>5) {
				fraseFinal+=arrayFrase[i].substring(0,1).toUpperCase() + arrayFrase[i].substring(1, (arrayFrase[i].length()-2))+ arrayFrase[i].substring((arrayFrase[i].length()-1)).toUpperCase()+ " ";		
			}
		}
		System.out.println(fraseFinal);
		System.out.println("palabra mas corta " + palabraMasCorta);
		System.out.println("palabra mas larga " + palabraMasLarga);		
	}
	public static String cesar(String palabra,int avance) {////////////////MAL///////////////////
		String resultado="";
		char letra='1';
		int valorAsciiLetra=1;
		int ASCII=97;
		int ASCIIZ=241;
		char [] abecedario= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0; i<palabra.length(); i++) {
			if(palabra.charAt(i)<=abecedario[13]) {
				valorAsciiLetra=(int)palabra.charAt(i);
				letra=abecedario[valorAsciiLetra-ASCII+avance];
				resultado+=letra;
			}
			if(palabra.charAt(i)==abecedario[14]) {
				valorAsciiLetra=(int)palabra.charAt(i);
				letra=abecedario[valorAsciiLetra-ASCIIZ+avance];
				resultado+=letra;
			}
			if(palabra.charAt(i)>abecedario[14]) {
				valorAsciiLetra=(int)palabra.charAt(i);
				letra=abecedario[valorAsciiLetra-(ASCII+1)+avance];
				resultado+=letra;
			}
		}
		return resultado;
	}
	public static void ejercicio4Pruebas() {
		LocalDateTime fecha=LocalDateTime.now();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("d/M/yyyy");
		String fechaFormateada=fecha.format(formato);
		System.out.println(fechaFormateada);
		
		DateTimeFormatter formato2=DateTimeFormatter.ofPattern("d/MMMM/yy");
		String fechaFormateada2=fecha.format(formato2);
		System.out.println(fechaFormateada2);
		
		DateTimeFormatter formato3=DateTimeFormatter.ofPattern("d'de' MMMM'de'yyyy");
		String fechaFormateada3=fecha.format(formato3);
		System.out.println(fechaFormateada3);
		
		DateTimeFormatter formato4=DateTimeFormatter.ofPattern("'Dia:' d '; Mes='MMMM '; Año:' yyyy");
		String fechaFormateada4=fecha.format(formato4);
		System.out.println(fechaFormateada4);
	}
	public static void ejercicio5Pruebas() {
		LocalDate fecha=LocalDate.of(1987, 3, 25);
		LocalDate hoy=LocalDate.now();
		Period p=Period.between(fecha, hoy);
		int anyo2=p.getYears();
		int mes2=p.getMonths();
		int dias2=p.getDays();
		System.out.println("Han pasado " + anyo2 + " años, " + mes2 + " meses, "+ dias2 + " dias");
	}
	public static boolean validarMatricula(String matricula) {
		boolean resultado=true;
		String validador="^[0-9]{4}-[B-DF_HJ-NP-TV-Z]{3}$";
		Pattern patron=Pattern.compile(validador);
		Matcher ma=patron.matcher(matricula);
		resultado=ma.matches();
		//boolean resultado2=Pattern.matches(patron, matricula);
		return resultado;
	}
	public static boolean validarTelefonoValladolid(String telefono) {
		String patron="^(983)[0-9]{6}$";
		boolean resultado=Pattern.matches(patron, telefono);
		return resultado;
	}
	public static boolean validarDNI(String dni) {
		String patron="^[0-9]{8}[A-HJ-NP-TV-Z]{1}$";
		boolean resultado=Pattern.matches(patron, dni);
		//para ver si es un dni validable:
		char[] letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		if(resultado) {
			String numero=dni.substring(0, 8);
			char letra=dni.charAt(8);
			int num=Integer.parseInt(numero);
			int resto=num%23;
			if(letra==letras[resto]) {
				System.out.println("letra correcta");
			}else {
				resultado=false;
			}
		}
		return resultado;
	}
	
	public static void parImpar(String frase) {
		String [] frase2=frase.split(" ");
		for(int i=0; i<frase2.length; i++) {
			if(frase2[i].length()%2==0) {
				frase2[i]=frase2[i].substring(0,1).toUpperCase()+frase2[i].substring(1, frase2[i].length()-1).toLowerCase()+frase2[i].substring(frase2[i].length()-1).toUpperCase();
				
			}
			if(frase2[i].length()%2!=0) {
				frase2[i]=frase2[i].toUpperCase();
			}
		}
		for(String valor:frase2) {
			System.out.println(valor);
		}
	}
	
	public static boolean valdni(String dni) {
		boolean resultado=true;
		String patron="^[0-9]{8}[A-HJ-NP-TV-Z]{1}$";
		Pattern patron2=Pattern.compile(patron);
		Matcher validador=patron2.matcher(dni);
		resultado=validador.matches();
		char[] letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int dniNum=Integer.parseInt(dni.substring(0, dni.length()-1));
		int calculo=dniNum%23;
		char letra=dni.charAt(dni.length()-1);
		if(letras[calculo]!=letra) {
			resultado=false;
		}
		return resultado;
	}

	
}
