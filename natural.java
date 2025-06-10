import java.util.Scanner;

public class natural {
    public static void main(String[] args){
        int i =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=scanner.nextInt();
        while (i<=a){
            System.out.println(i);
            i++;
        }
    }
}
