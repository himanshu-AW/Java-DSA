import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> ans1d = new ArrayList<>();
                        // System.out.println(nums[i] + ":"+nums[j]+":"+nums[k]);
                        ans1d.add(nums[i]);
                        ans1d.add(nums[j]);
                        ans1d.add(nums[k]);
                        if (!ans.contains(ans1d))
                            ans.add(ans1d);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums={0,1,1};
        int[] nums={0,0,0};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}