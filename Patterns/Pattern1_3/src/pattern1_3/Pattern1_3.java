/*
 4
*      *
 *    * 
* *  * *
 * ** * 
* *  * *
 *    * 
*      *
Time complexity: O(n^2)
Space Complexity:O(1)
 */
package pattern1_3;

import java.util.Scanner;

public class Pattern1_3 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n;j++)
            {
                if(j<n)
                {
                    if(i<=2*n-j-2 && i>=j && (i+j)%2==0 )
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                else if(j>=n && j<2*n)
                {
                    if((i+j)%2!=0 && i>=2*n-j-1 && i<j )
                       System.out.print("*");
                    else
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
    
}
