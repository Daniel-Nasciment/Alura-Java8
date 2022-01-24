import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		
		nomes.add("Daniel Nascimento");
		nomes.add("Marco Antonio");
		nomes.add("Beatriz Grigio");
		
		
//		nomes.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				
//				System.out.println(s);
//				
//			}
//		});
		
//		nomes.sort((s1, s2) -> {
//			if(s1.length() < s2.length()) {
//				return -1;
//			}
//			if(s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		
		
		// O MÉTODO INICIADO NA LINHA 28 É EQUIVALENTE A ESSE:
		
		nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// O MÉTODO INICIADO NA LINHA 18 É EQUIVALENTE A ESSE:
		
		// lambda expression funcionam obrigatóriamente se trabalharmos com interfaces funcionais.
		nomes.forEach(s -> System.out.println(s));
		
		
		
	}
	
}
