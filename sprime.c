sprime
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has developed a new algorithm to find sprime for a given range starting with 2

She will start from the end mark it sprime, and mark all its factors (excluding itself) as not sprime. Then she will find the next greatest unmarked number, mark it as sprime, and mark all its factors (excluding itself) as not sprime

Your task is to calculate the the number of sprimes that are actually prime
Input
The first line contains T the number of test cases.
Each of the next T lines contain an integer n.

Constraint:-
1 <= T <= 100
2 <= n <= 10000000
Output
Output T lines, one for each test case, containing the required answer.
Example
Sample Input :
3
2
4
7

Sample Output :
1
1
2

Explanation:-
For test 3:- 7 and 5 are the required primes



#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define max1 10000001
bool a[max1];
    long b[max1];

void pre(){
	b[0]=0;b[1]=0;
	for(int i=0; i<max1; i++){
		a[i]=false;
	}
	long cnt=0;
	for(int i = 2; i<max1; i++){
		if(a[i]==false){
			cnt++;
			for(int j=i+i; j<max1; j=j+i){a[j]=true;}
		}
		b[i]=cnt;
	}
}	
int main() {
	pre();
	int t;
	cin>>t;
	while(t--){
		long n;
		cin>>n;

		cout<<(b[n]-b[(n)/2])<<endl;
	}

	
}