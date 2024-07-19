import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find odd or even:");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The given number is Even.");
        }else{
            System.out.println("The given number is Odd.");
        }


    }
}