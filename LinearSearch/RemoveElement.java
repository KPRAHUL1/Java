package LinearSearch;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int val = 2;
        int numberCount = 0;
        String[] stringArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringArray[i] = String.valueOf(nums[i]);
            if (val == nums[i]){
                stringArray[i] = "_";
            }
            if (!stringArray[i].equals("_")) {
                numberCount++;
            }
        }
        System.out.println(Arrays.toString(stringArray));
        System.out.println(numberCount);
//        int numberCount = 0;
//        String[] stringArray = new String[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            stringArray[i] = String.valueOf(nums[i]);
//            if (nums[i] != val) {
//                nums[numberCount] = nums[i];
//                numberCount++;
//            }
//        }
//        return numberCount;
    }
}
