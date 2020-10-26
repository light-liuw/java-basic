package cn.liuw.leet.solution10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * 1365. 有多少小于当前数字的数字
 * <p>
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * <p>
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * <p>
 * 以数组形式返回答案。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [8,1,2,2,3]
 * 输出：[4,0,1,1,3]
 * 解释：
 * 对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
 * 对于 nums[1]=1 不存在比它小的数字。
 * 对于 nums[2]=2 存在一个比它小的数字：（1）。
 * 对于 nums[3]=2 存在一个比它小的数字：（1）。
 * 对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。
 *
 * @author liuw
 * @date 2020/10/26
 */
public class Test1026 {

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));

        int[] numsV2 = {8, 1, 2, 2, 3};
        int[] resultV2 = smallerNumbersThanCurrentV2(numsV2);
        System.out.println(Arrays.toString(resultV2));

        int[] numsV3 = {8, 1, 2, 2, 3};
        int[] resultV3 = smallerNumbersThanCurrentV3(numsV3);
        System.out.println(Arrays.toString(resultV3));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    public static int[] smallerNumbersThanCurrentV2(int[] nums) {

        int n = nums.length;

        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = nums[i];
            data[i][1] = i;
        }

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[] ret = new int[n];

        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (prev == -1 || data[i][0] != data[i - 1][0]) {
                prev = i;
            }
            ret[data[i][1]] = prev;
        }

        return ret;
    }

    public static int[] smallerNumbersThanCurrentV3(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>(nums.length);

        int[] numCopy = Arrays.copyOf(nums, nums.length);

        Arrays.sort(numCopy);

        for (int i = numCopy.length - 1; i >= 0; i--) {
            hashMap.put(numCopy[i], i);
        }


        int[] ret = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ret[i] = hashMap.get(nums[i]);
        }

        return ret;
    }
}
