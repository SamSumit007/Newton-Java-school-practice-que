Simple Prime (Contest)
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Let's define P[i] as the ith Prime Number. Therefore, P[1]=2, P[2]=3, P[3]=5, so on.
Given two integers L, R (L<=R), find the value of P[L]+P[L+1]+P[L+2]...+P[R].
Input
The first line of the input contains an integer T denoting the number of test cases.
The next T lines contain two integers L and R.

Constraints
1 <= T <= 50000
1 <= L <= R <= 50000
Output
For each test case, print one line corresponding to the required value
Example
Sample Input
4
1 3
2 4
5 5
1 5

Sample Output
10
15
11
28


#include "bits/stdc++.h"
#pragma GCC optimize "03"
using namespace std;
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
const int N = 1e6 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;
int a[N];
signed main() {
IOS;
vector<int> v;
v.push_back(0);
for(int i = 2; i < N; i++){
if(a[i]) continue;
v.push_back(i);
for(int j = i*i; j < N; j += i)
a[j] = 1;
}
int p = 0;
for(auto &i: v){
i += p;
p = i;
}
int t; cin >> t;
while(t--){
int l, r;
cin >> l >> r;
cout << v[r] - v[l-1] << endl;
}
return 0;
}