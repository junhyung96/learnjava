import java.util.Random;

public class Main2 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		int x = random.nextInt(6)+1; // 1~6 ����  (6)���� �ϸ� 0���� ���� ������ 0~5�̹Ƿ� 1�� ������
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(z);
		
		
	}
}
