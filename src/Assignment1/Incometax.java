package Assignment1;
import java.util.*;

public class Incometax {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		if(n>=0 && n<=180000)
		{
			System.out.println("nil");
		}
		else if(n >=180001 && n <=300000)
		{
			System.out.println(" "+(n *0.1));
		}
		else if(n >=300001 && n <=500000)
		{
			System.out.println(" "+(n *0.2));
		}
		else if(n >=500001 && n <=1000000)
		{
			System.out.println(" "+(n *0.3));
		}
		sc.close();
		
	}

}
