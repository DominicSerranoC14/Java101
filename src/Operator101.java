
public class Operator101 {

	public static void main(String[] args) {
	
		// local variable
		int a = 10;
		
		// unary operator
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);

		// arithmetic operators
		System.out.println(a + a);
		System.out.println(a - a);
		System.out.println(a * a);
		System.out.println(a / a);
		System.out.println(a % a);
		
		// arithmetic expression
		System.out.println(a+a-a*a/a);
		
		// left shift
		System.out.println(a<<2); // 10 * 2^2 = 10 * 4 = 40
		
		// right shift 
		System.out.println(a>>2); // 10 / 2^2 = 10 / 2 = 2
		
		// logical and bitwise && / &
		int b = 5;
		int c = 20;
		
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked
		
		// logical and bitwise || / |
		
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  
		
		// ternary
		int d = (b < c) ? b : c;
		
		System.out.println(d);
		
		// adding short
		short e = 10;
		short f = 10;
		e = (short)(e + f);
		
		System.out.println(e);
		
		
	}

}
