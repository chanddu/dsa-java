#include<iostream>
using namespace std;
long getMaxChocoPeices(long k){
	long x,y,f;
	x = k/2;
	y = k-x;
	return x*y;
}
int main(){
	long testCases,k;
	cin>>testCases;
	while(testCases--){
		cin>>k;
		cout<<getMaxChocoPeices(k)<<endl;
	}
}