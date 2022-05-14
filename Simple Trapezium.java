Simple Trapezium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Since area of rectangle can be slightly easy, you need to calculate the area of the trapezium. You are given the lengths of the parallel sides of the trapezium and its height (distance between the parallel sides).
Input
The first and the only line of input contains three integers lengths of parallel sides followed by the height.

Constraints
1 <= side1, side2 <= 100
2 <= height <= 100
height is always divisible by 2
Output
Output a single integer, the area of the trapezium.
Example
Sample Input
3 4 2

Sample Output
7

Explanation: The area of the given trapezium is 7.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			int h = input.nextInt();

			int ans = (a+b)*(h/2);
			System.out.print(ans);
	}
}