package javaStudy;

public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();
		// 객체를 생성할 때 생성자 실행됨
		// Truck 은 Car 를 상속받음
		// 부모가 먼저 생성되야함
		// 기본생성자가 Car부터 실행되고 Truck이 실행됨
		Car c = new Car();
		
		// 생성자 = 객체를 초기화하는일
		// 부모의 생성자를 호출할때 super 키워드를 씀
	}

}
