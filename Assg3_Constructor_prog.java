package basicP1;

public class Assg3_Constructor_prog 
{

  Assg3_Constructor_prog()
  {
	  System.out.println("This is constructor");
  }
  Assg3_Constructor_prog(int a)
  {
	  System.out.println("This is constructor with values");
  }
	
	public static void main(String[] args) 
	{
	new  Assg3_Constructor_prog();
	new  Assg3_Constructor_prog(10);
	}

}
