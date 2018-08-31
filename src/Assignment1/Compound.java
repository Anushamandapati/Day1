package Assignment1;

import java.util.Scanner;

public class Compound {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p,t,r,sim,com;
		System.out.println("Enter the values of p,t,r");
		p = sc.nextDouble();
		t = sc.nextDouble();
		r = sc.nextDouble();
		sim = (p*t*r)/100;
		System.out.println(""+sim);
		com = p*Math.pow(1+r*0.01,t)-p;
		System.out.println(""+com);
		sc.close();
	}

}


