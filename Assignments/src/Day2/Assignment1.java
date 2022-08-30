package Day2;

//((((10+2)+2)-2)*2)/2)

public class Assignment1 {

	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Value of sum is " + c);
		return c;
	}
	
	public int sub(int a, int b)
	{
		int c = a-b;
		System.out.println("Value of sum is " + c);
		return c;
	}
	
	public int mul(int a, int b)
	{
		int c = a*b;
		System.out.println("Value of sum is " + c);
		return c;
	}
	
	public int Div (int a, int b)
	{
		int c = a/b;
		System.out.println("Value of sum is " + c);
		return c; 
		
	} //((((10+2)+2)-2)*2)/2)
	public static void main (String[] args)
	{
		
		Assignment1 a = new Assignment1();
		int sumresult = a.sum(10,2);
	    int sumresult2 = a.sum(sumresult, 2);
	    int subresult = a.sub(sumresult2, 2);
	    int mulresult = a.mul(subresult, 2);
	    a.Div(mulresult, 2);
		
	}
	
	
}
