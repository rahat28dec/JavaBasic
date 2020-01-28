package javaReview;

public class Prime {
	
	public static void checkPrime(int number) {
		
	for (int i=2;i<=number;i++) {
	boolean isPrime= true;
	for(int j=2;j<i;j++) {
	if (i%j==0) { 
	isPrime=false;
    break;
  }
}
	if (isPrime) {
	System.out.println(i+ "  prime");
   }
	else { 
	//System.out.println(i+ " not prime");
  }
 }
			
}
		
		
public static void checkOneNumberAsPrime(int number)	{
	
	boolean isPrime=true;
	if (number<=1)
		isPrime=false;
	
	for (int i=2;i<number;i++)
		if(number%i==0)
		isPrime=false;
	
	if (isPrime)
		System.out.println(number + " Is prime");
	else
		System.out.println(number + " not prime");
}
		

	
	
	public static void main(String[] args) {

		//checkPrime(25);
		checkOneNumberAsPrime(2);

	}

}
