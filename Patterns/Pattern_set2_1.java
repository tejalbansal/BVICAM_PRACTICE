/*
4
   ****
  ****
 ****
****
Time Complexity: O(n^2)
Space Complexity:O(1)
 */
package pattern_set2_1;

import java.util.Scanner;



public class Pattern_set2_1 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-2-i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
