package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int N = Integer.parseInt(br.readLine());

		String bl = " ";
		String star = "*";
		for (int i=0;i<N;i++) {
			for (int j=N-1-i;j>0;j--) bw.write(' ');
			for (int j=1;j<=2*i+1;j++) bw.write('*');
			bw.write('\n');
		}
		for (int i=0;i<N-1;i++) {
			for (int j=1;j<=i+1;j++) bw.write(' ');
			for (int j=2*(N-1-i)-1;j>0;j--) bw.write('*');
			bw.write('\n');
		}
		bw.flush();
	}
}


