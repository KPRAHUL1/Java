import java.util.Scanner;
public class pyramid {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int row =0;
        System.out.println("Enter the Number For Pyramid:"+ number);
        for(int i=0; i<=number;i++){
            for(int j=1;j<=i; j++){
               System.out.print(number);
            }
            System.out.println();
        }

    }
}
