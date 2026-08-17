import java.util.*;
public class cal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t___________________________\n\t|Welcome to my New Project|");
 		System.out.println("\t|-------------------------|");
		System.out.println("\t|Mode-1= Addition\t  |\n\t|Mode-2= Substraction\t  |\n\t|Mode-3= Multiplication\t  |\n\t|Mode-4= Division\t  |\n\t|Mode-5= Modulus\t  |\n\t---------------------------");
		int i=0,j=0,result=0;
		System.out.print("Enter the Value: ");
		i=sc.nextInt();
		if(i==1)
			{
				System.out.print("Option Chosed ADDITION\nNow Enter How many Numbers are Required to find the sum of: ") ;
				j=sc.nextInt();
				int[] num=new int[j];
				System.out.print("Enter any "+j+" Numbers: ");
				for(int k=0;k<j;k++)
				{
					num[i]=sc.nextInt();
					result+=num[i];
				}
				System.out.println("Sum of "+j+" Numbers is equal to = "+result);
			}
		else if(i==2)
			{
				System.out.print("Option Choosed SUBSTRACTION\nNow Enter How many Numbers are Required to find the substraction of: ");
				j=sc.nextInt();
				int[] num=new int[j];
				System.out.print("Enter any "+j+ " Numbers: ");
				for(int k=0;k<j;k++)
				{
					num[i]=sc.nextInt();
					result-=num[i];
				}
				System.out.println("Substraction of "+j+" Numbers is equal to = "+result);
			}
		else if(i==3)
			{
				System.out.print("Option Choosed Multiplication\nNow Enter How many Numbers are Required to find the product of: ");
				j=sc.nextInt();
				int[] num=new int[j];
				System.out.print("Enter any "+j+" Numbers: ");
				result=1;
				for(int k=0;k<j;k++)
				{
					num[i]=sc.nextInt();
					result*=num[i];
				}
				System.out.println("Product of "+j+" Numbers is equal to = "+result);
			}
		else if(i==4)
			{
				System.out.print("Option Choosed Division\nNow Enter How many Numbers are required to find the Division of: ");
				j=sc.nextInt();
				int[] num=new int[j];
				System.out.print("Enter any "+j+" Numbers: ");
				result=num[1];
				for(int k=1;k<j;k++)
				{
					num[i]=sc.nextInt();
					result/=num[i];
				}
				System.out.println("Division of "+j+" Numbers is equal to "+result);
			}
		else if(i==5)
			{
				System.out.print("Option choosed Modulus\nNow Enter How many Numbers are required to find the modulus of: ");
				j=sc.nextInt();
				int[] num=new int[j];
				System.out.print("Enter any "+j+" Numbers: ");
				result=num[1];
				for(int k=1;k<j;k++)
				{
					num[i]=sc.nextInt();
					result%=num[i];
				}
				System.out.println("Modulus of "+j+" Numbers is equal to  "+result);
			}
		else
			System.out.println("Input Error----NA.");
	}
}
