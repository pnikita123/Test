package string;

public class Student {
	int id,age;
	String name;
	

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	
     @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1=new Student(100,23,"rita");
		Student s2=new Student(101,22,"manisha");
		Student s3=(Student) s2.clone();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
