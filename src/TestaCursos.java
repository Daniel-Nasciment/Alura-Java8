import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

		// cursos.forEach(c -> System.out.println(c)); // lambda expression
		
		// STREAM NÃO É UMA COLECTION
		// FAZER ALTERAÇÕES EM UM STREAM NÃO ALTERA A COLEÇÃO ORIGINAL
		
//		cursos = cursos.stream()
//		.filter(c -> c.getAlunos() > 20)
//		.collect(Collectors.toList());
		
//		cursos.stream()
//		.filter(c -> c.getAlunos() > 20)
//		.collect(Collectors.toMap(
//				c -> c.getNome(),
//				c -> c.getAlunos()
//				))
//		.forEach((nome, alunos) -> System.out.println("Nome curso: " + nome + " tem " + alunos + " alunos."));
//		
		
		
		//System.out.println(cursos);
		
		//cursos.forEach(c -> System.out.println(c));
		
		BigDecimal valor = BigDecimal.valueOf(300.0).multiply(new BigDecimal("0.1"));
		
		// 	SE valor > COMPARETO = 1
		//  SE valor < COMPARETO = -1
		// 	SE valor = COMPARETO = 0
		if (valor.compareTo(new BigDecimal("30")) > 0) {
			System.out.println("É maior");
		}
		

	}

}
