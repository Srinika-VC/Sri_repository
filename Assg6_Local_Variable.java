package basicP1;

public class Assg6_Local_Variable 
{
        void sum()
{
			int a=20;
			int b=10;
			int sum=a+b;
			System.out.println(sum);
		}
		static void sub()
		{
			int a=20;
			int b=10;
			int sub=a-b;
			System.out.println(sub);
			}
	public static void main(String[] args){
		Assg6_Local_Variable  S1= new Assg6_Local_Variable ();
		
		    S1.sum();
			sub();
			System.out.println("main method");
	}
}
	