Divisors Of N
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9
Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Example
Input:
2
9
8

Output
0
3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	int i,j;
	int count=0;
	for(i=0;i<t;i++)
	{
		int n=s.nextInt();
        count=0;
        for (j=1;j<=Math.sqrt(n);j++)    //check if no is divisor
        {
            if (n%j==0)
            {
                if (j%2==0)
                {
                count++;
                }
            
                if ((n / j) % 2 == 0)
                {
                count++;
                }  
            }
        }
        j--;

        if ((j * j == n) && (j % 2 == 0))
        {
        count--;
        }
    System.out.println(count);
    }
    
}

}