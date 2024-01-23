package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int n[],int key){
        int s=0;
        int e=n.length-1;
        while (s<=e){
            int mid=(s+e)/2;
            if (n[mid]==key){
                return mid;
            }
            if (n[mid]>key){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return -1;
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
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        System.out.println("Element found at index:"+binarySearch(n,key));
    }
}
