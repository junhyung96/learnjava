import java.util.Random;

public class Main2 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		int x = random.nextInt(6)+1; // 1~6 랜덤  (6)으로 하면 0부터 세기 떄문에 0~5이므로 1을 더해줌
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(z);
		
		
	}
}
