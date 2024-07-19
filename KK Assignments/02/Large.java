import java.util.Scanner;
public class Large{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number 1:");
        double num1=input.nextDouble();
        System.out.print("Enter number two:");
        double num2=input.nextDouble();
        if(num1>num2){
            System.out.println(+num1+" is Larger");
        }else{
            System.out.println(+num2+" is Larger");
        }
    }
}
