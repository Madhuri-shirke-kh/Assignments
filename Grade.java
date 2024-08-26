public class Grade
{
 public static void main(String[] args)
{
	int score=88;
	if(score>=90)
	{
	System.out.println("Grade A:");
	}
	if(score>=80&&score<=89)
	{
	System.out.println("Grade B:");
	}
	if(score>=70&&score<=79)
	{
	System.out.println("Grade C:");
	}
	if(score>=60&&score<=69)
	{
	System.out.println("Grade D:");
	}
	if(score<60)
	{
	System.out.println("Fail:");
	}
	
}
}