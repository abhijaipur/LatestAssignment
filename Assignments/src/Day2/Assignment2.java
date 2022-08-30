package Day2;
 //((((10/2)-2)-2)+2)*2)
public class Assignment2 {

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
		
	} //((((10/2)-2)-2)+2)*2)
	public static void main (String[] args)
	{
		
		Assignment2 a = new Assignment2();
		int divresult = a.Div(10, 2);
		int minresult = a.sub(divresult, 2);
		int minresult1 = a.sub(minresult, 2);
		int sumresult = a.sum(minresult1, 2);
		int mulresult = a.mul(sumresult, 2);
	}
}
