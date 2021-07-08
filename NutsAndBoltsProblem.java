import java.util.*;
import java.lang.*;
public class NutsAndBoltsProblem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String nuts[]=new String[n];
		String bolts[]=new String[n];
		for(int i=0;i<n;i++)
		{
			nuts[i]=sc.nextLine();
		}
		for(int j=0;j<n;j++)
		{
			bolts[j]=sc.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(nuts[i]);
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(bolts[j]);
		}
	}
}