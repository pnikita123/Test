package collection;

public class EmployeeEx implements Comparable<EmployeeEx> {
	int id;
	String name;
	int age;
	public EmployeeEx(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeEx [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(EmployeeEx e) {
		// TODO Auto-generated method stub
		if(age==e.age)
		return 0;
		else if(age>e.age)
			return 1;
		else return -1;
	}
	
	

}
