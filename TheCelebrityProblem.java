import java.util.*;
import java.lang.*;
public class TheCelebrityProblem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		int count=0;
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(j!=i)
				{
					if(a[j][i]==1)
					{
						count+=1;
					}
				}
			}
			//System.out.println(count);
			if(count==n-1)
			{
				System.out.println(i);
				break;
			}
		}
		if(count!=n-1)
		{
			System.out.println(-1);
		}
	}
}