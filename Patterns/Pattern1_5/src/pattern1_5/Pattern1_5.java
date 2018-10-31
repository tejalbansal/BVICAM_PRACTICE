/*input -3
*
***
*****
time complexity: O(n^2)
space complexity: O(1)
*/
package pattern1_5;

import java.util.Scanner;

public class Pattern1_5 {
    private static Scanner sc;
    static
    {
        sc=new Scanner(System.in);
    }
    public static void main(String[] args) {
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<2*i+1;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}
