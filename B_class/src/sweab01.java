import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sweab01 {

	public static void main(String[] args) throws IOException {
		// N�� ��� ��ȣ �� ����
		// N�� 1295��
		// 1295 -> 2590 -> ... ���ڸ� ���µ�
		// 0���� 9���� ��� ���ڸ� ���� ���� �ּ� �� �� ���� �� �����ϱ�?
		// 1 <= N <= 10^6
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int T = Integer.parseInt(br.readLine());
		int total = (1 << 10) -1;
		// ��� ���ڰ� �������� �� ��
		// �ͼ����� ���� ������ �� �� ��ȣ�� ����α� (1 << 10)
		
		// 1���� 9 ������ ��Ʈ����ŷ���� ���صθ� �Ǳ���.. 0��?
		// 0~9 ������ �迭�� ����� 
		// ����� ���ڸ� ���鶧���� ���ڸ��� ������ �ε����� �ش��ϴ� ��� 1�� �ٲ��ֱ�
		// 2������ ����� 111111111(2)�� AND ����
		// 0 �� 10�� �����ϸ� ������ ������ �Ǿ����� 0�� ���� booleanó���ϱ�Ȥ�� 10�ڸ� 2���� �ϸ��
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());


			int visit = 0;
			boolean[] visited = new boolean[10];
			int count = 0;
			
			for (count=1;; count++) {
				char[] arr = String.valueOf(N * count).toCharArray();
				// N*count ���� ���ڿ��� ǥ���� ��
				for (char c :arr) {
					int num = c - '0';
//					visited = visited | (1 << num);
				}
				
			}
			
//			System.out.println("#" + i + " " + N*count);
			
		}
		
		
		
	}

}
