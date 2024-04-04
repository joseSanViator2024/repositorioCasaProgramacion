package casa2aev;

import java.util.Comparator;

public class ComparadorNotaL implements Comparator <Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return Double.compare(a1.getNotaL(), a2.getNotaL());
	}

}
