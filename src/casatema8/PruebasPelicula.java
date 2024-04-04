package casatema8;

import casatema8.Pelicula.Genero;

public class PruebasPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1=new Pelicula ("Toy Story", "John Lassetter", 81, Genero.aventura);
		Pelicula p2=new Pelicula ("Saw", "James Wan", 111, Genero.terror);
		Pelicula p3=new Pelicula ("En busca arca perdida", "George lucas", 115, Genero.accion);
		
		Pelicula [] arrayP= {p1,p2,p3};
		
		for(Pelicula a:arrayP) {
			System.out.println(a);
		}
	}

}
