/*input 3
3
32
321
Time complexity O(n^2)
Space complexity O(1)
*/
package pattern1_4;

import java.util.Scanner;

public class Pattern1_4 {
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
            for(int j=0;j<=i;j++)
            {
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
    
}