
// Program to Find Second Largest Number in an Array

import java.util.Scanner;
public class secondLargest {

	
	public static void second(int arr[] ,int size)
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
			if(i == 1)
			{
				break;
			}
		}
		
		System.out.println("Second largest element of the array : " + arr[1]);
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
		
		
		second(arr,size);
	}

}
