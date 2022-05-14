Hip Hip Array
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.
Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input:
6
1 2 3 4 5 6

Sample Output:
9 48

Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence sum of the numbers at even indices : 5+3+1=9
product of the numbers at odd indices: 6*4*2=48

Sample Input:
3
1 2 3

Sample Output:
2 3



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int [] arr = new int[n];
			int x = 0;
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			// Reversing an array using swap

			for(int i=0;i<n/2;i++){
				x = arr[i];
				arr[i] = arr[n-i-1];
				arr[n-i-1]=x;
			}
			long sum = 0, prod = 1;
			for(int i=0;i<n;i++){
				
           if ((i+1)%2==0) // 1 Based Indexing
               sum += arr[i];
           else
               prod *= arr[i];
			}
			System.out.print(sum+" "+prod);

	}
}