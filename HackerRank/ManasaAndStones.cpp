#include<bits/stdc++.h>
#define _ std::ios_base::Init i; std::ios_base::sync_with_stdio(false); std::cin.tie(0);

using namespace std;

int main()
{
    int t;
    cin>>t;
    assert(1 <= t && t <= 10);
    while(t--)
    {
        long long a,b,n,i;
        long long int c,d;
        set <int> x;
        cin>>n>>c>>d;
        assert(1 <= n && n <= 1e3);
        assert(1 <= c && c <= 1e3);
        assert(1 <= d && d <= 1e3);
        a = min(c,d);
        b = max(c,d);
        n--;
        for(i=0 ; i<= n ; i++)
        {
            x.insert(i*b+(n-i)*a);
        }
        for(auto it = x.begin(); it != x.end(); it++)
            cout << *it << " ";
        cout << endl;
    }
    return 0;
}