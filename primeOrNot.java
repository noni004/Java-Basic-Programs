import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		boolean isPrime = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = input.nextInt();
		
		if(num <= 0)
		{
			System.out.println("Enter a positive number");
		}
		
		else
		{
			if(num == 1)
			{
				System.out.println("1 is not a prime number");
			}
			else
			{
				int temp;
				for(int i = 2; i <= num/2; i++)
				{
					temp = num % i;
					if(temp == 0)
					{
						isPrime = false;
					}
					
				}
				if(isPrime)
				{
					System.out.println(num + " is a prime number");
				}
				else
				{
					System.out.println(num + " is not a prime number");
				}
			}
		}
		

	}

}
