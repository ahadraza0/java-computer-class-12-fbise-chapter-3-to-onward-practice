import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of length:");
        int length = sc.nextInt();
        System.out.println("enter the value of breadth");
        int breadth = sc.nextInt();
        float area_of_rectangle = length*breadth;
        System.out.println("the area of rectangle:"+ area_of_rectangle);
    }
}