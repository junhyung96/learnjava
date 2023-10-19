
public class Switch {

	public static void main(String[] args) {
		// switch, case, default, break
		
		int value = 7;
		switch(value) { 
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
			case 5:
				System.out.println("4, 5");
				break;
			case 6: case 7:
				System.out.println("6, 7");
				break;
			default:
				System.out.println("그 외의 숫자");
			// case 특징 만난 케이스 이후로 전부 수행
			// break로 끊어주면 개별로 실행가능
				
				
		}

	}

}
