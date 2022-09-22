package relationshipEx;

public class Address {
	String addrLine,street,city,state,pincode;

	
	public Address()
	{
		addrLine="Road 100";
		street="Bhigwan";
		city="BAramti";
		state="Maharastra";
		pincode="413130";
	}
	public Address(String addrLine,String street,String city,String state,String pincode )
	{
		this.addrLine=addrLine;
		this.street=street;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	public void display()
	{
		System.out.println("Address :"+addrLine+ "" +street+ "" +city+ "" +state+ "" +pincode);
	}

}
