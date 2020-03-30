#include <stdio.h>
int Fibonc(int);
int main()
{
   int n,i=0,c;
   printf("Enter no.-\n");
   scanf("%d",&n);
   printf("Fibonc Series:\n");

   for(c=1;c<=n;c++)
   {
       printf("%d \n", Fibonc(i));
       i++;

   }
   return 0;
}
int Fibonc(int n)
{
    if(n==0)
    return 0;
    else if(n==1)
    return 1;
    else 
    return(Fibonc(n-1)+Fibonc(n-2));

