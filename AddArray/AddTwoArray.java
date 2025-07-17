
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddTwoArray{
    public static void main(String[] args)throws FileNotFoundException  {
       Scanner s = new Scanner(new File("./input.txt")); 
       int num = s.nextInt();
    //    System.out.println(num);
       int[] nums1 = new int[num];
       int[] nums2 = new int[num];

        for (int i = 0; i < num; i++) {
            nums1[i] = s.nextInt();   
        }
             for (int i = 0; i < num; i++) {
            nums2[i] = s.nextInt();
        }
        for(int i=0;i<num;i++){
         System.out.println(nums1[i]+=nums2[i]);
        }
        
    }
}