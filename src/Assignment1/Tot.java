package Assignment1;
import java.util.*;
public class Tot 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int [] s1 = new int[3];
		int [] s2 = new int[3];
		int [] s3 = new int[3];
		int sum1=0,sum2=0,sum3=0;
		System.out.println("Enter first student marks");
		for(i=0;i<=2;i++)
		{
			s1[i] = sc.nextInt();
		}
		System.out.println("Enter second student marks");
		for(j=0;j<=2;j++)
		{
			s2[j] = sc.nextInt();
		}
		System.out.println("Enter third student marks");
		for(k=0;k<=2;k++)
		{
			s3[k] = sc.nextInt();
		}
		for(i=0;i<=2;i++)
		{
			sum1 = sum1 + s1[i];
		}
		for(j=0;j<=2;j++)
		{
			sum2 = sum2 + s2[j];
		}
		for(k=0;k<=2;k++)
		{
			sum3 = sum3 + s3[k];
		}
		System.out.println("Total marks of student 1 are:"+sum1);
		System.out.println("Total marks of student 2 are:"+sum2);
		System.out.println("Total marks of student 3 are:"+sum3);
		System.out.println("Average marks of student 1 are:"+sum1/3);
		System.out.println("Average marks of student 2 are:"+sum2/3);
		System.out.println("Average marks of student 3 are:"+sum3/3);
		System.out.println("Total marks in subject1 are :"+((s1[0]+s2[0]+s3[0])));
		System.out.println("Total marks in subject2 are:" +((s1[1]+s2[1]+s3[1])));
		System.out.println("Total marks in subject3 are :" +((s1[2]+s2[2]+s3[2])));
		sc.close();
	}
}
