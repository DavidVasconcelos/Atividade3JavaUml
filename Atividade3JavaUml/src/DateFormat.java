import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	
	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.of(2012, 9, 10, 12, 0);
		System.out.println(agora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		System.out.println(agora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getYear());
		System.out.println(agora.format(DateTimeFormatter.ofPattern("G")));
	}

}
