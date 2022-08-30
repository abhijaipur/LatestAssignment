package Day3;

public class Assignment2 {
	public void method1()
	{

	 System.out.println("Default method");
	}
	public void method2(int a)
	{
		System.out.println("one parameterized method");
	}
	public void method3(int a, int b)
	{
		System.out.println("Two parameterized method");

	}
	public void method4(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
	}
	public void method5(int a, int b, int c, int d)
	{
	    this.method4(1, 2,3);
	    this.method1();
	    this.method2(1);
	    this.method3(1, 3);
		System.out.println("Four parameterized method");
		
	}
	
	public static void main(String[] args)
	{
		Assignment2 a = new Assignment2();
		a.method5(1,2,3,4);
	}
	
}
