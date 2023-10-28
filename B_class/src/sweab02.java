import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sweab02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int lastNBit = (1 << (N)) -1; 
			// 111...1 (모든 비트가 1인 길이 N인 2진수)
			if (lastNBit == (M & lastNBit)) {
				System.out.println("#" + i + " " + "ON");
			} else {
				System.out.println("#" + i + " " + "ON");
			}
		}
	}
		
}
