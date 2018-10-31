//input:5
/*
** ***
* *
*****
  * *
*** *
time complexity O(n^2)
space complexity O(1)
*/


package pattern1_1;

import java.util.Scanner;

public class Pattern1_1 {
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
           for(int j=0;j<n;j++)
           {
               if((i<n/2 && j==0)||(i>n/2 && j==n-1)||(j>n/2 && i==0)|| (j<n/2 && i==n-1)|| j==n/2 || i==n/2)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }
    
}
