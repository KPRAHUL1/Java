import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintNegative{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner s = new Scanner(new File("./negative.txt"));
       int num = s.nextInt();
       for(int n=num ; n<=0;n++){
           System.out.println(n);
       }
    }
}