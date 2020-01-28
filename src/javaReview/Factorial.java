package javaReview;

public class Factorial {

	
	public static void fact1(int number) {
		int fact=1;
		
		for (int i=1;i<=number;i++) {
			fact=fact*i;
			
			
		}
		
		System.out.println(fact);
		
	}
	
public static int fact2(int number) {
		
		if (number<=1)
			
		return 1;
		return number * fact2(number-1);
		
	}
	public static void main(String[] args) {
	
	fact1(1);

	fact1(2);
	fact1(3);
	fact1(4);
	fact1(5);
	
	System.out.println(fact2(1));

	System.out.println(fact2(2));
	System.out.println(fact2(3));
	System.out.println(fact2(4));
	System.out.println(fact2(5));
	 
	}

}
