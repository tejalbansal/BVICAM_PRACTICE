/*
 7
 *************
  *         * 
   *       *  
    *     *   
     *   *    
      * *     
       *      
Time complexity:O(n^2)
Space complexity:O(1)
 */
package practice_set2_7;

import java.util.Scanner;

public class Practice_set2_7 {
 private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           for(int j=0;j<2*n;j++)
           {
               if((j==i || j==2*n-i) || (i==1 && j>=i && j<2*n))
                   System.out.print("*");
              
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }
    
}
