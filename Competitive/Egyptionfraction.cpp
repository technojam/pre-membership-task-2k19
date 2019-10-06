#include <iostream> 
using namespace std; 
void Egyptian(int nr, int dr) 
{ 
    if (dr == 0 || nr == 0) 
        return;
    if (dr%nr == 0) 
    { 
        cout << "1/" << dr/nr; 
        return; 
    } 
    if (nr%dr == 0) 
    { 
        cout << nr/dr; 
        return; 
    } 
    if (nr > dr) 
    { 
        cout << nr/dr << " + "; 
        Egyptian(nr%dr, dr); 
        return; 
    } 
    int n = dr/nr + 1; 
    cout << "1/" << n << " + ";  
    Egyptian(nr*n-dr, dr*n); 
 } 
int main() 
{ 
int nr,dr;
cout<<"enter num and den for egyption fraction";
cin>>nr>>dr;
    cout << "Egyptian Fraction Representation of "
         << nr << "/" << dr << " is\n "; 
    Egyptian(nr, dr); 
    return 0; 
}
