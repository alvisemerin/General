import java.util.*;
public class pattern2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=1,j=1,k=1,l=1;
		System.out.println("Enter the no of rows and column: ");
		i=sc.nextInt();
		j=sc.nextInt();
		while(k<i)
		{
			for(;l<i;l++)
			{
				System.out.print("*\t");
			}
			System.out.println("");
			k++;
		}
	}
}

