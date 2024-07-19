import java.util.Scanner;
public class Ptr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal:");
        Float prin=input.nextFloat();
        System.out.print("Enter rate of interest:");
        Float rate=input.nextFloat();
        System.out.print("Enter time in years:");
        Float year=input.nextFloat();
        Float result=(prin*rate*year)/100;
        System.out.print("The simple interest is "+result);

    }
    
}
