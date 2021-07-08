import java.util.*;
import java.lang.*;
public class MaximumNoOfBalloons
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String b="balloon";
		String s=sc.nextLine();
		int count[]=new int[b.length()];
		for(int i=0;i<b.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==b.charAt(i))
				{
					count[i]+=1;
				}
			}
		}
		int i=0;
		if(count[i]==count[i+1] && count[i]==count[b.length()-1])
		{
			if(count[i+2]==count[i+3])
			{
				System.out.println(count[i]);
			}
		}
	}
}