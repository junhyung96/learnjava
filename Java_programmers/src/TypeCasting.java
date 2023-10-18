
public class TypeCasting {
	
	public static void main(String[] args) {
		int x = 50000;
		long y = x; // 묵시적 형변환
		
		long x2 = 5;
//		int y2 = x2; Type mismatch: cannot convert from long to int
		int y2 = (int) x2; // 강제 형변환
	}
}
