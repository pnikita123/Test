package collection;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentInfo> {

	@Override
	public int compare(StudentInfo s1, StudentInfo s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

	

}
