package Arrays;

import java.util.Scanner;

public class SubArraysNewApproach {
    public static int subArrays(int n[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<n.length;i++){
            for (int j=i;j< n.length;j++){
                sum=0;
                for (int k=i;k<=j;k++){
                    sum+=n[k];
                }
                System.out.print(sum);
                if (largest<sum){
                    largest=sum;
                }
                System.out.println();
            }
        }
        System.out.println("Maximum sum is:"+largest);
        return largest;
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
        subArrays(n);
    }
}
