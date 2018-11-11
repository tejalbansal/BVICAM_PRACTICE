/*
 5
     1    
    2 2   
   3   3  
  4     4 
 5       5
  4     4 
   3   3  
    2 2   
     1    
time complexity:O(n^2)
space complexity:O(1)
 */
package practice_1_2;

import java.util.Scanner;

public class Practice_1_2 {
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
          { if(i<n)
            {
             if(j==(n)-i || j==(n)+i)
             { System.out.print(i+1);
                    
             }
              else
                  System.out.print(" ");
            }
          if(i>=n )
            {
              if(j==i-n+2 || j==2*n-(i-n)-2)
              { System.out.print(2*n-i-1);
              }
            
            else
                  System.out.print(" ");}
          }   
          System.out.println();
      }
    }
    } 


