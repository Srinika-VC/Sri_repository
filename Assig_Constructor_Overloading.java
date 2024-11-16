package basicP1;

public class Assig_Constructor_Overloading
{

	Assig_Constructor_Overloading()
	{
		System.out.println("This is constructor");	
	}
	
	Assig_Constructor_Overloading(int a)
	{
	System.out.println("This is constructor with para");	
	}
	Assig_Constructor_Overloading(int a, double M)
	{
		System.out.println("This is constructor with 2 para");
	}
	
	public static void main(String[] args)
	{
		new Assig_Constructor_Overloading();
		Assig_Constructor_Overloading S1=new Assig_Constructor_Overloading(100, 3.14);
		new Assig_Constructor_Overloading(10);
	}}
