import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1=input.nextDouble();
        System.out.print("Enter second number:");
        double num2=input.nextDouble();
        System.out.println("Choose an Operator to perform (+,-,*,/):");
        char operator = input.next().charAt(0);

        double result=0;

        if(operator=='+'){
            result=num1+num2;
        }else if(operator=='-'){
            result=num1-num2;
        }else if(operator=='*'){
            result=num1*num2;
        }else if(operator=='/'){
            result=num1/num2;
        }else{
            System.out.println("Invalid operator");
        }
        System.out.println("The result is "+result);
        input.close();
    }
}
