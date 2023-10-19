
public class StringExam {

	public static void main(String[] args) {
		
		String str1 = "hello"; // 상수영역에 저장됨
		String str2 = "hello"; // str2 도 str1이 가리키는 hello 주소를 참조함
		// 같은 인스턴스를 참조하고 있음
				
		String str3 = new String("hello"); 
		String str4 = new String("hello");
		// new 연산자를 통해 만들면 참조하지않고 새로운 인스턴스를 힙 영역에 생성함
	
		if(str1 == str2) {
			System.out.println("str1 과 str2 는 같은 레퍼런스 입니다"); // 이것만 출력
		}
		if(str1 == str3) {
			System.out.println("str1 과 str3 는 같은 레퍼런스 입니다");
		}
		if(str3 == str4) {
			System.out.println("str3 과 str4 는 같은 레퍼런스 입니다");
		}
		
		// 한 번 생성된 클래스는 변하지 않음
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.substring(3)); // 인덱스 3번 이후로 자르기
		System.out.println(str1);
	}

}
