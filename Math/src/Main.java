import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
//		
//		double z0 = Math.max(x, y); // �ִ밪 3.14		
//		double z1 = Math.min(x, y); // �ּҰ� -10.0
//		double z2 = Math.abs(y);    // ���밪 10.0
//		double z3 = Math.sqrt(x);   // ��Ʈ 1.772004514666935
//		double z4 = Math.sqrt(y);   // NaN
//		double z5 = Math.round(x);  // �ݿø� 3.0 
//		double z6 = Math.ceil(x);   // �ø� 4.0
//		double z7 = Math.floor(x);  // ���� 3.0
//		
//		System.out.println(z5); 
//		
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
	    y = scanner.nextDouble();
	    
	    z = Math.sqrt((x*x)+(y*y));
	    
	    System.out.println("The hypotenuse is : "+z);
	    
	    scanner.close();
	}

}
