package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); // Bus Ŭ������ Car Ŭ������ ��ӹ����Ƿ� Car�� run�޼��� ��밡��
		// overriding 
		// �Ȱ��� �̸��� �޼��尡 �θ� �ڽ�Ŭ������ �Ѵ� �����ϴ°��
		// �ڽ��� �޼��尡 �����
		// �ڽ��� �޼��� �ȿ��� super.�޼���() �� �θ� �޼��嵵 �Բ� �������� �� ����
		bus.ppangppang();

		Car car = new Car();
		car.run();
//		car.ppangppang(); �ڽ� Ŭ������ �޼���� ����� �� ����
		
		Car c = new Bus();
		c.run();
//		c.ppangppang(); �θ� Ÿ������ �ڽ��� ����ų �� ������ �θ� ������ �ִ� �޼��常 ��밡��
		
//  (X) Bus bus = c;  Car Ÿ����  Bus Ÿ���� ����ų ���� ����
		Bus bus2 = (Bus) c;
		bus2.run();
		bus2.ppangppang();
	}

}
