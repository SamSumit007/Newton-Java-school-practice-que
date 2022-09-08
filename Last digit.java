Problem Statement
Given an integer N print the last digit of the given integer.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function LastDigit() that takes integer N as argument.

Constraints:-
1 <= N <= 10000
Output
Return the last digit of the given integer.
  
  
  
  static int LastDigit(int N){
// Enter your code here
int  digit = N%10;
     return digit;
}
