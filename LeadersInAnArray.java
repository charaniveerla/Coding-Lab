import java.util.*;
import java.lang.*;
public class LeadersInAnArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int count=0,max=0;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				max=a[i];
				for(int j=i+1;j<n;j++)
				{
					if(a[j]>max)
					{
						max=a[j];
					}
				}
				if(max==a[i])
				{
					System.out.print(a[i]+" ");
				}
			}
			System.out.print(a[n-1]+"\n");
			t-=1;
		}
	}
}