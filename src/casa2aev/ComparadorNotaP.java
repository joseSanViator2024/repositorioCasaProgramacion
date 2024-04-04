package casa2aev;

import java.util.Comparator;

public class ComparadorNotaP implements Comparator <Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return Double.compare(a1.getNotaP(), a2.getNotaP());//
	}

}
