package Assignment1;
import java.util.*;
public class Stringsearch {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String s[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Gag","Agati","Mary","Sam","Ayan","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		int count = 0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].compareTo(str)==0)
				count++;
		}
		System.out.println(count);
		sc.close();
		
	}

}
