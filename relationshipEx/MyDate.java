package relationshipEx;

public class MyDate {
int dd,mm,yy;
public MyDate()
{
	dd=12;
	mm=5;
	yy=1997;			
}
public MyDate(int dd,int mm,int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;			
}
public void display()
{
	System.out.println("Date :"+dd+"/"+mm+"/"+yy);
}

}
