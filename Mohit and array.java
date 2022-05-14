Mohit and array
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N
Output
Print the missing element
Example
Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
              Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        int i=0;
        for(i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }

        int ans =0;
        
        for (i=1; i<=a.length; i++) // i = 1 to n
            ans = ans^i^a[i-1];// index: 0 to n-1 =i-1
        
        // i = n
        ans = ans^i;
        System.out.println(ans);

    }
}