So many chocolates? (Contest)
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
It's Solo's 1st birthday and everyone is gifting her chocolates. There are N guests invited, the ith guest gives Solo A[i] chocolates.

Find the total number of chocolates that Solo receives.
Input
The first line of the input contains an integer N, the number of guests.
The second line of the input contains N integers A[1], A[2],. , A[N]

Constraints
1 <= N <= 100
1 <= A[i] <= 100
Output
Output a single integer, the total number of chocolates that Solo receives.
Example
Sample Input
5
1 2 4 3 2

Sample Output
12

Explanation: Solo receives a total of 1+2+4+3+2 = 12 chocolates.

Sample Input
1
2

Sample Output
2


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int [] arr = new int[n];
		int i;
		int sum = 0;
		for(i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			
		}
		for(i=0;i<n;i++){
			sum += arr[i];
		}
		System.out.print(sum);
		
		
            
	}
}