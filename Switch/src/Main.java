
public class Main {

	public static void main(String[] args) {
		
		// switch = statement that allows a variable to be tested for equality against a list of values
		
		String day = "Friday";
		
		switch(day) {  // 일치하는 항목만 실행됨 break가 없다면 일치하는 항목 이후로 전부 실행됨
			case "Sunday": System.out.println("It is Sunday!");
			break;
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thursday": System.out.println("It is Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It is Saturday!");
			break;
			default: System.out.println("That is not a day!");
		}

	}

}
