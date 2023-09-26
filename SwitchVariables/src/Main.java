
public class Main {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "Kool-Aid";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: "+x); // x: Kool-Aid 
		System.out.println("y: "+y); // y: water
		
	}

}
