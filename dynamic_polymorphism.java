import java.util.Scanner;

abstract class show
{
  abstract void display();
}
public class dynamic_polymorphism extends show{
	
	void display()
	{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int sum = a + b;
		System.out.println("The sum is " + sum);
		
		
	}
	public static void main(String[] args) {
		dynamic_polymorphism d = new dynamic_polymorphism();
		d.display();

	}

}
