package javaReview;

public class fibonacci {

	public static void main(String[] args) {
		
		for (int i=0;i<=10;i++) {
		System.out.print(fiba(i)+ " ");
		
		
		}
		System.out.println();
		int first=0; int second=1;int fib = 1;
		
		for (int i=0;i< 10;i++) {
			
			fib= first + second;
			first=second;
			second=fib;
			
			System.out.print(fib+ " ");			
		}

	}
	
	public static int fiba(int number) {
		
		
		if (number==0) {
			return 0;
		}
		
		else if (number==1||number==2) {
			
			return 1;
		}
		else {
			return fiba(number -1)+fiba(number -2);
		}
	}

}
