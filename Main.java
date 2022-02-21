/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a = sc.nextInt();
				System.out.println("enter the value of b");
		int b = sc.nextInt();
				System.out.println("enter the value of c");
		int c = sc.nextInt();
				System.out.println("enter the value of d");
		int d = sc.nextInt();
		int sum = a+b+c+d;
		int product = a*b*c*d;
		float divide = a/b/c/d;
		int sub = a-b-c-d;
		System.out.println("the sum of two value is:"+ sum);
		System.out.println("the sub of two value is:"+ sub);
		System.out.println("the product of two value is:"+ product);
		System.out.println("the divide of two value is:"+ divide);
	}
}
