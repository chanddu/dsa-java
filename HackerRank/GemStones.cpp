#include<iostream>
#include<sstream>
using namespace std;
bool check = true;
int lenth(char *s){
    int i=0;
    while(s[i]!='\0')
       i++;
    return i;
}
bool searchFor(char sr,char *mystr){
    int i=0;
    int len = lenth(mystr);
    while(i<len){
        if(sr==mystr[i])
            return true;
        else
            i++;
    }
    
    return false;
}
char* checkForGemStones(char *srr,char *com){
    int i=0,j=0;
    if(check){
    	check = false;
    	return srr;
    }
    else{
    char *local = new char[100];
    int l = lenth(srr);
    while(l--){
        if(searchFor(srr[i],com)){
    		local[j] = srr[i];
    	//cout<<"checking"<<com[j];
   			j++;
   		}
   		i++;
    }
    //cout<<local<<endl;
    return local;
    }
}
int main(){
    int cases,k,count = 0;
    char *str = new char[100];
    char *common = new char[100];
    int x = 1;
    cin>>cases;
    while(cases--){
    	cin>>str;
    	if(x==1){
        	common = checkForGemStones(str,common);
        	common = checkForGemStones(str,common);
        	x=0;
        }
        else
        	common = checkForGemStones(str,common);
        //cout<<"checking"<<common<<endl;
        
    }
    count = lenth(common);
    cout<<count<<endl;
    return 0;
}
