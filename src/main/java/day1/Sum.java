/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2019 All Rights Reserved.
 */
package day1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * <p>
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * <p>
 * 所以返回 [0, 1]
 *
 * @author LvHuiKang
 * @version $Id: Sum.java, v 0.1 2019-09-27 17:58 LvHuiKang Exp $$
 */
public class Sum {
    public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalAccessException("no two sum solution");
    }

    public static int[] twoSumPro(int[] nums, int target) throws IllegalAccessException {
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            data.put(target - nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (data.get(target - nums[j]) != null) {
                return new int[]{j, data.get(target - nums[j])};
            }
        }
        throw new IllegalAccessException("no two sum solution");
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum(nums, 26);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        int[] result1 = twoSumPro(nums, 26);
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }
    }
}