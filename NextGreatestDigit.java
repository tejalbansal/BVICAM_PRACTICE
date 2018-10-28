
package nextgreatestdigit;

import java.util.Scanner;

public class NextGreatestDigit {
private static Scanner sc;
static
{
    sc=new Scanner(System.in);
}
    public static void main(String[] args) {
     int[] digit;
     int num;
     int n,l=0;
     num=sc.nextInt();
     n=num;
     int rev=0,i=0;
     while(n>0)
     {
         n=n/10;
         i++;
     }
     digit=new int[i];
     n=num;
     while(n>0)
     {
      digit[l]= (n%10);
      n=n/10;
     l++;
     }
     /*for( int k=0;k<i;k++)
     {
         System.out.println(digit[k]+" ");
     }*/
     for( int k=1;k<i;k++)
     {
         if(digit[k]<digit[k-1])
         {
             int temp=digit[k];
             digit[k]=digit[k-1];
             digit[k-1]=temp;
             break;
         }
         
     }
    /* for(int k=0;k<i;k++)
         System.out.print(digit[k]+" ");*/
     rev=0;
     for(int j=i-1;j>=0;j--)
     {
         rev=rev*10+digit[j];
     }
     System.out.println(rev);
    }
    
}
