import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<>();
		LinkedList<String> linked = new LinkedList<>();

		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			array.add(new String() + i);
		}

		LocalDateTime fim = LocalDateTime.now();

		long tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do ArrayList = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		array.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de busca do ArrayList = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			linked.add(new String() + i);
		}
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do LinkedList = " + tempoDeExecucao);
		
		inicio = LocalDateTime.now();

		linked.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("Tempo de busca do LinkedList = " + tempoDeExecucao);	

	}


}
