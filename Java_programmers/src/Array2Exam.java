
public class Array2Exam { // 2차원 배열

	public static void main(String[] args) {
		int[][] array2d = new int[3][4];
		array2d[0][0] = 10;
		
		int[][] array2d2 = new int[3][];
		array2d2[0] = new int[1];
		array2d2[1] = new int[2];
		array2d2[2] = new int[3];
		array2d2[0][0] = 10;
		
		int[][] array2d3 = {{1}, {1,2}, {1,2,3}};
		
		System.out.println(array2d3[0][0]);
		System.out.println(array2d3[2][2]);
	}

}
