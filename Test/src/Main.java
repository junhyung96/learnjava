import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int iArr[] = { 1, 3, 5, 7, 9 }; 
		System.out.println(Arrays.toString(iArr));
	
		int[][] iArr2 = {
				{ 0, 13, 5, 2 },
				{ 1, 3, 5, 7, 9 }
		}; 
		System.out.println(Arrays.deepToString(iArr2));
		
		int x = 10;
		x = ++x - x++;
		System.out.println(x);
		
		int y = 9;
		y %= 2;
		System.out.println(y);
				
	}
}
