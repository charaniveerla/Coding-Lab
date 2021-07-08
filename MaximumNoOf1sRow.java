import java.util.*;
import java.lang.*;
public class MaximumNoOf1sRow
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int r=sc.nextInt();
			int c=sc.nextInt();
			int a[][]=new int[r][c];
			int CountOnesArray[]=new int[40];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			//looping each row
			int max=0,ithRow=0;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(a[i][j]==1)
					{
						CountOnesArray[i]+=1;
					}
				}
			}
			max=CountOnesArray[0];
			for(int i=0;i<r;i++)
			{
				if(CountOnesArray[i]>max)
				{
					max=CountOnesArray[i];
					ithRow=i;
				}
			}
			System.out.println(ithRow);
			t-=1;
		}
	}
}