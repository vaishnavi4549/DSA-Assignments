//https://www.hackerrank.com/challenges/cpp-maps/problem
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
   map<string,int>m;
   cout<<"Enter Number of iterations";
   int q;
   cin>>q;
   int ch;
   int marks;
   string name;
   cout<<"1: ADD marks."<<endl;
   cout<<"2: Erase marks."<<endl;
   cout<<"3: Print marks"<<endl;
   for(int i=0;i<q;i++){
       cin>>ch;
       cout<<"Enter Name";
       cin>>name;
       if(ch==1){
           cin>>marks;
           m[name]+=marks;
       }
       if(ch==2){
           m.erase(name);
       }
       if(ch==3){
           cout<<"Marks:"<<m[name]<<endl;
       }
   }
    return 0;
}



