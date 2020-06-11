import java.util.Scanner;
abstract class Car
{
	abstract void drive();

}
class Honda extends Car
{
	void drive ()
	{
		System.out.println("Honda Stars");
	}
}
class Lamborghini extends Car
{
	void drive()
	{
		System.out.println("lamborghini starts");
	}
}

class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("your choice  for honda --> 1 & for Lamborghini --> 2 ");
		System.out.println("*** To exit press anything more than choice *** ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if (a==1)
		{
		Car c1=new Honda();
		c1.drive();
		}
		else if(a==2)
		{
		Car c2=new Lamborghini();
		c2.drive();
		}
		else
		System.out.println("Thank you for visiting");
	}
}
