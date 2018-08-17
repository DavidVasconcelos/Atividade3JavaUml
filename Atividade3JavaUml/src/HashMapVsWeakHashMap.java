import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVsWeakHashMap {
	
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();

		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			hashMap.put(i, new String() + i);
		}

		LocalDateTime fim = LocalDateTime.now();

		long tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do HashMap = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		hashMap.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de busca do HashMap = " + tempoDeExecucao);

		inicio = LocalDateTime.now();

		for (int i = 1; i < 1000000; i++) {
			weakHashMap.put(i, new String() + i);
		}
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);

		System.out.println("Tempo de inserção do WeakHashMap = " + tempoDeExecucao);
		
		inicio = LocalDateTime.now();

		weakHashMap.get(500000);
		
		fim = LocalDateTime.now();
		
		tempoDeExecucao = ChronoUnit.MILLIS.between(inicio, fim);
		
		System.out.println("Tempo de busca do WeakHashMap = " + tempoDeExecucao);	

	}


}
