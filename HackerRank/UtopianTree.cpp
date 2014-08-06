#include <iostream>
using namespace std;
int check = 1;
int height(int n) {
    int h = 1;
    while(n--){
        if(check==1){
            h = 2*h;
            check = 2;
        } 
        else {
            h = h+1;
            check = 1;
        }
    }
    check = 1;
    return h;
}
int main() {
    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        cout << height(n) << endl;
    }
}
