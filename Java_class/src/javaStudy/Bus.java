package javaStudy;

public class Bus extends Car { // Ŭ������ӹޱ� extends �θ�Ŭ������   Bus is a Car ��Ӱ���(is a)
	public void ppangppang() {
		System.out.println("����");
	}
	
	public void run() {
		super.run(); // �θ��� run �޼��� ����
		System.out.println("Bus ��  run �޼���");
	}
}

