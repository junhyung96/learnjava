
public class Operator3 { // 연산자 우선순위

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a-b*c); // -145 
		
		System.out.println(a > 5 && b > 5); // false
		System.out.println(a > 5 || b > 5); // true
		
		System.out.println(++a - 5); // 1
		System.out.println(b-- - 5); // 5
		System.out.println(b); // 9
	}

}
