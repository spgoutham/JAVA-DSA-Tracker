import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to Check:");
        String word = input.nextLine();
        String Result = "";
        for(int i=word.length()-1;i>=0;i--){
            Result=Result+word.charAt(i);
            
        }
        if(word.equals(Result)){
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not an palindrome");
        }
    }
}
