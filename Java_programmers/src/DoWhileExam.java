import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			//�ݺ��� ����
			value = sc.nextInt();
			System.out.println("�Է¹��� �� : "+value);
			
		}while(value != 10); // ������ �����Ǹ� �ٽ� do�� �ö󰡼� ������
		
		System.out.println("�ݺ��� ����!!");
	}

}
