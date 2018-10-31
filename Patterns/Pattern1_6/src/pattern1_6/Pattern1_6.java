/*
4
12344321
123**321
12****21
1******1
Time complexity: O(n^2)
Space complexity:O(1)
 */
package pattern1_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Pattern1_6 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
        // TODO code application logic here
        int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {     
           for(int j=0;j<n;j++)
           {
                if(j+i<=n-1)
                 System.out.print(j+1);
                 else
                  System.out.print("*");
                
           }
           for(int j=0;j<n;j++)
           {
                if(j>=i)
                 System.out.print(n-j);
                 else
                  System.out.print("*");
                
           }
           System.out.print("\n");
       }
    }
    
}
