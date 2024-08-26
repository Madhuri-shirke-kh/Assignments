public class Main10
{

 public void display()
	{
	System.out.println("No parameters");
	}

 public void display(int num)
	{
	System.out.println("With parameters:"+num);
	}
public static void main(String[] args)
{
 display();
display(5);
}
}