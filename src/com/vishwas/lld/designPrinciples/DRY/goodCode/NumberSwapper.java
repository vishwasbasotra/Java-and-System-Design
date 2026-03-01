package com.vishwas.lld.designPrinciples.DRY.goodCode;

public class NumberSwapper {
    // DRY approach - creating a reusable swap method
    public static void swap(int[] nums){
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {5, 10};

        System.out.println("Before swap: " + nums[0] + ", " + nums[1]);
        swap(nums);
        System.out.println("After swap: " + nums[0] + ", " + nums[1]);

        System.out.println("-------------------------------------------");
        // Later in the code, need to swap different numbers
        nums = new int[]{2, 155};

        System.out.println("Before swap: " + nums[0] + ", " + nums[1]);
        swap(nums);
        System.out.println("After swap: " + nums[0] + ", " + nums[1]);
    }
}
