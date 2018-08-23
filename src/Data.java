import java.util.Scanner;

public class Data {
	public  Student getdata()
	{	
		
		System.out.println("Enter the name of student ");
		Scanner s = new Scanner(System.in);
		String name =s.nextLine();
		System.out.println("Enter the Email  ");
		String email = s.nextLine();
		System.out.println("Enter the Contact no ");
		long contact = s.nextLong();
		
		Student temp = new Student (name,email,contact);
		return temp;
		
	}
 public  boolean delete (Student temp)
{
	 System.out.println("Student "+ temp.name +" is Removed From Record  ");
	 return true;
	
}
	
}
