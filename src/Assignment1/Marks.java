package Assignment1;

import java.util.*;

public class Marks {
	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);
		double m1 = read.nextDouble();
		double m2 = read.nextDouble();
		double m3 = read.nextDouble();
		if(m1 > 60 && m2 >60 && m3 >60)
		{
			System.out.println("Passed");
		}
		else if((m1>60 && m2>60) || (m2>60 && m3>60) || (m3>60 && m1>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
		read.close();
	}}

