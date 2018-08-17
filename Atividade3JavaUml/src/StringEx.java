
public class StringEx {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String string = "";
		int z = 0;
		for (int i = 0; i < 12; i++) {
			z++;
			string += "string";			
			System.out.println(string.hashCode());
			System.out.println(string);
		}
		
		StringBuffer sb = new StringBuffer();
		z = 0;
		for (int i = 0; i < 12; i++) {
			z++;
			sb.append("sb");			
			System.out.println(sb.hashCode());
			System.out.println(sb);
		}

	}

}
