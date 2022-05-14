Area query
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are asked q queries each of which can be of type 1 or type 2
Type 1 : Report the area of square of side S.
Type 2 : Report the area of rectangle of sides L and R.
Input
The first line of the input contains single integer Q.
Next Q line contains the queries.
Each query first contains type of query
If query is of type one you are given a single integer S
If query is of type two you are given two integers L and R

Constraints
1 <= Q <= 25
1 <= T <= 2
1 <= S, L, R <= 1000
Output
Output Q line each containing answer to the asked query.
Example
Sample Input
2
2 5 4
1 5

Sample Output
20
25

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i=0;i<n;i++)
	{
		int e = sc.nextInt();
		if (e==1)
		{
			int a = sc.nextInt();
			int S = a*a;
			System.out.println(S);
		}
		if(e == 2)
		{
			int l = sc.nextInt();
			int b = sc.nextInt();
			int R = l*b;
			System.out.println(R);
		}
		
	}		
	}
}