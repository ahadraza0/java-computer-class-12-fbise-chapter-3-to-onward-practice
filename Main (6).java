import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        char ch = sc.next().charAt(0);
        if((ch>='a')&&(ch<='z'))
        {
            System.out.println("your Character is in lowercase");
        }
        else if((ch>='A')&&(ch<='Z'))
        {
            System.out.println("your Character is in uppercase");
        }
        else
        {
            System.out.println("Invalid Character");
        }
    }
}