package javaStudy;

public class Bus extends Car { // 클래스상속받기 extends 부모클래스명   Bus is a Car 상속관계(is a)
	public void ppangppang() {
		System.out.println("빵빵");
	}
	
	public void run() {
		super.run(); // 부모의 run 메서드 실행
		System.out.println("Bus 의  run 메서드");
	}
}

