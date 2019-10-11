import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        int k=1;
        int a=
        int m1[][]= new int[n][n];
        String mat[][]=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j <(n); j++) {
                if(!(i==j) && j<i)
                {
                    mat[i][j]="**";
                }
                if(j>=i &&j<=4)
                {
                   mat[i][j]=Integer.toString(k*10);
                    k++;
                }
               
            } 
            
        }
        int p=1;
        for (int i = n-1; i>=0; i--) {
            for (int j = 0; j < p; j++) {
                m1[i][j]=(k*10);
                k++;
                
            }
            p++;
        }
      
      
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j]);                
            }
            System.out.println();
        }

        for(int i=0 ;i<n;i++){
            for (int j = 0; j < n; j++) {
                    System.out.print(m1[i][j]);                
            }
            System.out.println();
        }
    }
    }   

   


    
