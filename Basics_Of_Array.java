package Arrays;

import java.util.Scanner;

public class Basics_Of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("Physics:"+marks[0]);
        System.out.println("Chemistry:"+marks[1]);
        System.out.println("Maths:"+marks[2]);
        marks[0]=98;
        System.out.println("Updated marks of Physics:"+marks[0]);
    }
}
