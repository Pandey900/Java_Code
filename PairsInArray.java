package Arrays;

import java.util.Scanner;

public class PairsInArray {
    public static void pairs(int n[]){
        int tp=0;
        for (int i=0;i<n.length;i++){
            int curr=n[i];
            for (int j=i+1;j<n.length;j++){
                System.out.print("("+n[i]+","+n[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are:"+tp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
        System.out.println("Array Pairs are:");
        pairs(n);
    }
}
