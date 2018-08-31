package Assignment1;
public class Armrange {
	public static void main(String args[])
	{ 
		int i,sum=0;
		for(i=100;i<=999;i++)
		{
		   int ld = i % 10;
		   int md = (i/10)%10;
		   int fd = i/100;
		   sum = (ld*ld*ld)+(md*md*md)+(fd*fd*fd);
		   if(i == sum)
		   { 
			   System.out.println(""+i);
		   }
		}
	}

}