package basicP1;

public class Assg_Method_overloading 
{
static void add(int a)
{
	System.out.println("10");
}
   static void add()
   {
	   System.out.println("20");
   }
   static void add(String s, char b, double c)
   {
	   System.out.println("30");
   }
	public static void main(String[] args) 
	{
	add(90);
	add();
	add("sri", 'A', 2.45);
	}

}
