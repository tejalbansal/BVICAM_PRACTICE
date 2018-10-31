/*
5
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
Time complexity: O(n^2)
Space complexity: O(1)
 */
package pattern1_10;

import java.util.Scanner;

public class Pattern1_10 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
        int n=sc.nextInt();
        int sum=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {
                   sum=i+1;
                   System.out.print(sum+" ");
                }
                else
                {
                    sum+=n-j;
                    System.out.print(sum+" ");
                }
                    
                }
            System.out.println();
            }
        }
    }
    

