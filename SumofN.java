import java.util.*;
public class SumofN
{
	public static void main(String[] args)
	{	int sum=0;
		System.out.println("Enter 50 numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<50;i++)
		{
			int num=sc.nextInt();
			sum=sum+num;
			System.out.println("sum"+" "+sum);
		}
	}
}