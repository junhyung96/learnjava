
public class Main {

	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters
		// 			reference data types have access to useful methods
		
		String name = "Bro";
		
//		boolean result = name.equals("bro");		
//		int result2 = name.length();
//		char result2 = name.charAt(0);
//		int result2 = name.indexOf("o");
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
//		String result = name.trim();  공백제거
		String result = name.replace('o', 'e');
		
		System.out.println(result);
	}

}
