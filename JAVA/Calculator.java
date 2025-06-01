import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculator 
        System.out.println("Enter to numbers to perform arithmetic operation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter '+' for addition\nEnter '-' for subtraction\nEnter '*' for multiplication\nEnter '/' for divison");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+' -> System.out.printf("%d + %d = %d",a,b,a+b);
            case '-' -> System.out.printf("%d - %d = %d",a,b,a-b);
            case '*' -> System.out.printf("%d * %d = %d",a,b,a*b);
            case '/' -> System.out.printf("%d / %d = %d",a,b,b/a);
            default -> System.out.println("Wrong integers or operators");
        }
        sc.close();
    }
}