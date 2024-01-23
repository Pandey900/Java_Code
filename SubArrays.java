package Arrays;

import java.util.Scanner;

public class SubArrays {
    public static void subArrays(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int ts=0;
        int sum=0;
        for (int i=0;i<n.length;i++){
            for (int j=i;j<n.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    sum+=n[k];
                }
                ts++;
                System.out.println();
            }
            if (sum>largest){
                largest=sum;
            }
            if (sum<smallest){
                smallest=sum;
            }
            System.out.print("Sum of first is:"+sum);
            System.out.println();
        }
        System.out.println("Smallest sum of subArray is:"+smallest);
        System.out.println("Largest sum of the subArray is:"+largest);
        System.out.println("Sum of the subArrays are:"+sum);
        System.out.println("Total subArrays are:"+ts);
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

        System.out.println("SubArrays are:");
        subArrays(n);
    }
}
