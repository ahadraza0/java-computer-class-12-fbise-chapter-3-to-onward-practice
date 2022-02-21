import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your temperature in fahrenheit:");
        float temperature = sc.nextInt();
        float celsius = 5/9*(temperature-32);
        System.out.println("fahrenheit convert into celsius"+ celsius);
    }
}