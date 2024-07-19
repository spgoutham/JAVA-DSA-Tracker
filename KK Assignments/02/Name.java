import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your nice name:");
        String name=input.nextLine();
        System.out.println("Hearlty Greetings! "+name+"!!");
        input.close();

    }
    
}
