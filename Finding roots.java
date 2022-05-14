Finding roots
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25 + i2.22
-0.25 - i2.22


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double r1,r2;
			double d;
			// To find the determinant (b^2-4*a*C)
				d = b * b - 4 * a * c;
			// if d is greater than zero
			if(d>0){
				r1 = (-b+Math.sqrt(d))/(2 * a);
				r2 = (-b-Math.sqrt(d))/(2 * a);
				System.out.format("%.2f %n%.2f", r1, r2);
			}
			// if d is equal to zero
			else if(d==0){
				r1=r2=-b/2*a;
				System.out.format("%.2f;", r1);
			}
			// if d is less than zero
			else {
				double real = -b / (2*a);
				double imaginary = Math.sqrt(-d)/(2*a);
				System.out.format("%.2f+i%.2f", real, imaginary);
				System.out.format("\n%.2f-i%.2f", real, imaginary);

			}



	}
}