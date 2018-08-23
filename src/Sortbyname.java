

import java.util.Comparator;

class Sortbyname implements Comparator<Student>
{
	  
	   public int compare(Student s1, Student s2)
	   {
		   return s1.name.compareTo(s2.name);
	   }
}
