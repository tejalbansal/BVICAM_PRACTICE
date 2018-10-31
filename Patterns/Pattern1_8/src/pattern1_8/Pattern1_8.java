/*
4
1
123
12345
1234567
123456789
1234567
12345
123
1
Time complexity:O(n^2)
Space complexity:O(1)
 */
package pattern1_8;

import java.util.Scanner;

public class Pattern1_8 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
        int count;
        for(int i=n-1;i>=0;i--)
        {   count=1;
            for(int j=2*i+1;j>0;j--)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
               
            }
        }
    }
    

