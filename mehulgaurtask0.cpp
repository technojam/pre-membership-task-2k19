#include <iostream.h> 
using namespace std; 
void Egyptian(int Nu, int De) 
{ 
    if (De == 0 || Nu == 0) 
        return;
    if (De%Nu == 0) 
    { 
        cout << "1/" << De/Nu; 
        return; 
    } 
    if (Nu%De == 0) 
    { 
        cout << Nu/De; 
        return; 
    } 
    if ( Nu > De) 
    { 
        cout << Nu/De << " + "; 
        Egyptian(Nu%De, De); 
        return; 
    } 
    int n = De/Nu + 1; 
    cout << "1/" << n << " + ";  
    Egyptian(Nu*n-De, De*n); 
 } 
int main() 
{ 
int Nu,De;
cout<<"Enter Nu and De for egyption fraction";
cin>>Nu>>De;
    cout << "Egyptian Fraction Representation of "<< Nu << "/" << De << " is\n "; 
    Egyptian(Nu,De); 
    return 0; 
}
