
import java.util.*;
public class Solution {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length; 

        Map<Integer, Integer> map = new HashMap<>();

        int prefix = 0;

        int maxLen = 0;

        for(int i=0; i<n; i++) {
            prefix += arr[i];

            if(prefix == k) {
                maxLen = i+1;
            } else if(map.containsKey(prefix - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefix - k));
            }

            map.putIfAbsent(prefix, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 5;

        int maxLen = longestSubarray(arr, k);

        System.out.println(maxLen);
    }
}
