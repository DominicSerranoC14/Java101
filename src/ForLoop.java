
public class ForLoop {

	public static void main(String[] args) {
		
		// simple for loop
		//for (int i = 1; i<=10; i++) {
		//	System.out.println(i);
		//}
		
		// for each loop, used for arrays and collections
		//int arr[] = { 1,2,3,4,5 };
		
		//for ( int i: arr ) {
		//	System.out.println(i);
		//}
		
		// labeled for loop
//		aa:
//			for ( int i = 1; i <= 5; i++ ) {
//				
//				bb: 
//					for ( int j = 5; j >= 1; j-- ) {
//						System.out.println( i + " " + j );
//						
//						if (i == j) {
//							// able to reference the first for loop
//							// then break the loop
//							System.out.println("It's a match!");
//							//break aa;
//						};
//					};
//			};
			
		
		// continue statement	
		// will only sysout even numbers		
		for ( int i = 1; i <= 20; i++ ) {
			if (i % 2 == 1) {
				continue; 
			} else {
				System.out.println(i);
			}
		};
		
	};
		
}
