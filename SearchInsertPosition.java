import java.util.*;
import java.lang.*;
public class SearchInsertPosition
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			int a[]=new int[4];
			int b[]=new int[5];
			for(int i=0;i<4;i++)
			{
				a[i]=sc.nextInt();
				b[i]=a[i];
			}
			int target=sc.nextInt();
			b[4]=target;
			for(int i=0;i<4;i++)
			{
				for(int k=i+1;k<5;k++)
				{
					if(b[k]<=b[i])
					{
						int temp=b[k];
						b[k]=b[i];
						b[i]=temp;
					}
				}
			}
			for(int i=0;i<5;i++)
			{
				if(b[i]==target)
				{
					System.out.println(i);
					break;
				}
			}
			t-=1;
		}
	}
}