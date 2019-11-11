// Question 0: Understand the pattern and write the code accordingly.
    
#include<iostream>
using namespace std;

int main()
{   
    int num = 96;
    int size;
    cout<<"n = ";
    cin>>size;
    int m = (size*4)-3;
    for(int i = size;i>0;i--)
    {
        for(int j = (i-1)*2 ;j>0;j--)
            cout<<"-";
        for(int j = size;j>=i;j--)
        {   if(i==size)
                cout<<char(j+num);
            else
                cout<<char(j+num)<<"-";
        } 
        for(int j = i+1;j<=size;j++)
        {
            if(j!=size)
                cout<<char(j+num)<<"-";
            else
                cout<<char(j+num);
        }
        for(int j = (i-1)*2 ;j>0;j--)
            cout<<"-";
            cout<<endl;
    }
    for(int i = 0;i<size-1;i++)
    {
        for(int j = 1;j<=(2*i)+2;j++)
            cout<<"-";    
        for(int j = size;j>=i+2;j--)
            cout<<char(j+num)<<"-";    
        for(int j = i+3;j<=size;j++)
            cout<<char(j+num)<<"-";
        for(int j = 0;j<=(2*i);j++)
            cout<<"-";
        cout<<endl;
    }
    
}


  

// Question 1: Understand the pattern and write the code accordingly.

#include <iostream>
using namespace std;
int main()
{
    int size , x =  10;
    cout<<"Enter size: ";
    cin>>size;
    int y = (size*size*10)+10;
    for(int i=0;i<size;i++)
    {
	    for(int j=0;j<=2*i;j++)
		    if(j!=2*i)
		        cout<<"*";   
	    for(int j=size-i;j>0;j--)
	    {
	        cout<<x;
	        x=x+10;
	    }
	    int z = y;
	    for(int j=size-i;j>0;j--)
	    {   if(j!=1)
	            cout<<y;
	       else
	        cout<<y/10;
	        y=y+10;
	    }
	    y=z-((size-i-1)*10);
	    cout<<endl;
    }
    return 0;
}



// Question 2: Write a function which takes n as input and returns the corresponding nth fibonacci number.

#include <iostream>
using namespace std;

int fibonacci(int n) 
{
   if((n==1)||(n==0)) 
      return(n);
   else 
      return(fibonacci(n-1)+fibonacci(n-2));
}

int main()
{
   int n , i=0;
   cout << "n =  ";
   cin >> n;
   cout<<fibonacci(n-1);
   return 0;
}
   



