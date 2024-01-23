package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InbuiltArrays {
    public static void printArr(Integer n[]){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size=sc.nextInt();
        Integer n[]=new Integer[size];
        System.out.println("Enter the elements of an Array:");
        for (int i=0;i<size;i++){
            n[i]= sc.nextInt();
        }
//        Arrays.sort(n,0,3);
//        Arrays.sort(n);

        Arrays.sort(n,Collections.reverseOrder());
        printArr(n);
    }
}
