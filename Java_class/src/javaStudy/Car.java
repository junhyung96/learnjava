package javaStudy;

public class Car {
	// Ÿ�� �ʵ��
	String name;
	int number;
	
	// �⺻ ������ : �Ű����� ���� ��ü ����
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����", 0); // �� �� �ڵ带 ���ٷ� �ۼ�
		System.out.println("Car�� �⺻ ������ �Դϴ�.");
	}
	
	// ��ü ���� �� �� �ʱ�ȭ
	public Car(String name) {
		// ��ü �ڽ��� �����ϴ� Ű���� this
		this.name = name;
	}
	
	// ������ �����ε� : �޼ҵ� �����ε�ó�� �������� �����ڸ� ������ �� ����
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("Car �� run �޼��� �� �޸���.");
	}
}
