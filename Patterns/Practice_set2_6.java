/*
6
      *     
     * *    
    *   *   
   *     *  
  *       * 
 ***********
Time complexity:O(n^2)
Space Complexity:O(1)
 */
package practice_set2_6;

import java.util.Scanner;

public class Practice_set2_6 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<2*n;j++)
           {
               if((j==n-i || j==n+i) || (i==n-1 && j>=n-i && j<=n+i ))
                   System.out.print("*");
              
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }
    
}
