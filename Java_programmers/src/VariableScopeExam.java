
public class VariableScopeExam {

	int globalScope = 10;
	static int staticVal = 8;
	
	public void scopeTest(int value) {
		int localScope = 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);  �����Ͽ���
//		System.out.println(value); 	         ���Ұ�
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) { 
		// ��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����.
		// static �� ����ϸ� �̽��Ͻ�ȭ ���� �ʾƵ� ����� �� �ִ�.
		
//		System.out.println(globalScope); ���Ұ�
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		
		VariableScopeExam v1 = new VariableScopeExam(); 
		System.out.println(v1.globalScope);
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		v1.staticVal = 50;
		v1.staticVal = 100; // static ���� ���� �ּҸ� ����Ű�Ƿ� 100���� �����
		System.out.println(v1.staticVal); // 100
		System.out.println(v2.staticVal); // 100
		System.out.println(VariableScopeExam.staticVal);
	}

}
