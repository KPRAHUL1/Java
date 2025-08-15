
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLength {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("./input.txt"));
        int num = s.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = s.nextInt();
        }
        int count=1 ;
       for (int i = 0; i < num - 1; i++) {
           if(nums[i]+1 == nums[i+1]){
            count++;
           }
           
       }
       System.out.println(count);
        // System.out.println(num + "<--total && values -->"+Arrays.toString(nums));
           }
}
