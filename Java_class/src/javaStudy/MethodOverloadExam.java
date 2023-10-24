package javaStudy;

public class MethodOverloadExam {

	public static void main(String[] args) {
		// 클래스 변수 m
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(4, 5));
		
		System.out.println(m.plus(4, 5, 6));
		
		System.out.println(m.plus("Hello", "World"));
	}

}
