
import java.io.*;
import java.util.*;
class Arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<Student>arr= new ArrayList<Student>(10);
		Scanner scan=new Scanner (System.in);
	
		int ch = 0;
		int ch1=0;
		Student temp=null;
		
		do
		{
			
			System.out.println("1.Add Student ");
			System.out.println("2.Display Student");
			System.out.println("3.delete Student");
			System.out.println("4.Sort student array list");
			System.out.println("5.exit");
			System.out.println("Enter your choice:");
	        ch=scan.nextInt();
	switch(ch)
    	{
		 case 1:
				    //Adding
			 Data d1  = new Data();
			 
				Student s1 = d1.getdata();
					
					
					arr.add(s1);
					break;
		 case 2:
				    //Display
					for(int i=0;i<arr.size();i++)
					{
						temp=arr.get(i);
						Display d11 = new Display();
						d11.display(temp);
					}
					break;
		 case 3:
				    
			       System.out.println("Enter the student name for Deleteing record");
					String s4=scan.next();
					for(int i=0;i<arr.size();i++)
					{
						temp=arr.get(i);
						String n1=temp.name;
						if(s4.equals(n1))
						{
							arr.remove(i);
							break;
						}
					}
				 
					System.out.println("Record deleted");
					break;
		 case 4:
				    
			 do
			  {
			     System.out.println("How you want to sort "); 
				 System.out.println("1.Using roll no");
				 System.out.println("2.Using name");
				 System.out.println("3.Exit");
			     System.out.println("Enter your choice");
			     ch1= scan.nextInt();
				 switch(ch1)
				  {
				   case 1:
						    System.out.println("SORTED STUDENT DATA USING roll_no");
						    Collections.sort(arr, new Sortbyroll());
						    for(int i=0;i<arr.size();i++)
							{
								temp=arr.get(i);
								Display d12 = new Display();
								d12.display(temp);
							}
						    break;
				   case 2: 
						   System.out.println("SORTED STUDENT DATA USING name");
						    Collections.sort(arr, new Sortbyname());
						    for(int i=0;i<arr.size();i++)
							{
								temp=arr.get(i);
								Display d13 = new Display();
								d13.display(temp);
							}
						    break;
				  default:
						  System.out.println("Invalid Choice");
                          break; 							 
				 }
			 }while(ch1!=3);
				break;
		default: 
					System.out.println("invalid choice");
					break;
			}
		}while(ch!=5);
		scan.close();
	}

}



