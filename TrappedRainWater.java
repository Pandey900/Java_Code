package Arrays;

import java.util.Scanner;

public class TrappedRainWater {
    public static int trapped_Rain_Water(int h[]){
        int n=h.length;
//        Calculate left max boundary-array
        int left_max[]=new int[n];
        left_max[0]=h[0];
        for (int i=1;i<n;i++){
            left_max[i]=Math.max(h[i],left_max[i-1]);
        }
//        Calculate right max boundary-array
        int right_max[]=new int[n];
        right_max[n-1]=h[n-1];
        for (int i=n-2;i>=0;i--){
            right_max[i]=Math.max(h[i],right_max[i+1]);
        }
//        Loop
        int trappedWater=0;
        for (int i=0;i<n;i++){
//            WaterLevel=min(left max boundary,right max boundary)
            int waterLevel=Math.min(left_max[i],right_max[i]);
//            TrapperWater=WaterLevel-h[i]
            trappedWater+=waterLevel-h[i];
        }
        System.out.println("Maximum trapped water is:"+trappedWater);
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int size= sc.nextInt();
        int h[]=new int[size];
        System.out.println("Enter the elements of Array:");
        for (int i=0;i<size;i++){
            h[i]= sc.nextInt();
        }

        trapped_Rain_Water(h);
    }
}
