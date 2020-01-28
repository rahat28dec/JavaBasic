package javaReview;

public class FizzBuzz {

	
	public static void fizzBuz(int number1,int number2,int number) {
		
		for(int i=1;i<=number;i++) {
			
			if (i%number1==0 && i%number2==0) {
				
				System.out.println(i +" is fizzbuzz");
			}
			
			else if (i%number1==0) {
				
				System.out.println(i +" is fizz");
			}
			else if  (i%number2==0) {
				
				System.out.println(i +" is buzz");
			}
			else {
			
					
					System.out.println(i);
				}
			}
		}
	
	public static void main(String[] args) {
		
fizzBuz(3,4,50);
	}

}
