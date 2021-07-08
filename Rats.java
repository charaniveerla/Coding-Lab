import java.util.*;
import java.lang.*;
import java.io.*;

public class Rats{
int N;
public Rats(int N)
{
this.N=N;
}
boolean isSafe(int M[][], int row, int col,boolean visited[][])
{
return (row >= 0) && (row < N) && (col >= 0) && (col <N) && (M[row][col] =='O' && !visited[row][col]);
}
void DFS(int M[][], int row, int col, boolean visited[][])
{
int rowNbr[] = new int[] { -1, 0,0,1};
int colNbr[] = new int[] { 0,-1,1,0};

visited[row][col] = true;
for (int k = 0; k <4; ++k)
if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
DFS(M, row + rowNbr[k], col + colNbr[k], visited);
}

int countRats(int M[][])
{
boolean visited[][] = new boolean[N][N];
int count = 0;
for (int i = 0; i < N; ++i)
for (int j = 0; j < N; ++j)
if (M[i][j] == 'O' && !visited[i][j])
{    
DFS(M, i, j, visited);
++count;
}
return count;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int g[][] = new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
g[i][j]=sc.next().charAt(0);
}
}
Rats r = new Rats(n);
System.out.println("Number of Rats is: " + r.countRats(g));
}
}
