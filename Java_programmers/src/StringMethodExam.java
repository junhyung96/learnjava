
public class StringMethodExam {

	public static void main(String[] args) {
		// String str = new String("hello")
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world")); // 문자열 붙이기
		
		str = str.concat(" world"); // 문자열 참조 변경
		System.out.println(str.substring(3)); // 문자열 자르기 3부터 끝까지
		System.out.println(str.substring(3,7)); // 인덱스 3~6까지
	}

}
