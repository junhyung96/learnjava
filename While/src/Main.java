import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// While loop = executes a block of code as long as a it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		while(name.isEmpty()) {  // java11�̻󿡼� isBlank�� ��
//								 // (str.trim().length() == 0) �ε� �� �� ����
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}
		
		do{  // �̷��Ե� �� �� ����
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isEmpty());
		
		
		System.out.println("Hello "+name);
	}

}
