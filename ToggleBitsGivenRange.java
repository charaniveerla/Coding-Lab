import java.util.*;
import java.lang.Math;
public class ToggleBitsGivenRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[10];//since 1000 can be stored in max of 10 bits
		int l=sc.nextInt();
		int r=sc.nextInt();
		int i=9;
		//storing the binary equivalent of given 'n' number into an array 'a', where each binary bit is stored as an individual element in array
		while(n>0)
		{
			a[i]=n%2;
			n=n/2;
			i-=1;
		}
		/*
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		for(int j=(9-r)+1;j<=(9-l)+1;j++)
		{
			if(a[j]==0)
			{
				a[j]=1;
			}
			else
			{
				a[j]=0;
			}
		}
		//after toggling the bits the array will become as:
		/*for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		// 'a' has the toggled bits
		//converting the complete array into single int type variable called "ori"
		int size=9,k=0,ori=0,base=1;//len(a)-1
		while(size>=0)
		{
			k=a[size];
			ori=(k*base)+ori;
			base=base*10;
			size-=1;
		}
		//System.out.println(ori);//converting 'ori' into corresponding base 10 number 'dec'
		int rem=0,dec=0;
		i=0;
		while(ori!=0)
		{
			rem=ori%10;
			ori=ori/10;
			dec=dec+(rem*((int)Math.pow(2,i)));//typecast it as Math.pow returns double type
			++i;
		}
		System.out.println(dec);
	}
}
/*
Step 1: Read n,l,r values from user
Step 2: Convert given 'n' which is in base 10 to equivalent base 2 number in an array where each bit is stored as an element in the array
Step 3: Toggle the bits using given l,r values. So now we have updated the array by toggling
Step 4: Convert the toggled array having binary bits into a single integer type variable called 'ori'
Step 5: Now convert this integer type variable 'ori' to its equivalent base 10 value and store it in dec
Step 6: Print dec
*/