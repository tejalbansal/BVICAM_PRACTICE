/*
 5
*****
 *   *
  *   *
   *   *
    *****
Time complexity: O(n^2)
Space complexity:O(1)
 */
package practice_set2_3;

import java.util.Scanner;

public class Practice_set2_3 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<=i-1;j++)
             System.out.print(" ");
         for(int j=0;j<n;j++)
         {
             if(j==0 || i==0 || j==n-1 || i==n-1)
                 System.out.print("*");
             else
                 System.out.print(" ");
         }
         System.out.println();
     }
    
       
    }
    
}
