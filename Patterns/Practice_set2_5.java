/*
 5
*    
**   
* *  
*  * 
*****
 */
package practice_set2_5;

import java.util.Scanner;

public class Practice_set2_5 {
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
                if(i==j || i==n-1 || j==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
