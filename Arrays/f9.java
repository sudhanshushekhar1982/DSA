// trapping rainwater problem

import java.util.*;
public class f9 {
    public static int trappedRainwater(int height[]) {
        //left max boundary
        int leftMax [] = new int[height.length];
        leftMax[0] = height[0];
        for(int i =1;i<height.length-1;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i =height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop
        int trappedWter[] = new int[height.length];
        int water [] = new int[height.length];

        for(int i = 0;i<height.length-1;i++) {
            trappedWter[i] = Math.min(leftMax[i], rightMax[i]);
            water[i] = trappedWter[i] - height[i];
            if(water[i] <0){
                water[i] = 0;
            } 
        }
        int waterCount = 0;
        for(int i =0;i<water.length-1;i++) {
            waterCount += water[i];
        }
        return waterCount;
       
    }
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        int trapped = trappedRainwater(height);
       System.out.println("total rainwater trapped is:"+trapped);
    }
}
