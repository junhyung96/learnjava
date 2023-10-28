import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sweab01 {

	public static void main(String[] args) throws IOException {
		// N의 배수 번호 양 세기
		// N이 1295면
		// 1295 -> 2590 -> ... 숫자를 세는데
		// 0부터 9까지 모든 숫자를 보는 것은 최소 몇 번 양을 센 시점일까?
		// 1 <= N <= 10^6
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int T = Integer.parseInt(br.readLine());
		int total = (1 << 10) -1;
		// 모든 숫자가 등장했을 때 값
		// 익숙하지 않은 연산을 할 때 괄호로 묶어두기 (1 << 10)
		
		// 1부터 9 까지는 비트마스킹으로 더해두면 되긴함.. 0은?
		// 0~9 까지의 배열을 만들고 
		// 배수인 숫자를 만들때마다 각자리의 숫자의 인덱스에 해당하는 요소 1로 바꿔주기
		// 2진수로 만들고 111111111(2)와 AND 연산
		// 0 은 10번 연산하면 무조건 나오게 되어있음 0은 따로 boolean처리하기혹은 10자리 2진수 하면됨
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());


			int visit = 0;
			boolean[] visited = new boolean[10];
			int count = 0;
			
			for (count=1;; count++) {
				char[] arr = String.valueOf(N * count).toCharArray();
				// N*count 값을 문자열로 표현한 것
				for (char c :arr) {
					int num = c - '0';
//					visited = visited | (1 << num);
				}
				
			}
			
//			System.out.println("#" + i + " " + N*count);
			
		}
		
		
		
	}

}
