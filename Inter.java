

import java.util.Scanner;

interface intr {
	public void add_element_of_array(int [] arr);
}
    class Inter implements intr
	{
		@Override
		public void add_element_of_array(int [] arr)
		{
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
			{
				sum = sum + arr[i];
			}
			System.out.println("The sum of given elements of array is " + sum);
		}
			
	
public static void main(String [] args)
{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [] arr = new int [n];
	for(int i = 0; i < n; i++)
	{
		arr[i] = scn.nextInt();
		
	}
	
	Inter i = new Inter();
	i.add_element_of_array(arr);
}
}
