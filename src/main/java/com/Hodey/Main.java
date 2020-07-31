package com.Hodey;

import com.Hodey.leetcode.dp.Class_300;

public class Main {

    public static void main(String[] args) {
        Class_300 class_300 = new Class_300();

        int[] nums = {10,9,2,5,3,7,101,18};
        int length = class_300.lengthOfLIS(nums);
        System.out.println(length);
    }
}
