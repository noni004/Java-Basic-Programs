// Program for Finding Max and Min in a single Scan

import java.util.Scanner;

public class minMax2 {

	
	public static void maxMin(int arr[] , int size)
	{
		int min = arr[0];
		
    int max = arr[0];
		
    for(int i = 0; i < size; i++)
		{
			
      if(arr[i] > max)
			{
				max = arr[i];
			}
			else
			{
				min = arr[i];
			}
		}
		
		System.out.println("Smallest element = " + min);
		
    System.out.println("Largest element = " + max);
		
	}
	
	
	public static void main(String[] args) {
		
		int size;
		
    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		size = input.nextInt();
		
		int arr [] = new int [size];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
		
		maxMin(arr,size);
	}

}
