import java.util.Scanner;

public class factorial {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scanner.nextInt();
        long factorial=1;
        for (int i=1;i<=a;i++){
            factorial *=i;
        }
       System.out.println(factorial);
    }
}
