import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		
		int num;
		int factorial = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = input.nextInt();
		
		if(num <= 0)
		{
			System.out.println("Enter a positive number");
		}
				
		else
		{
			for(int i = 1; i <= num; i++)
			{
				factorial = factorial * i;
			}
			
			System.out.println("Factorial of " + num + " : " + factorial);
			
			
			
			
		}
	}

}
