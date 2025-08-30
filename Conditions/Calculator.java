import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int num = s.nextInt();
        System.out.println("Enter The Operator:");
        String operator = s.next();
        System.out.println("Enter The Second Number:");
        int num2 = s.nextInt();
        int result = 0;
        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
            System.out.println("Enter The Valid Operator!");
        }
        else if(operator.equals("+")){
          result = num + num2;
           System.out.println("The Result "+ num + " "+ operator + " "+ num2 + " = "+ result);
        }
        else if(operator.equals("-")){
            result = num - num2;
             System.out.println("The Result "+ num + " "+ operator + " "+ num2 + " = "+ result);
        }
         else if(operator.equals("*")){
            result = num * num2;
             System.out.println("The Result "+ num + " "+ operator + " "+ num2 + " = "+ result);
        }
        else{
            result = num /num2;
             System.out.println("The Result "+ num + " "+ operator + " "+ num2 + " = "+ result);
        }
       
    }
}