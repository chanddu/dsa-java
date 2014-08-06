#include<iostream>
using namespace std;

int allowedVehicle(int *width,int i,int j){
    int min=width[i],x;
    for(x=i+1;x<=j;x++){
        if(width[x]<min)
            min = width[x];
    }
    
    return min;
}

int main(){
    int freewayLength,testCases,i,j;
    cin>>freewayLength>>testCases;
    int *width = new int[freewayLength];
    for(int i=0;i<freewayLength;i++)
        cin>>width[i];
    while(testCases--){
        cin>>i>>j;
        cout<<allowedVehicle(width,i,j)<<endl;
    }
    
    return 0;
}