import java.util.*; 
import java.lang.*;
public class subsetArray 
{ 
    public static int isSubset(int a[], int b[], int m, int n)  
    { 
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < m; i++)
		{
            if (mp.containsKey(a[i]))  
            { 
                mp.put(a[i], mp.get(a[i]) + 1); 
            }  
            else
            { 
                mp.put(a[i], 1); 
            } 
		} 
        int f = 0; 
        for (int i = 0; i < n; i++)  
        { 
            if (!mp.containsKey(b[i]))  
            { 
                f = 1; 
                break; 
            } 
            else 
            { 
                mp.put(b[i], mp.get(b[i]) - 1); 
  
                if(mp.get(b[i]) == 0)
				{					
                    mp.remove(b[i]); 
				}
			}
        } 
        return f; 
    } 
    public static void main(String[] args) 
    { 
		Scanner sc=new Scanner(System.in);
        int arr1[]=new int[20]; 
        int arr2[]=new int[20]; 
		int m=0,n=0;
		System.out.println("Enter First Array size:");
		m=sc.nextInt();
		System.out.println("Enter Second Array size:");
		n=sc.nextInt();
		System.out.println("Enter First Array Elements:");
        for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array Elements:");		
        for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		if (isSubset(arr1, arr2, m, n)!=1) 
            System.out.print("arr2[] is subset of arr1[] "); 
        else
            System.out.print("arr2[] is not a subset of arr1[]"); 
    } 
}