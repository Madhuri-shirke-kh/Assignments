import java.util.*;
public class Calc
{
  public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter choice");
	int c=sc.nextInt();
	System.out.println("Enter number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	int result;
	switch(c)
	{
		case 1:result=a+b;
			System.out.println("Addition is:"+" "+result);
			break;
		case 2:result=a-b;
			System.out.println("Subtraction is:"+" "+result);
			break;
		case 3:result=a*b;
			System.out.println("Multiplication is:"+" "+result);
			break;
		case 4:result=a/b;
			System.out.println("Division is:"+" "+result);
			break;
		case 5:result=a%b;
			System.out.println("Modulous is:"+" "+result);
			break;


		default:System.out.println("case not match");
			break;
	}
	}
}