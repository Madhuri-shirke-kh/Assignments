import java.util.*;
 public class Discount
{
  public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter purchase Amount:");
	float amt=sc.nextFloat();
	
	float discount;
	
	
			if(amt==1000)
			{
		           discount=amt-200;
			   System.out.println("20% Discount:"+" "+discount);
			}
			   
		   			   
			if(amt==500 && amt==999)
			{
			if(amt==500)
			{
			discount=amt-50;
			System.out.println("10% Discount:"+" "+discount);
			}
			else
			{
			discount=amt-99.9f;
			System.out.println("10% Discount:"+" "+discount);
			}
			 } 
			if(amt<500)
			{
			discount=amt-25;
			System.out.println("5% Discount:"+" "+discount);
			}
			
			
	
	
}
}
