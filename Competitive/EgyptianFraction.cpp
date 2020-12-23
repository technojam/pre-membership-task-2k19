#include <iostream.h> 
using namespace std; 
void Egyptian(int num, int den) 
{ 
    if (den == 0 || num == 0) 
        return;
    if (den%num == 0) 
    { 
        cout << "1/" << den/num; 
        return; 
    } 
    if (num%den == 0) 
    { 
        cout << num/den; 
        return; 
    } 
    if (num > den) 
    { 
        cout << num/den << " + "; 
        Egyptian(num%den, den); 
        return; 
    } 
    int n = den/num + 1; 
    cout << "1/" << n << " + ";  
    Egyptian(num*n-den, den*n); 
 } 
int main() 
{ 
int num,den;
cout<<"Enter num and den for egyption fraction";
cin>>num>>den;
    cout << "Egyptian Fraction Representation of "<< num << "/" << den << " is\n "; 
    Egyptian(num, den); 
    return 0; 
}
