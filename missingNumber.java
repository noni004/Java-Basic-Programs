// Program to find missng number in a sorted array 


public class MissingNumber {

	
	
	public static void main(String[] args) {
		int sum = 0;
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,14};
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		int total = (arr.length+1)*(arr.length + 2)/2;
		
		if(total == sum)
		{
			System.out.println("No number is missing");
			
		}
		else
		{
			System.out.println("Missing number : " + (total - sum));
		}
	}
	

}


