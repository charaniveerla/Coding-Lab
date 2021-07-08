import java.util.*;
import java.lang.*;
public class FacingTheSun
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int count=1,max=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			max=a[0];
			for(int i=1;i<n;i++)
			{
				if(a[i]>max)
				{
					count+=1;
					max=a[i];
				}
			}
			System.out.println(count);
			t-=1;
		}
	}
}