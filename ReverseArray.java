package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int n[]){
        int f=0;
        int l=n.length-1;
        while (f<l){
            int temp=n[l];
            n[l]=n[f];
            n[f]=temp;
            f++;
            l--;
        }
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
        reverseArray(n);
        System.out.println("Reversed Array:");
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}
