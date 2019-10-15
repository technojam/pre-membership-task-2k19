import java.lang.Math;
import java.util.Scanner;
class Fraction {
  static int[] a= new int[10];
  static int b = 0;

  public static int gratest_common_divissor(int c, int d) {
    int e = c%d;
    while(e > 0) {
      c = d;
      d = e;
      e = c % d;
    }
    return d;
  }

  public static void unitDenInit() {
    for(int i=0; i<10; i++) {
      a[i] = 0;
    }
  }

  public static void greedyEgyptianFraction(int num, int den) {
    if(num == 1) {
b++; 
      a[b] = den;
    }
    else {
      int unitDen = (int)Math.ceil(den/(num*1.0));
      b++;
      a[b] = unitDen;
      int gcdOfNumbers = gratest_common_divissor((num*unitDen) - den, den*unitDen);
      greedyEgyptianFraction(((num*unitDen) - den)/gcdOfNumbers, (den*unitDen)/gcdOfNumbers);
    }
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    unitDenInit();
System.out.println("Enter the numerator");
int nr=sc.nextInt();
System.out.println("Enter the denomenator");
int dr=sc.nextInt();
 System.out.print("Egyptian Fraction Representation of "
                + nr + "/" + dr + " is\n "); 

    greedyEgyptianFraction(nr, dr);

    for(int i=1; i<=b; i++) {
      System.out.println("1/"+a[i]);
    }
  }
}

