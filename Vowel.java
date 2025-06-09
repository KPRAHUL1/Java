import java.util.Scanner;

public class Vowel {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Vowel words:");
        char Word = scanner.next().charAt(0);
        switch (Word){
            case 'a':
                System.out.println("it's a vowel word");
                break;
            case 'e':
                System.out.println("it's a vowel word");
                break;
            case 'i':
                System.out.println("it's a vowel word");
                break;
            case 'o':
                System.out.println("it's a vowel word");
                break;
            case 'u':
                System.out.println("it's a vowel word");
                break;
            default:
                System.out.println("it's a Consonant word");
        }
    }
}
