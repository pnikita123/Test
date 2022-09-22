package collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo s1, StudentInfo s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age)
			return 0;
			else if(s1.age>s2.age)
				return 1;
			else return -1;
		
	}
	
	

}
