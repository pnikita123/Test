package classandobject;

public class SimpleInterest {
	
	double pi,p,t,r;
	public SimpleInterest()
	{
		pi=3.14f;
		p=5000;
		t=7;
		r=2;
		
	}
	public SimpleInterest(double p,double t,double r)
	{
		//this.pi=pi;
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public void simpleinterest()
	{
		System.out.println("Simple Interest is :"+(p*r*t)/100);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest sc1=new SimpleInterest ();
		sc1.simpleinterest();
		SimpleInterest sc2=new SimpleInterest (13000,12,2);
		sc2.simpleinterest();
		
		

	}

}
