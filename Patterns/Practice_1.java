/*
5
0
02
036
04812
05101520
Time complexity: O(n^2)
Space complexity: O(1)
 */
package practice_1;

import java.util.Scanner;

public class Practice_1 {
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
                if(i>=j)
                {
                    System.out.print((i+1)*j);
                }
                
            }
         System.out.println();   
        }
    }
    
}
