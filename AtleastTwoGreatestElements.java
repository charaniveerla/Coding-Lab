import java.util.*;
import java.lang.*;
public class AtleastTwoGreatestElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int tmp=a[i];
						a[i]=a[j];
						a[j]=tmp;
					}
				}
			}
			for(int i=0;i<n-2;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			t-=1;
		}
	}
}