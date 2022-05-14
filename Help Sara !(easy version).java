Help Sara !(easy version)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Yogi wants to be the best programmer in the world but today she stuck on an easy problem. Help her to solve it.

Problem description:-
Choose an integer N and subtract the sum of digits of the number N from it i.e. if N is 245 then subtract 2+4+5 from it making it 245 - 11 = 234.
Keep on doing this operation until the number becomes 0 (for eg. 25 requires 3 operations to reduce to 0
25 -> 18 -> 9 -> 0).

Given a number N, your task is to print the number of operations required to make the number 0.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 10000
Output
Print the number of operations required to make the number 0.
Example
Sample Input:-
25

Sample Output:-
3

Explanation:-
25 -> 18 -> 9 -> 0

Sample Input:-
4

Sample Output:-
1



#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
	int t = 1;

		while(t--){
			int n;
			cin>>n;
			int p;
			int cnt=0;
		while(n){
			p=n;
			while(n){
				p-=n%10;
				n/=10;

			}
			n=p;
			cnt++;

		}
		cout<<cnt;
		}
		return 0;


	
	return 0;
}