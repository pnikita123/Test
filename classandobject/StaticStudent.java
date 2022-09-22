package classandobject;

public class StaticStudent {
	
	int id;
	String name;
	static String colName="T.C.Collage";
	
	public StaticStudent(int id,String name)
	{
		super();
		this.id=id;
        this.name=name;
		
	}	
	public void display()
	{
		System.out.println(id+" " +name+" " +colName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStudent s1=new StaticStudent(101,"Ankita");
		StaticStudent s2=new StaticStudent(102,"Pooja");
		s1.display();
		s2.display();

	}

}
