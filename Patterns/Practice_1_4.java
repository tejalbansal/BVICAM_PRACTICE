/*
 4
1     1
 2   2 
  3 3  
   4   
  3 3  
 2   2 
1     1
Time complexity: O(n^2)
Space Complexity:O(1)
 */
package practice_1_4;

import java.util.Scanner;

public class Practice_1_4 {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
       int n=sc.nextInt();
       int c=1;
       for(int i=0;i<2*n-1;i++)
       {
           for(int j=0;j<2*n-1;j++)
           {
               if(i==j || i+j==2*n-2)
                   System.out.print(String.valueOf(c));
               else
                   System.out.print(" ");
           }
           if(i>=n-1)
               c--;
           else
               c++;
           System.out.println();
       }
    }
    
}
