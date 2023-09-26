import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// While loop = executes a block of code as long as a it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		while(name.isEmpty()) {  // java11이상에선 isBlank가 됨
//								 // (str.trim().length() == 0) 로도 쓸 수 있음
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}
		
		do{  // 이렇게도 쓸 수 있음
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isEmpty());
		
		
		System.out.println("Hello "+name);
	}

}
