package Arrays;

import java.util.Scanner;

public class LargestNumber {
    public static int largestNumber(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<n.length;i++){
            if (n[i]>largest){
                largest=n[i];
            }
            if (n[i]<smallest){
                smallest=n[i];
            }
        }
        System.out.println("Smallest value is:"+smallest);
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

        System.out.println("Largest value is:"+largestNumber(n));
    }
}
