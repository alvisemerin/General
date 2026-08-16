import java.util.*;
public class sumofun
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter how many no you want to find the sum of: ");
		int no=0,sum=0; 
		no=s.nextInt();
		int [] n =new int[no];
		System.out.println("Now Enter the Numbers: ");
		for(int i=0;i<no;i++)
		{
			n[i]=s.nextInt();
			sum+=n[i];
		}
		System.out.println("The Sum of given "+no+" is : "+sum);
	}
}
