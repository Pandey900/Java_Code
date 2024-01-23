package Arrays;

import java.util.*;
import java.util.Scanner;

public class InsertionSort {
    public static void insertion_Sort(int n[]){
        for (int i=0;i<n.length;i++){
            int curr=n[i];
            int prev=i-1;
            while (prev>=0 && n[prev]>curr){
                n[prev+1]=n[prev];
                prev--;
            }
            n[prev+1]=curr;
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
        insertion_Sort(n);
        printArr(n);
        printArr(n);
    }
}
