import java.util.*;
class task
{int de[]=new int[1000];int co=0;
    int p,q;double fr;
    int hcf(int a,int b)
    {int c=1;
        for(int i=1;i<b+a ;i++)
        {if((a%i==0)&&(b%i==0))
            {c=i;
            }}return(c);}
            int rem(int nu1,int nu2,int de1,int de2,int h)
            {  int  lcm=(de1*de2)/h;
                int a=(lcm/de1)*nu1;
                int b=(lcm/de2)*nu2;
                int def;
                if(a>b)
                {def=a-b;
                }
                else
               { def=b-a;
            }
            return(def);
        }
        void print()
        {int h,a; fr=(p*1.0)/q;
            double s=0.0;
            while(p>1)
            {
               double f=(1.0*p)/q;
               
                for(int i=q;i>=1;i--)
                {double d=(1.0/i);
                    if(d>f)
                    {h=hcf(q,i+1);
                      a=rem(1,p,i+1,q,h);
                      p=a;q=(q*(i+1)/h);
                      s=s+((1.0)/(i+1));
                      de[co]=(i+1);
                      co++;
                      break;
            }}}
         System.out.print(1+"/"+de[0]);
            for(int i=1;i<co;i++)
            {System.out.print("+1/"+de[i]);
            }
            if(s!=fr)
            {System.out.print("+1/"+q);
            }
        }
         void num1()
    {    System.out.print(p+"/"+(q+1)+"+"+p+"/"+(q)*(q+1));
    }
    public static void main()
  {  int f=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the neuminator");
    int n=sc.nextInt();
    System.out.println("Enter the denominator");
    int d=sc.nextInt();
    task t=new task();
    int h=t.hcf(n,d);
    t.p=n;
    t.q=d;
    System.out.print(t.p+"/"+t.q+"=");
    t.p=n/h;
    t.q=d/h;
    if(t.p==1)
           {t.num1(); }
    else
    {t.print();
   }}}
    
