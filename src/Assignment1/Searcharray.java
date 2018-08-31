package Assignment1;
import java.util.Scanner;
public class Searcharray 
{
	public static void main(String args[])
	{
		int ar[] ;
	    ar = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int val = sc.nextInt();
		for(int i=0;i<=14;i++)
		{
			if(val == ar[i])
			{
				System.out.println("Element found");
			}
		}
		sc.close();
	}
}

	
	
	


