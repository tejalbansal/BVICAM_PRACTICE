//input: 5
/*
***************
 *  *
  ** 
  ** 
 *  *
***************
Time complexity O(n^2)
Space Complexity O(1)
*/
package pattern1_2;

import java.util.Scanner;

public class Pattern1_2 {
    public static void pattern(int i,int n)
    {
        
        
            for(int j=0;j<5;j++)
            {
                if(i==0 || i==n-1 || i==j || (i+j)==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
            //System.out.println();
            
        
    }
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n;
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
               pattern(i,n);
               pattern(i,n);
               pattern(i,n);
           System.out.println();
       }
          
    }
    
}
