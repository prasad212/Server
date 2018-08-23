

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student>{

	  
	   public int compare(Student s1, Student s2)
	   {
	       return s1.roll_no - s2.roll_no;
	   
	}

}
