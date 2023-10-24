package javaStudy;

public class Truck extends Car {
	public Truck() {
		// super(); 안써도 자동으로 내부적으로 super를 생성함
		// 그럼에도 알아야 하는 이유
		// 부모 클래스가 기본 생성자를 가지지 않은 경우 직접 호출하기 위해
		// 만약 기본생성자 없이 문자열을 받는다면
		// super("소방차") 이런식으로 호출함
 		System.out.println("Truck의 기본 생성자 입니다.");
	}
}
