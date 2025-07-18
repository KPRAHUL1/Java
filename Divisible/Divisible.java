
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class Divisible{
    public static void main(String[] args)throws FileNotFoundException  {
        Scanner s = new Scanner( new File("./input.txt"));
        int num = s.nextInt();
        for (int i = 1; i < num; i++) {
            if(i%5==0 ||i%7==0){
                continue;
            }
            System.err.println(i);
        }
    }
}