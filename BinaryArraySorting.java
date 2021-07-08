import java.util.*;
import java.lang.*;
public class BinaryArraySorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int countZeros=0,countOnes=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]==0)
				{
					countZeros+=1;
				}
				else if(a[i]==1)
				{
					countOnes+=1;
				}
			}
			for(int i=0;i<countZeros;i++)
			{
				System.out.print(0+" ");
			}
			for(int i=0;i<countOnes;i++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
			t-=1;
		}
	}
}
