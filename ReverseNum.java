// Program to Reverse a Number.

import java.util.Scanner;

public class revNum {

	public static void main(String[] args) {
		
		int num,rem,rev = 0;
		
    System.out.println("Enter a Number");
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		while(num != 0)
		{
			
      rem = num % 10;
			
      rev = rev * 10 + rem;
			
      num = num / 10;
			
		}
		
		System.out.println("Reverse of " + " : " + rev);
		
	}

}
