package basicP1;

public class How_to_call_static_method
{
	static void addition()
	{
		System.out.println("Addition method");
	}
	static void sub()
	{
		System.out.println("subraction method");
	}
	
	static void multi()
	{
		System.out.println("multiplication method");
	}
public static void main(String[] args) 
{
	  
System.out.println("main method");
	
	sub();
	addition();
	multi();
	
}

}
