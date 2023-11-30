import java.util.Scanner;

public class Readinput
{
    public static void main(String args[])
     {
       System.out.println("\nEnter a number = ");
       Scanner reader = new Scanner(System.in);
       int num = reader.nextInt();
       System.out.println("\nEntered no is" +num);
     }
}