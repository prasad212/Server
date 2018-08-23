import java.io.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;



public class Client  {

	Data d1 = new Data();

	public static void main(String args[])
	{
		Client c1 = new Client();
		c1.clientConnect();
		
	}
	public void clientConnect()
	{
		try 
		{
			Socket s1= new Socket("LocalHost",7878);
			boolean a1 = s1.isConnected();
			System.out.println("connected "+a1);
			ObjectOutputStream obj = new ObjectOutputStream(s1.getOutputStream());
			//DataOutputStream read = new DataOutputStream(s1.getOutputStream());
			//
			
			
			/*System.out.println("Please Enter Your Choice ");
			System.out.println("1>Add Student ");
			System.out.println("2>Delete Student");
			System.out.println("3>Display Student");
			System.out.println("4>");
			System.out.println("Please Enter Your Choice ");
			
			switch(c)
			{
			*/
			Student temp = d1.getdata();
			fileWriter write = new fileWriter();
			boolean writed = write.filewrite(temp);
			System.out.println("  to the File name Student "+ writed);
			//Display dis =new Display();
			
			obj.writeObject(temp);
			
			obj.flush();
			
			obj.close();
			//}
			//read.writeUTF("hello world");
			//read.flush();
			//read.close();
			
			s1.close();
			
		}
		catch(IOException e) {
		e.printStackTrace();
	}
	}
		
	}
		
		
	

}