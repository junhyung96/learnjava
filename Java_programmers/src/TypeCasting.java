
public class TypeCasting {
	
	public static void main(String[] args) {
		int x = 50000;
		long y = x; // ������ ����ȯ
		
		long x2 = 5;
//		int y2 = x2; Type mismatch: cannot convert from long to int
		int y2 = (int) x2; // ���� ����ȯ
	}
}
