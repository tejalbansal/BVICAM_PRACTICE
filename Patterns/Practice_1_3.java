/*
5
* * * * * 
* *   * * 
*   *   * 
* *   * * 
* * * * * 
Time complexity: O(n^2)
Space complexity:O(1)
 */
package practice_1_3;

import java.util.Scanner;

public class Practice_1_3 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==j || (i+j)==n-1 || i==0 || i==n-1 || j==0 || j==n-1)
                   System.out.print("* ");
               else
                   System.out.print("  ");
           }
           System.out.println();
       }
    }
    
}
