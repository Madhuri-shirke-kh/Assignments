import java.util.*;
public class disc
{
  public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("You have a mebership yes/no");
	String stringValue=sc.nextLine();
	boolean boolValue = true;
	//String stringValue = "yes";

        
    String boolAsString = Boolean.toString(boolValue);
	System.out.println("Enter purchase Amount:");
	float amt=sc.nextFloat();
	float discount;
	
if(stringValue.equals("yes"))
{	
			if(amt==1000)
			{
		           discount=amt+25-200;
			   System.out.println("20% Discount:"+" "+discount);
			}
			   
		   			   
			if(amt>500 && amt<999)
			{
			  if(amt==500)
			  {
			discount=amt+25-50;
			System.out.println("10% Discount:"+" "+discount);
			  }
			else
			{
			discount=amt+25-99.9f;
			System.out.println("10% Discount:"+" "+discount);
			}
			} 
			if(amt<500)
			{
			discount=amt;
			System.out.println("5% Discount:"+" "+discount);
			}
			
			
	
}	
}
}
