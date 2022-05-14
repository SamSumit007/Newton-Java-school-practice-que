Boundary Traversal of Matrix
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args)throws Exception {
				BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	int t1=Integer.parseInt(rd.readLine());
	while(t1-- >0)
	{
		String mn[]=rd.readLine().split(" ");
		int m=Integer.parseInt(mn[0]);
		int n=Integer.parseInt(mn[1]);
		int a[][]=new int[m][n];
		String []i1=rd.readLine().split(" ");
		int index=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(i1[index]);
				index++;
			}
		}
       // Print Top rows 
      int t=0,l=0,b=m-1,r=n-1;
	  int i=0;
	  while(i<=r)
	  {
		  System.out.print(a[t][i]+" ");
		  i++;
	  }
	  t++;
	  i=t;
	  while(i<=b)
	  {
		  System.out.print(a[i][r]+" ");
		  i++;
	  }
	  r--;
	  i=r;
	//  System.out.println("Top is "+t+" Bottom is "+b);
	while(i>=l && b>=t)
	{
	   System.out.print(a[b][i]+" ");
		i--;
	}
	b--;
    i=b;
	while(i>=t && r>=l)
	{
	   System.out.print(a[i][l]+" ");
		i--;
	}

    System.out.println();
	}
	
	}
}