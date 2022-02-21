import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = sc.nextInt();
        System.out.println("enter your number:");
        int number1 = sc.nextInt();
        System.out.println("enter your number:");
        int number2 = sc.nextInt();
        if((number>=number1)&&(number>=number2))
        {
            System.out.println("your number is largest number then:"+ number);
        }
        else if((number1>=number)&&(number1>=number2))
        {
            System.out.println("your number is largest number then:"+ number1);
        }
        else
        {
            System.out.println("your number is largest number then:"+ number2);
        }
    }
}