package javaStudy;

public abstract class Bird {     // 메서드가 하나라도 추상인 경우 해당 클래스는 추상클래스여야함
	public abstract void sing(); // 추상메서드 abstract
	public void fly() {
		System.out.println("날다.");
	}
	
}
