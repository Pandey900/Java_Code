package Arrays;

import java.util.Scanner;

public class LinearSearchForStrings {
    public static int stringLinearSearch(String menu[],String key){
        for (int i=0;i<menu.length;i++){
            if (menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        String menu[]=new String[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i<size;i++){
            menu[i]= sc.next();
        }
        System.out.println("Enter the string you want search for:");
        String key=sc.next();
        int index=stringLinearSearch(menu,key);
        if (index==-1){
            System.out.println("String not found");
        }else {
            System.out.println("String found at index:"+index);
        }
    }
}
