import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public  class BinaryNumber{
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("./input.txt"));
        int num = s.nextInt();
        boolean isBinary = true;

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary ? "Yes" : "No");
       

    }
}