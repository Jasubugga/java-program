import java.util.Scanner;

public class EvenOdd
{
  public static void main(String argd[])
  {
   System.out.print("Enter the number");
   Scanner reader = new Scanner(System.in);
   int num=reader.nextInt();
   reader.close();
   if(num%2==0)
   {
    System.out.print("Entered number" + num + "is Even number");
   }
   else
   {
   System.out.print("Entered number" + num + "is Odd number");
   }
  }
}