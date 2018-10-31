/*
4
1 
4 9 
16 25 36 
49 64 81 100 
Time complexity:O(n^2)
Space Complexity:O(1)
 */
package pattern1_9;

import java.util.Scanner;

public class Pattern1_9 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<=i;j++)
            {count++;
                System.out.print(count*count+" ");
                
            }
            System.out.println();
        }
            }
        
 }
