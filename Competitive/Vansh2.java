//2.0 Question 0: Understand the pattern and write the code accordingly.

import java.util.*;
class Diamond
{
    public static void main(String a[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char c=(char)(96+n);
        char cc,ch;
        int ccc;
        int m=n-1,i,j,s=0,k=0;
        for (i=1;i<n;i++)
        {
            ch=c;
            for(s=1;s<=m;s++)
                System.out.print("--");
            for(j=1;j<=i;j++)
                System.out.print(c-- +"-");
            ccc=(int)c+1;
            cc=(char)ccc;
            c=ch;
            for(k=i-1;k>=1;k--)
                System.out.print(++cc +"-");
            for(s=1;s<=m;s++)
            {
                if(s==m)
                System.out.print("-");
                else
                System.out.print("--");
            }
            m--;
            System.out.println( );
        }
        ch=c;
        for(j=1;j<n;j++)
            System.out.print(c-- +"-");
        for(j=1;j<=n;j++)
        {
            if(j!=n)
            System.out.print(c++ +"-");
            else
                System.out.print(c++);
        }
        System.out.println();
        m=1;c=ch;
        for(i=n-1;i>=1;i--)
        {
            for(s=1;s<=m;s++)
                System.out.print("--");
            for(j=1;j<=i;j++)
                System.out.print(c-- +"-");
            ccc=(int)c+1;
            cc=(char)ccc;
            c=ch;
            for(k=i-1;k>=1;k--)
                System.out.print(++cc +"-");
            for(s=1;s<=m;s++)
            {
                if(s==m)
                    System.out.print("-");
                else
                    System.out.print("--");
               }
            m++;
            System.out.println( );
        }
    }
}

//2.1 Question 1: Understand the pattern and write the code accordingly.
import java.util.*;
class Pattern
{
    public static void main(String[] ar)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x,y,z,a=1,b=0,c,s=n*n+1,d=n;
        for(x=1;x<=n;x++)
        {
            for(z=0;z<b;z++)
            {  
                System.out.print("*");
            }
            b=b+2;
            for(y=n;y>=x;y--)
            {
                System.out.print(a+"0");
                a++;
            }
            for(c=d;c>=1;c--)
            {
                if(c==1)
                System.out.print(s);
                else
                System.out.print(s+"0");
                s++;
            }
            s=s-2*d+1;
            d--;
            System.out.println();
        }
    }
}

//2.2  Question 2: Write a function which takes n as input and returns the corresponding nth fibonacci number.


import java.io.*;
public class Fibo
{ 
	
	long fib(long n) 
	{ 
    	long F[][] = new long[][]{{1,1},{1,0}}; 
	    if (n == 0) 
		    return 0; 
	    power(F, n-1); 
	
    	return F[0][0]; 
	} 
	
	void multiply(long F[][], long M[][]) 
	    { 
	        long x = F[0][0]*M[0][0] + F[0][1]*M[1][0]; 
	        long y = F[0][0]*M[0][1] + F[0][1]*M[1][1]; 
        	long z = F[1][0]*M[0][0] + F[1][1]*M[1][0]; 
	        long w = F[1][0]*M[0][1] + F[1][1]*M[1][1]; 
	
        	F[0][0] = x; 
	        F[0][1] = y; 
	        F[1][0] = z; 
	        F[1][1] = w; 
	    } 
	void power(long F[][], long n) 
	    { 
	      long i; 
	      long M[][] = new long[][]{{1,1},{1,0}}; 
	
            	for (i = 2; i <= n; i++) 
		            multiply(F, M); 
	    } 
	
	public static void main (String args[])throws IOException 
	{ 
	 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	 long n=Long.parseLong(in.readLine());
	 Fibo obj=new Fibo();
	System.out.println(obj.fib(n)); 
	} 
}



