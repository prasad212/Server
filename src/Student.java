import java.io.Serializable;

public class Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String email;
	public Long contact;
	
	public Student(String name,String email, Long contact)
		{
			this.name=name;
			this.email=email;
			this.contact=contact;
		}
}
