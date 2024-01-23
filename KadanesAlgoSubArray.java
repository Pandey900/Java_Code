package Arrays;

import java.util.Scanner;

public class KadanesAlgoSubArray {
    public static int kadanes_SubArray_Sum(int n[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<n.length;i++){
            if (sum<0){
                sum=0;
            }
            sum+=n[i];
            largest=Math.max(sum,largest);
            if (largest<sum){
                largest=sum;
            }
        }
        System.out.println("Largest Sub Array is:"+largest);
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
        kadanes_SubArray_Sum(n);
    }
}
