import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Stack;

public class StackVsHashSet {
	
	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		HashSet<String> hash = new HashSet<>();

		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			stack.add(new String() + i);
		}

		LocalDateTime fim = LocalDateTime.now();

		long tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do Stack = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		stack.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de busca do Stack = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			hash.add(new String() + i);
		}
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do HashSet = " + tempoDeExecucao);
		
		inicio = LocalDateTime.now();

		hash.contains("500000");
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("Tempo de busca do HashSet = " + tempoDeExecucao);	

	}


}
