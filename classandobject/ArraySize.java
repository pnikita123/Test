package classandobject;

public class ArraySize {
	static int findSecondLargest(int a[], int n) {
		
        int second_largest = 0;
        for (int i = n - 2; i >= 0; i--)
        {
            if (a[i] != a[n - 1])
            {
                second_largest = a[i];
                break;
            }
        }
        return second_largest;
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] = { 12, 35, 1, 10, 34, 1 };
        int n = a.length;

        int answer = findSecondLargest(a, n);

        System.out.println("The second largest element in the array is: " + answer);
        

	}

}
