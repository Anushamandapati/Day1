package Assignment1;
import java.util.*;
public class Revstr 
{
	public static void main(String args[])
	{
		String str="",ans="";
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		sc.close();
		String str2[]=str.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			String rev="";
			for(int j=str2[i].length()-1;j>=0;j--)
			{
				rev=rev+str2[i].charAt(j);
			}
			ans=ans+rev+" ";
		}
		System.out.println(ans);
		sc.close();
	
	}

}
