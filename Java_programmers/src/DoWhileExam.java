import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			//반복할 문장
			value = sc.nextInt();
			System.out.println("입력받은 값 : "+value);
			
		}while(value != 10); // 조건이 만족되면 다시 do로 올라가서 수행함
		
		System.out.println("반복문 종료!!");
	}

}
