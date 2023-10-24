package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); // Bus 클래스는 Car 클래스를 상속받으므로 Car의 run메서드 사용가능
		// overriding 
		// 똑같은 이름의 메서드가 부모 자식클래스에 둘다 존재하는경우
		// 자식의 메서드가 실행됨
		// 자식의 메서드 안에서 super.메서드() 로 부모 메서드도 함께 실행해줄 수 있음
		bus.ppangppang();

		Car car = new Car();
		car.run();
//		car.ppangppang(); 자식 클래스의 메서드는 사용할 수 없음
		
		Car c = new Bus();
		c.run();
//		c.ppangppang(); 부모 타입으로 자식을 가리킬 수 있지만 부모가 가지고 있는 메서드만 사용가능
		
//  (X) Bus bus = c;  Car 타입이  Bus 타입을 가리킬 수는 없음
		Bus bus2 = (Bus) c;
		bus2.run();
		bus2.ppangppang();
	}

}
