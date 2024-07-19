import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=input.nextInt();

        int n1=0,n2=1,n3;
        System.out.println("Fibonacci Series:");
        
        System.out.println(n1);
        System.out.println(n2);

        for(int i=3;i<=n;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }
        input.close();
    }
    
}
