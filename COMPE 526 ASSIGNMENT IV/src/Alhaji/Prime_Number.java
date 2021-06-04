package Alhaji;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int number;
		boolean prime = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the number");
		number = input.nextInt();
		input.close();
		
		// iteration
		
		for (int i=2; i<number; i++) {
			System.out.println ("Iteration: " + i );
			if (number % i ==0) {
				prime = false;
				break;
			}
			
		}
		
		if (number < 1)
			System.out.println("Number need to be greater than 1");
		else if (number == 1)
			System.out.println("1 is neither Prime nor Composite");
		else {
			for (int divisor = 2; divisor <= (number/2); divisor ++ ) {
				prime = false;
				break;
				
			}
		}
		if(prime)
			System.out.printf("%d is a prime", number);
		else 
			System.out.printf("%d is a Composite",number);
		
	}

}
