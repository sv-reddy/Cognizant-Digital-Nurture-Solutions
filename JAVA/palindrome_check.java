
import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Palicdrome Checker
        System.out.println("Enter alphabumeric characters to check for palindrome: ");
        String pal = sc.next();
        String cleaned_pal = pal.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder pal1 = new StringBuilder();
        for (char p : cleaned_pal.toCharArray()) {
            pal1.append(p);
        }
        String rev_pal = pal1.reverse().toString();
        if(cleaned_pal.equals(rev_pal)) System.out.println("The text is palidrome");
        else System.out.println("The text isn't a palindrome");
        sc.close();
    }
}
