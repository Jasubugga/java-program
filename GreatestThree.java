import java.util.Scanner;
public class GreatestThree
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Three numbers ------");
		System.out.println("1st Number =  ");
		int a = reader.nextInt();
		System.out.println("2nd Number =  ");
		int b = reader.nextInt();
		System.out.println("3rd Number =  ");
		int c = reader.nextInt();
		if (a>b)
		{
			if (a >c)
				{
					System.out.println("Greatest among " + a + ", "  + b + " and " + c + " is " + a);
				}
			else
				{
					System.out.println("Greatest among " + a + ", " + b + " and " + c  + " is " + c);
				}
		}
		else
		{
			if (b > c)
				{
					System.out.println("Greatest among " + a + ", " + b + " and " + c + " is " + b);
				}
			else
				{
					System.out.println("Greatest among " + a + ", " + b + " and " + c + " is " + c);
				}
		}
	}
}
      