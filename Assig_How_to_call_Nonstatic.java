package basicP1;

public class Assig_How_to_call_Nonstatic 
{
		int a=20;
		int b=10;
		
	    void add(){
			int a=20;
			int b=10;
			int sum=a+b;
			System.out.println(sum);
		}
		void sub(){
			int a=20;
			int b=10;
			int sub=a-b;
			System.out.println(sub);
			}
	public static void main(String[] args){
		Assig_How_to_call_Nonstatic S1= new Assig_How_to_call_Nonstatic();
		
		    S1.add();
			S1.sub();
			System.out.println("main method");
		}}
