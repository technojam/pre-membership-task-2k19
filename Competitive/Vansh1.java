// Question 1 Audition Problem 1
import java.util.*;
class mig
{
    public static void main(String[] ar)
    {
        Scanner ab=new Scanner(System.in);
        int p=ab.nextInt();
        int s=ab.nextInt();
        int n=ab.nextInt();
        int sv=ab.nextInt();
        int [][] a=new int[5][5];
        int x,y,q=1,z,x1,y1,l;
        for(x=0;x<5;x++)
        {
            for(y=0;y<5;y++)
            {
                if(q==p)
                a[x][y]=n;
                q++;   
            }
        }
        q=1;
        do
        {
            p=p+s;
            for(x=0;x<5;x++)
            {
                for(y=0;y<5;y++)
                {
                    if(a[x][y]>=4)
                    {
                        l=a[x][y]/4;
                        a[x][y]=a[x][y]%4;
                        try
                        {
                            a[x-1][y]=l;
                            a[x][y-1]=l;
                            a[x+1][y]=l;
                            a[x][y+1]=l;
                            x--;
                            y--;
                        }
                        catch(Exception e)
                        {}
                    }
                }
            }
            for(x1=0;x1<5;x1++)
            {
                for(y1=0;y1<5;y1++)
                {
                    if(q==p)
                    {
                        n++;
                        a[x1][y1]=a[x1][y1]+1;
                    }
                    q++;
                }
            }
            q=1;
            sv--;
        }while(sv>=0);
        for(x=0;x<5;x++)
        {
            for(y=0;y<5;y++)
            System.out.print(a[x][y]+" ");
            System.out.println();
        }
    }
}
