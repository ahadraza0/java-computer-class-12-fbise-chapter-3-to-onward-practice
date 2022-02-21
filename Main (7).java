import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int ch = sc.nextInt();
        System.out.println("the integer and print its multiplicative ");
        for(int i=1;i<=20;i++)
        {
            System.out.println(ch+("*")+i+("=")+ch*i);
        }
    }
}