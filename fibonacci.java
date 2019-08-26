import java.util.Scanner ;

public class fibonacci {

	public static void main(String[] args) {
		
		
		int num , first = 0 , second = 1 , third ;
		
		System.out.println( " Enter the number of terms " ) ;
		
		Scanner input = new Scanner(System.in) ;
		
		num = input.nextInt() ;
		
		if(num <= 0)
		{
			System.out.println( " Enter a positive number " ) ;
		}
		
		else
		{
			System.out.print( first + " , " + second ) ;
			
			for(int i = 2 ; i < num ; i++ )
			{	
				third = first + second ;
				
				System.out.print( " , " + third ) ;
				
				first = second ;
				
				second = third ;
				
			}
		}
	}
}
