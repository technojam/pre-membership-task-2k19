import java.util.*;
class EgytFrac{
   static void Egypt(int num,int den){
    if(num==0 || den==0){
        System.out.println("Either num or den is zero");
         return;}
    if(den%num == 0){
        System.out.println("1/"+(den/num));
        return;
    }
    if(num % den ==0){
        System.out.println("Not a fraction");
        return;
    }
    if(num>den){
        System.out.print((num/den)+ "+");
        Egypt(num%den, den);
        return;
    }
    int a=den/num +1;
    System.out.print("1/"+a+"+ ");
    Egypt(num*a-den, den*a);

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numerator");
    int n=sc.nextInt();
    System.out.println("Enter the denominator");
    int d=sc.nextInt();
    System.out.print(n+"/"+d+" = ");
    Egypt(n, d);
}
}
