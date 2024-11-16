package basicP1;
public class Assg_howtocallstatic_method
{
	int a=20;
	int b=10;
	
    void add()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	void sub()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
		}
public static void main(String[] args)
	{
	Assg_howtocallstatic_method S1= new Assg_howtocallstatic_method();
	
	    S1.add();
		S1.sub();
		System.out.println("main method");
	}
}