package Assignment1;
import java.util.Scanner;
public class Removedupli 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String st=sc.nextLine();
		int len=st.length();
		String str="";
		int count=0;
		for(int i=0;i<len;i++)
		{
			char x=st.charAt(i);
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(x==str.charAt(j))
					count++;
			}
			if(count==0)
				str+=x;
		}
		System.out.println(str);
		sc.close();
	
		
	}

}
