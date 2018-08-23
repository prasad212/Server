import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public boolean filewrite(Student s1) throws IOException
{
	String name = s1.name;
	String email = s1.email;
	String contact = Long.toString(s1.contact);
	FileWriter writer = new FileWriter("Student.txt");
	writer.write("Name:-"+name+" Email:- "+email+" Contact:- "+contact);
	writer.close();
	return true;
	
}
}
