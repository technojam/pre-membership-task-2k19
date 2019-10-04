import java.io.*;
class Vansh
{ 
    public static void main(String[] a)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numerator ");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter the denominator ");
        int d=Integer.parseInt(in.readLine());
        while(d!=0||n!=0)
        {
            if(d%n==0)
            {
                System.out.print("1/" + d/n); 
                break;
            }
            else if (n%d== 0)
            {
                System.out.print(n/d); 
                break;
            }
            else if (n>d) 
            { 
                System.out.print(n/d+ " + "); 
                n=n%d; 
            }
            int num= d/n + 1; 
            System.out.print("1/" + num + " + "); 
            n=n*num-d;
            d=d*num; 
        } 
    }
} 