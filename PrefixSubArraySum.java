package Arrays;

import java.util.Scanner;

public class PrefixSubArraySum {
    public static int prifixSubArraySum(int n[]){
        int largest=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for (int i=0;i<n.length;i++){
            for (int j=i;j< n.length;j++){
                sum=i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                if (largest<sum){
                    largest=sum;
                }
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

        prifixSubArraySum(n);
    }
}
