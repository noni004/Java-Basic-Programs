// String class to check for equal,reverse,change case and trim.

import java.util.Scanner;
public class class_string {

	public void string_equal(String s1,String s2)
	{
		int flag = 0;
		int x = s2.length();
		for(int i = 0; i < x; i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
			{
				flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		if(flag == 1)
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
			
		}
	}
	
	
	public void string_reverse(String s)
	{
		char arr[] = s.toCharArray();
		for(int i = arr.length - 1; i >= 0; i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
	
	
	public void string_change_case(String s)
	{
		System.out.println("Upper Case " + s.toUpperCase());
	}
	
	public void string_trim(String s)
	{
		System.out.println("Trimmed Stentence " + s.trim());
	}
	
	public static void main(String[] args)
	{
		
		class_string s = new class_string();
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1 = ip.next();
		String s2 = ip.next();
		s.string_equal(s1, s2);
		System.out.println("\n");
		char [] n = new char[10];
		String input = ip.next();
		s.string_reverse(input);
		s.string_change_case(input);
		s.string_trim(input);
		
	}
	
}
