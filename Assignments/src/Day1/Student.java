package Day1;

public class Student {
	
 int age = 28;
 int rollno = 1;
 
 public void displaye()
 {
	 System.out.println("Welcome to all of you");
	 System.out.println("Welcome to all of you");
 }
 public void dispalye2()
 {
	 System.out.println("Automation is very easy");
 }

 public static void main (String[] args)
 {
	 Student sc = new Student();
	 int a = sc.age; 
	 System.out.println("Age is "+ a);
	 int b = sc.rollno;
	 System.out.println("Roll no is "+ b);
	 sc.displaye();
	 sc.dispalye2();
 }
}
