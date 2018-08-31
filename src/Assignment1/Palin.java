package Assignment1;
import java.util.*;
public class Palin
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,rem;
		int temp = num;
		while(num > 0)
		{
			rem= num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(sum == temp)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
		
	}

}
