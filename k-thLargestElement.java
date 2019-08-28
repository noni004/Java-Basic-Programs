// Program to Find kth Largest and Smallest Element in Array

import java.util.Scanner;
public class secondLargest {

	
	public static void largest(int arr[] ,int size,int k)
	{
		int temp;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == k - 1)
			{
				System.out.println(arr[i] + " is the " + k + "th largest element of the array");
				break;
			}
		}
	
	}
	
	public static void main(String[] args) {
		
		int size;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		size = input.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the value of 'K' to find the Kth largest element ");
		int k = input.nextInt();
		
		largest(arr,size,k);
	}

}
