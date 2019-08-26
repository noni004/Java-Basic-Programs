import java.util.Scanner;
public class sumAvg {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		double avg;
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		if(num < 0)
		{
			System.out.println("Enter a positive number");
			
		}
		else
		{
			
			for(int i = 0; i <= num; i++)
			{
				sum += i;
				
			}
			
			System.out.println("Sum of " + num + " numbers : " + sum);
			avg = (double)sum/num;
			System.out.println("Average of " + num + " numbers : " + avg);
		
			
			
		}
	}

}
