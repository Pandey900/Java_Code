package Arrays;

import java.util.Scanner;

public class Exercise_Array_Ques_1 {
    public static boolean twiceApperance(int n[]){
        for (int i=0;i< n.length-1;i++) {
            for (int j=i+1;j< n.length;j++){
                if (n[i]==n[j]){
                    return true;
                }
            }
        }
        return false;
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
        System.out.println(twiceApperance(n));
    }
}
