
package k_largest;

import java.util.Scanner;

public class K_largest {
    private static Scanner sc;
    public static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
            return arr;
    }
   static
   {
       sc=new Scanner(System.in);
   }
    public static void main(String[] args) {
        int n,k;
        int[] arr;
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter arr["+i+"]:");
            arr[i]=sc.nextInt();
            
        }
        arr=sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
        k=sc.nextInt();
        if(k<=n)
        {
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
        }
    }
    
}
