import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = sc.nextInt();
        if(number>=10)
        {
            System.out.println("the square of the number is:"+ number*number);
        }
        else
        {
            System.out.println("the cube of the number is:"+ number*number*number);
        }
    }
}