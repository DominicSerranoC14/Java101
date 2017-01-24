
public class Variable101 extends App {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = a + b;
		// convert int to float
		float d = c;
		// must use f when declaring a float
		float e = 5.5f;
		// adding two floats
		float f = d + e;
		// convert float to int
		int g = (int)f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		// Printing unicode chars
		System.out.println('\uAAAA');
		System.out.println('\uBBBB');
		System.out.println('\uCCCC');
		System.out.println('\uDDDD');
		System.out.println('\uEEEE');
		System.out.println('\uFFFF');
		

	}

}
