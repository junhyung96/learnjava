
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
//		System.out.println(localScope);  컴파일에러
//		System.out.println(value); 	         사용불가
		System.out.println(value2);
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) { 
		// 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.
		// static 을 사용하면 이스턴스화 하지 않아도 사용할 수 있다.
		
//		System.out.println(globalScope); 사용불가
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
		v1.staticVal = 100; // static 값은 같은 주소를 가리키므로 100으로 저장됨
		System.out.println(v1.staticVal); // 100
		System.out.println(v2.staticVal); // 100
		System.out.println(VariableScopeExam.staticVal);
	}

}
