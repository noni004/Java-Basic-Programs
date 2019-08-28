// Program to Find Maximum and Minimum values in an Array



import java.util.Scanner;

public class MaxMin {
	
	public static void max(int arr[],int size)
	{
	  int max = arr[0];
		
    for(int i = 1; i < size; i++)
		{
		
    if(arr[i] > max)
			{
				
        max = arr[i];
			
      }
		
    }
		System.out.println("Largest element of array: " + max);
		
	}
	
	public static void min(int arr[], int size)
	
  {
		
    int min = arr[0];
		
    for(int i = 1; i < size; i++)
		{
			
      if(arr[i] < min)
			{
				
        min = arr[i];
			
      }
		
    }
		
    System.out.println("Smallest element of array: " + min);
	
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
		
		System.out.println("Press 1 to get the Smallest element");
		
    System.out.println("Press 2 to get the largest element");
		
    System.out.println("Press 3 to get the both samallest and largest elements");
		
    int choice;
		
		choice = input.nextInt();
		
		if(choice == 1)
		{
			
      min(arr, size);
		
    }
		
    else if(choice == 2)
		{
			
      max(arr ,size);
		
    }
		else if(choice == 3)
		{
			
      min(arr, size);
			
      max(arr ,size);
		
    }
		else
		{
			
      System.out.println("Invalid choice");
		
    }
		
	}

}
