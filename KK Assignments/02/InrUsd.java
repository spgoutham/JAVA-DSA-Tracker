import java.util.Scanner;
public class InrUsd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Amount in INR:");
        double inr=input.nextDouble();
        double dollar=0.012;
        double result=(inr*dollar);
        System.out.println("The INR in USD is "+result);
    }
}
