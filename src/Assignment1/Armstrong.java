package Assignment1;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
	    int orignum=num;
	    int sum = 0;
	   while(num != 0)
	   {
		   int digit = num % 10;
		   sum = sum+(digit*digit*digit);
		   num = num/10;
	   }
	   if(sum== orignum)
	   {
		   System.out.println("Armstrong number");
	   }
	   else
	   {
		   System.out.println("Not Armstrong number");
	   }
	   s.close();
		
	}
	
}

