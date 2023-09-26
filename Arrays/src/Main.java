
public class Main {

	public static void main(String[] args) {

		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro", "Corvette", "Tesla"};
		
		cars[0] = "Mustang";
				
		for(int i=0;i<3;i++) {
//		System.out.println(cars[i]);
		}
		
		String[] cars2 = new String[3];
		
		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";
		
//		System.out.println(cars2); // [Ljava.lang.String;@2a139a55
		
		for(int i=0; i<cars.length; i++) {
//			System.out.println(cars[i]);
		}
			
		//-----------------------------------------------------------------
			
		// 2d arrays = an array of arrays
			
		String[][] cars3 = new String[3][3];
		
		cars3[0][0] = "K3";
		cars3[0][1] = "K5";
		cars3[0][2] = "K7";
		cars3[1][0] = "cayman";
		cars3[1][1] = "cayen";
		cars3[1][2] = "boxter";
		cars3[2][0] = "Macan";
		cars3[2][1] = "carrera";
		cars3[2][2] = "panamera";

		for(int i=0; i<cars3.length; i++) {
			System.out.println();
			for(int j=0; j<cars3[i].length; j++) {
				System.out.print(cars3[i][j]+" ");
			}
		}
		String[][] cars4 = {
				{"K3", "K3", "K3"},
				{"K3", "K3", "K3"}, 
				{"K3", "K3", "K3"}
				};

		for(int i=0; i<cars4.length; i++) {
			System.out.println();
			for(int j=0; j<cars4[i].length; j++) {
				System.out.print(cars4[i][j]+" ");
			}
		}
		
		
		
		//--------------------------------------------------------------------
	}

}
