import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt(); // nextInt 는 입력하면 \n 이 scanner에 남아있음
		scanner.nextLine(); // scanner에 남아있는 \n을 없애기 위해 nextLine 사용
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);
	}

}
