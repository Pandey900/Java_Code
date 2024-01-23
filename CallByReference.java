package Arrays;

import java.util.Scanner;

public class CallByReference {
    public static void reference(int marks[]){
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int marks[]=new int[size];
        for (int i=0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("Updated marks:");
        reference(marks);
//        System.out.println("Marks:");
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
    }
}
