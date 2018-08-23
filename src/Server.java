import java.io.IOException;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String args[])
    {
		Display dis =new Display();
	try {
		ServerSocket so1= new ServerSocket(7878);
	    Socket sock = so1.accept();
		boolean a = sock.isConnected();
		System.out.println("socket is connected "+ a);
		ObjectInputStream objread = new ObjectInputStream(sock.getInputStream());
		//DataInputStream reader = new DataInputStream(sock.getInputStream());
		
		System.out.println("Connection received...");
		
		Student temp = (Student) objread.readObject();
		//String s= (String)reader.readUTF();
		
		/*String name =temp.name;
		String email = temp.email;
		long contact= temp.contact;
		*/
		//System.out.println("Student name is  :-" +name+"email"+email+"contact"+contact);
		dis.display(temp);
		//Arraylist array = new Arraylist();
		//array.addStudent(temp);
		//ArrayList<Student> arr = new ArrayList<Student>();
		//boolean isadded= arr.add(temp);
		//System.out.println(" added to arraylist"+isadded);
		
		/*ArrayList arr = new ArrayList();
		boolean isaddes = arr.addStudent(temp);
		System.out.println("Student added in ArrayList"+isaddes);
		*/
		objread.close();
		sock.close();
		so1.close();
		} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
