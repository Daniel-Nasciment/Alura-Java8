import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		Curso c1 = new Curso("Java8", 10);
		Curso c2 = new Curso("HTML", 20);
		Curso c3 = new Curso("C#", 30);
		Curso c4 = new Curso("Angular", 50);

		cursos.add(c4);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c1);

		cursos.sort(Comparator.comparing(Curso::getAlunos)); // method reference

		cursos.forEach(c -> System.out.println(c)); // lambda expression
		
		// STREAM N�O � UMA COLECTION
		// FAZER ALTERA��ES EM UM STREAM N�O ALTERA A COLE��O ORIGINAL
		
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() > 20)
		.mapToInt(Curso::getAlunos)
		.sum();
		
		System.out.println(sum);
		
		cursos.forEach(c -> System.out.println(c));

	}

}
