package classandobject;

public class Percentage {
	
	int sub1,sub2,sub3;
	public Percentage()
	{
		sub1=78;
		sub2=89;
		sub3=87;
	}
	public Percentage(int sub1,int sub2,int sub3)
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	public void marks()
	{
		System.out.println("Percentage is :"+((sub1+sub2+sub3))/3+" %");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage p1=new Percentage();
				p1.marks();
		Percentage p2=new Percentage(90,98,78);
				p2.marks();

	}

}
