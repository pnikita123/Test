package basic;
import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,count=0,flag=0;
		Scanner in=new Scanner(System.in);
		n = in.nextInt();
		if(n < 0)
		{
			System.out.print("Invalid array size");
			System.exit(0);
			}
		else{
			int a[]=new int[n];
			for(i = 0; i< n; i++)
			{
				a[i] = in.nextInt();
				if(a[i] < 0){
					flag=1;
					System.out.print("Invalid input");
		System.exit(0);
		}
				}
			if(flag!=1){
				for(i=0;i<n;i++){
					if(a [i]%3==0 && a[i]!=0)count++;
					}
				System.out.print(count);
				}
			}

	}

}
