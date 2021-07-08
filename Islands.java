import java.util.*;
import java.lang.*;
import java.io.*;
public class Islands{
	int ROW,COL;
	public Islands(int row,int col)
	{
	this.ROW=row;
	this.COL=col;
	}
	boolean isSafe(int M[][], int row, int col,boolean visited[][])
	{
	return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]);
	}
	void DFS(int M[][], int row, int col, boolean visited[][])
	{
int rowNbr[] = new int[] { -1, 0,0,1};
int colNbr[] = new int[] { 0,-1,1,0};

visited[row][col] = true;

// Recur for all connected neighbours
for (int k = 0; k <4; ++k)
if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
DFS(M, row + rowNbr[k], col + colNbr[k], visited);
}

int countIslands(int M[][])
{
boolean visited[][] = new boolean[ROW][COL];
int count = 0;
for (int i = 0; i < ROW; ++i)
for (int j = 0; j < COL; ++j)
if (M[i][j] == 1 && !visited[i][j])
{    // value 1 is not
// visited yet, then new island found, Visit all
// cells in this island and increment island count
DFS(M, i, j, visited);
++count;
}

return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int g[][] = new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
g[i][j]=sc.nextInt();
}
}
Islands I = new Islands(row,col);
System.out.println("Number of islands is: " + I.countIslands(g));
}
}
