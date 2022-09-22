package collection;

public class StudentInfo {
	int id;
	String name;
	int age;
	
	public StudentInfo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	

}
