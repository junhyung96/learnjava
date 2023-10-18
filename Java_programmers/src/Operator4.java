
public class Operator4 { // 논리 연산자

	public static void main(String[] args) {
		 // %% 논리곱, || 논리합, ! 부정, ^ 베타적논리합 
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		int score = 88;
		if (score <= 100 && score >= 70) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3);
		System.out.println(b2 ^ b3);
		
		System.out.println(!b1);
	}

}
