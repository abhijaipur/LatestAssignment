package Day3;

/*three parameterized constructor
default constructor
one parameterized constructor
two parameterized constructor
four parameterized constructor*/

public class Assignment1 {
	
	public Assignment1()
	{   
		this(1,2,2);
		System.out.println("Default Constructor");
	}
	public Assignment1(int a)
	{
		this();
		System.out.println("one parameterized Constructor");
	}
	public Assignment1(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized Constructor");
	}
	public Assignment1(int a, int b, int c)
	{
		System.out.println("Three parameterized Constructor");
	}
	public Assignment1(int a, int b, int c, int d)
	{
		this(1,2);
		System.out.println("Four parameterized Constructor");
	}

	public static void main (String[] args)
	{
		Assignment1 a = new Assignment1(1,2,3,4);
}
}
