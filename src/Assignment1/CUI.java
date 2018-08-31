package Assignment1;
import java.util.*;
public class CUI 
{
	public static void main(String args[])
	{
		String userid="Anusha",password="56789";
		Scanner sc = new Scanner(System.in);
		int n;
		for(int i=0;i<3;i++)
		{
			System.out.println("username: ");
			String user=sc.nextLine();
			System.out.println("Password: ");
			String pwd=sc.nextLine();
			if(user.equals(userid) && pwd.equals(password))
			{
				System.out.println("Welcome");
				break;
			}
			if(i==2)
			{
				System.out.println("Contact admin");
				break;
			}
			n=i;
			System.out.println("Sorry, try again.No of tries"+ ++n);
		}
		sc.close();
	}

}
