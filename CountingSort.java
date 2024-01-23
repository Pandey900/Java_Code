package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void counting_Sort(int n[]){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            largest=Math.max(largest,n[i]);
        }
        int count[]=new int[largest+1];
        for (int i=0;i<n.length;i++){
            count[n[i]]++;
        }
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                n[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        counting_Sort(n);
        printArr(n);
    }
}
