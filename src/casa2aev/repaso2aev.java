//comparador de doubles: Double.compare
//invertir orden: Collections.reverseOrder() Ej: ComparadorNotaP cp=new ComparadorNotaP();
											//   Arrays.sort(arrayAlumnos, cp.reversed());
//importante el return de los metodos y luego sobrescribir en el metodo principal: Ej: arrayAlumnos=aniadirAlumno(arrayAlumnos);
package casa2aev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class repaso2aev {

	public static void main(String[] args) {
		//fechas:
				LocalDate fecha=LocalDate.now();
				LocalDate fecha2=LocalDate.of(2000, 12, 27);
				LocalDateTime fecha3=LocalDateTime.now();
				DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
				String fechaFormateada=fecha.format(formato);
				System.out.println(fechaFormateada);
				
				Period periodo;
				periodo=Period.between(fecha, fecha2);//para sacar la diferencia entre dos periodos
				int anyo=periodo.getYears();
				System.out.println(anyo);
				
				DecimalFormat formatoD=new DecimalFormat("#.##");
				double numero=30.9876532;
				String numeroFormateado=formatoD.format(numero);//el numero formateado es un STRING!!
				System.out.println(numeroFormateado);
		
		/////////////////////////////////////////////////
		
		ejercicio2();

		
	}
	public static void ejercicio1() {
		String ruta="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\ejercicio1.txt";
		String rutaEscritura="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\resultados.txt";
		String linea="";
		String [] arrayLectura;
		int numero1;
		int numero2;
		double calculo;
		try(BufferedReader reader=new BufferedReader(new FileReader (ruta))){
			while((linea=reader.readLine())!=null) {
				arrayLectura=linea.split(" ");
				numero1=Integer.parseInt(arrayLectura[0]);
				numero2=Integer.parseInt(arrayLectura[1]);
				calculo=Math.pow(numero1, numero2);
				DecimalFormat formato=new DecimalFormat("#.#");
				String calculoFormateado=formato.format(calculo);
				System.out.println(numero1+"^"+numero2+"="+calculoFormateado);
				try(BufferedWriter writer=new BufferedWriter(new FileWriter(rutaEscritura, true))){//true: continua escribiend en nueva linea; false: sobrescribe
					writer.write(numero1+" "+numero2+" "+calculoFormateado);
					writer.newLine();
					
				} catch (IOException ex) {
					System.out.println(ex.toString());
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("fichero no encontrado");
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
	}
	
	public static void ejercicio2() {
		leerFichero();
		int opcion=0;
		Alumno [] arrayAlumnos=leerFichero();
		Scanner teclado=new Scanner(System.in);
		int opcion2=0;
		do {
			System.out.println("Indique una opcion del menu:");
			System.out.println("1-Mostrar alumnos alfabéticamente\r\n"
					+ "2-Mostrar alumnos ordenados por nota de Programación\r\n"
					+ "3- Mostrar alumnos ordenados por nota de Lenguaje de Marcas\r\n"
					+ "4- Mostrar alumnos ordenados por nota de Sistemas Informáticos\r\n"
					+ "5-Añadir alumno\r\n"
					+ "6-Guardar y salir");
			opcion=teclado.nextInt();
			teclado.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Indique modalidad: 1- descendente; 2-Ascendente");
				opcion2=teclado.nextInt();
				if(opcion2==1) {
					for(Alumno a:arrayAlumnos) {
						System.out.println(a);
					}
				}
				if(opcion2==2) {
					Arrays.sort(arrayAlumnos, Collections.reverseOrder());
					for(Alumno a:arrayAlumnos) {
						System.out.println(a);
					}
				}
				break;
			case 2:
				System.out.println("Indique modalidad: 1- asscendente; 2-descendente");
				opcion2=teclado.nextInt();
				if(opcion2==1) {
					 ComparadorNotaP cp=new ComparadorNotaP();
					 Arrays.sort(arrayAlumnos, cp);
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				if(opcion2==2) {
					ComparadorNotaP cp=new ComparadorNotaP();
					 Arrays.sort(arrayAlumnos, cp.reversed());
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				break;
			case 3:
				System.out.println("Indique modalidad: 1- asscendente; 2-descendente");
				opcion2=teclado.nextInt();
				if(opcion2==1) {
					 ComparadorNotaL cl=new ComparadorNotaL();
					 Arrays.sort(arrayAlumnos, cl);
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				if(opcion2==2) {
					ComparadorNotaL cl=new ComparadorNotaL();
					 Arrays.sort(arrayAlumnos, cl.reversed());
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				break;
			case 4:
				System.out.println("Indique modalidad: 1- asscendente; 2-descendente");
				opcion2=teclado.nextInt();
				if(opcion2==1) {
					 ComparadorNotaS cs=new ComparadorNotaS();
					 Arrays.sort(arrayAlumnos, cs);
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				if(opcion2==2) {
					ComparadorNotaS cs=new ComparadorNotaS();
					 Arrays.sort(arrayAlumnos, cs.reversed());
					 for(Alumno a:arrayAlumnos) {
							System.out.println(a);
						}
				}
				break;
			case 5:
				arrayAlumnos=aniadirAlumno(arrayAlumnos);
				break;
			case 6:
				guardarYSalir(arrayAlumnos);
				System.out.println("fin del programa");
				break;
			default:
				System.out.println("selecciona una opcion valida");
				break;
			}
		}while(opcion!=6);
		
	}
			private static Alumno [] leerFichero() {
				String ruta="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\ejercicio2.txt";
				String linea="";
				String [] arrayLectura;
				String nombre;
				double notaP;
				double notaL;
				double notaS;
				Alumno [] arrayAlumnos=new Alumno[0];
				try(BufferedReader reader=new BufferedReader(new FileReader(ruta))){
					while((linea=reader.readLine())!=null) {
						arrayLectura=linea.split(";");
						nombre=arrayLectura[0];
						notaP=Double.parseDouble(arrayLectura[1]);
						notaL=Double.parseDouble(arrayLectura[2]);
						notaS=Double.parseDouble(arrayLectura[3]);
						Alumno al=new Alumno(nombre, notaP, notaL, notaS);
						arrayAlumnos=Arrays.copyOf(arrayAlumnos, arrayAlumnos.length+1);
						arrayAlumnos[arrayAlumnos.length-1]=al;
					}
				} catch (FileNotFoundException ex) {
					System.out.println("fichero no encontrado");
				} catch (IOException ex) {
					System.out.println(ex.toString());
				}
				return arrayAlumnos;
			}
			public static Alumno [] aniadirAlumno( Alumno [] arrayAlumnos) {
				String ruta="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\ejercicio2.txt";
				String nombre;
				double notaP;
				double notaL;
				double notaS;
				Scanner teclado=new Scanner(System.in);
				System.out.println("introduce nombre");
				nombre=teclado.nextLine();
				System.out.println("nota Programacion");
				notaP=teclado.nextDouble();
				System.out.println("nota Lenguaje");
				notaL=teclado.nextDouble();
				System.out.println("nota Sistemas");
				notaS=teclado.nextDouble();
				Alumno al=new Alumno(nombre, notaP, notaL, notaS);
				arrayAlumnos=Arrays.copyOf(arrayAlumnos, arrayAlumnos.length+1);
				arrayAlumnos[arrayAlumnos.length-1]=al;
				return arrayAlumnos;
			}
			public static void guardarYSalir( Alumno [] arrayAlumnos) {
				String ruta="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\ejercicio2.txt";
				try(BufferedWriter writer=new BufferedWriter(new FileWriter(ruta, true))){
					Arrays.sort(arrayAlumnos);
					for(Alumno al:arrayAlumnos) {
						String cadena=al.getNombre()+";"+al.getNotaP()+";"+al.getNotaL()+";"+al.getNotaS();
						writer.write(cadena);
						writer.newLine();
					}
				} catch (IOException ex) {
					System.out.println(ex.toString());
				}
			}
			
			
			
			
			
			
			
			
			
			
	
			
			
			
			
			
			
			
		public static void ejercicioR() {
			String ruta="G:\\Otros ordenadores\\Mi portátil\\eclipse\\PROGRAMACION\\casa\\src\\casa2aev\\ejercicio2.txt";
			Alumno [] arrayAlumnos=leerFichero(ruta);
			aniadir(ruta, arrayAlumnos);
			guardar(ruta, arrayAlumnos);
		}
		private static void guardar(String ruta, Alumno[] arrayAlumnos) {
			try(BufferedWriter writer=new BufferedWriter(new FileWriter(ruta, false))){
				for(Alumno al:arrayAlumnos) {
					writer.write(al.getNombre()+";"+al.getNotaP()+";"+al.getNotaL()+";"+al.getNotaS());
					writer.newLine();
				}
				
			} catch (IOException ex) {
				
			}
		}
		private static Alumno [] aniadir(String ruta, Alumno [] arrayAlumnos) {
			try(BufferedWriter writer=new BufferedWriter(new FileWriter(ruta, true))){
				Scanner tec=new Scanner(System.in);
				String nombre=tec.nextLine();
				double n1=tec.nextDouble();
				double n2=tec.nextDouble();
				double n3=tec.nextDouble();
				writer.write(nombre +";"+ n1+";"+ n2+";"+ n3);
				Alumno al=new Alumno(nombre, n1, n2, n3);
				arrayAlumnos=Arrays.copyOf(arrayAlumnos, arrayAlumnos.length+1);
				arrayAlumnos[arrayAlumnos.length-1]=al;
			} catch (IOException ex) {
				
			}
			return arrayAlumnos;
		}
		
		
		
		private static Alumno [] leerFichero(String ruta) {
			String linea="";
			String [] arrayLector;
			String nombre;
			double notaP;
			double notaL; 
			double notaS;
			Alumno [] arrayAlumnos=new Alumno [0];
			try(BufferedReader reader=new BufferedReader(new FileReader(ruta))){
				while((linea=reader.readLine())!=null) {
					arrayLector=linea.split(";");
					nombre=arrayLector[0];
					notaP=Double.parseDouble(arrayLector[1]);
					notaL=Double.parseDouble(arrayLector[2]);
					notaS=Double.parseDouble(arrayLector[3]);
					Alumno al=new Alumno(nombre, notaP, notaL, notaS);
					arrayAlumnos=Arrays.copyOf(arrayAlumnos, arrayAlumnos.length+1);
					arrayAlumnos[arrayAlumnos.length-1]=al;
				}
				
			} catch (FileNotFoundException ex) {
				
			} catch (IOException ex) {
				
			}
			return arrayAlumnos;
		}
		
		
			
}
