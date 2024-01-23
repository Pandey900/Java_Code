package Arrays;
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int marks[],int key){
        for (int i=0;i<marks.length;i++){
            if (marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int key= sc.nextInt();
        System.out.println("Element found at index:"+linearSearch(marks,key));
    }
}
