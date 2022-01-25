import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteDatas {

	public static void main(String[] args) {
		
		// DATAS SÃO IMUTÁVEIS 
		
		LocalDate hoje = LocalDate.now();
		
		LocalDate aniversario = LocalDate.of(2022, Month.MAY, 19);
		
		Period periodo = Period.between(hoje, aniversario);
		
		// Não altera a variavel 'aniversario', é necessario a criação de uma nova variavel temp
		LocalDate plusYears = aniversario.plusYears(1L);
		
		// CRIANDO PADRÃO DE FORMATAÇÃO DE DATA
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(aniversario);
		System.out.println(plusYears.format(formatador));
		
		//System.out.println(periodo);
		
	}
	
}
