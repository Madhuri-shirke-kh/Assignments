import java.util.*;
public class Factorial
{
	public static void main(String[] args)
	{
		int f,fact=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			f=n*(n-1);
			fact=fact+f;
		}
		System.out.println("Factorial of given number:"+" "+fact);
	}
}