import java.util.*;
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
