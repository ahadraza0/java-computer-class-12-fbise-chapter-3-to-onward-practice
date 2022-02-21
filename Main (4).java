import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = sc.nextInt();
        if(number>=0)
        {
            System.out.println("your number is even:"+ number);
        }
        else
        {
            System.out.println("your number is odd:"+ number);
        }
    }
}