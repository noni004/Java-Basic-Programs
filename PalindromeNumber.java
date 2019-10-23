// Program to check if a number is palindrome or not

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		
		int num,rem,rev = 0;
		
    		System.out.println("Enter a Number");
		
		Scanner input = new Scanner(System.in);
		
		num = input.nextInt();
		
		int temp = num;
		
		while(temp != 0)
		{
			rem = temp % 10;
			
      			rev = rev * 10 + rem;
			
      			temp = temp / 10;
			
		}
		
    		if(num == rev)
		
    		{
			
      			System.out.println( num +" is a Palindrome Number");
		
    		}
		else
		{
			System.out.println( num +" is not a Palindrome Number");
			
		}
		
	}

}
