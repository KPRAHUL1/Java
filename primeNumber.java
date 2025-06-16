import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = scanner.nextInt();
        if (num % 1==0){
            System.out.println("It's a Prime Number");
        }
        else {
            System.out.println("It's Not a Prime Number");
        }
    }
}
