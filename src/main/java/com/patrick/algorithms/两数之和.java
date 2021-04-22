package com.patrick.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author patrick
 * @date 2021/3/2 1:33 下午
 * @Des 两数之和
 * 最簡單的事是堅持，最難的事還是堅持
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = twoSum(nums, 13);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            //table 中是否存在
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - a), i};
            }
            //不存在就把当前的数字加入进去、然后进行下一个数字判读
            hashtable.put(a, i);
        }
        return new int[0];
    }
}
