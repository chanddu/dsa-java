#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,n,c,m;
    cin>>t;
    while(t--){
        cin>>n>>c>>m;
        int answer=0;
        // Computer answer
        answer = n/c;
        int wrappers = answer ;
        int chocos=0;
        while(wrappers/m){
            chocos = wrappers/m;
            wrappers = wrappers%m + chocos;
            answer += chocos;
        }
        cout<<answer<<endl;
    }
    return 0;
}
