package javaStudy;

public class Car {
	// 타입 필드명
	String name;
	int number;
	
	// 기본 생성자 : 매개변수 없이 객체 생성
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음", 0); // 위 두 코드를 한줄로 작성
		System.out.println("Car의 기본 생성자 입니다.");
	}
	
	// 객체 생성 시 값 초기화
	public Car(String name) {
		// 객체 자신을 참조하는 키워드 this
		this.name = name;
	}
	
	// 생성자 오버로딩 : 메소드 오버로딩처럼 여러개의 생성자를 선언할 수 있음
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("Car 의 run 메서드 ㅣ 달리다.");
	}
}
