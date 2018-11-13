/*
 5
*****
 *****
  *****
   *****
    *****
Time Complexity:O(n^2)
Space complexity:O(1)
 */
package practice_set2_4;

import java.util.Scanner;


public class Practice_set2_4 {
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
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
                System.out.print("*");
            
            System.out.println();
            
        }
     }
    
}
