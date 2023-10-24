package javaStudy;

public class MyClass2 {
	// 매개변수의 개수나 타입이 다르지만 비슷한 기능인경우 구별하기 힘듬
	// 동일한 이름으로 메소드를 여러개 정의할 수 있다 
	// -> 메소드 오버로딩 : 이름은 같지만 매개변수가 다른 메소드
	public int plus (int x, int y) {
		return x + y;
	}
	public int plus (int x, int y, int z) {
		return x + y + z;
	}
	public String plus (String x, String y) {
		return x + y;
	}
	
}
