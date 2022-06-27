package day6;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number ");
        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<10;i++)
            sum+=arr[i];
        System.out.println("sum is "+sum);
        double avg=0,d;
            d=sum;
         avg =  d/10;
         System.out.println("average is "+avg);
         int sm=arr[0];
         for(int i=1;i<10;i++)
         {
             if(arr[i]<sm)
                 sm=arr[i];
         }
         System.out.println("Smaller is "+sm);
         int lg = arr[0];
         for(int i=1;i<10;i++)
             if(arr[i]>lg)
                 lg = arr[i];
         System.out.println("larger is "+lg);

         Arrays.sort(arr);
         System.out.println("after sorting array is ");
         for(int i=0;i<10;i++)
             System.out.print(arr[i] + " ");














    }
}
