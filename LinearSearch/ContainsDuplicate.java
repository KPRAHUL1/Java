package LinearSearch;
import java.util.Arrays;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                System.out.println(true);
            }
        }
        System.out.println(false);
        System.out.println(Arrays.toString(nums));

    }

}
