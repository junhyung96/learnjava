
public class StringMethodExam {

	public static void main(String[] args) {
		// String str = new String("hello")
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world")); // ���ڿ� ���̱�
		
		str = str.concat(" world"); // ���ڿ� ���� ����
		System.out.println(str.substring(3)); // ���ڿ� �ڸ��� 3���� ������
		System.out.println(str.substring(3,7)); // �ε��� 3~6����
	}

}
