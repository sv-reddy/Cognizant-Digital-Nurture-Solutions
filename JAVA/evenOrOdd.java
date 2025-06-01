import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        // Even or Odd checker 
        Scanner sc = new Scanner(System.in);
        System.out.println("Check a number is even or odd");
        int evenOrOdd = sc.nextInt();
        if(evenOrOdd ==0) System.out.println("The number is neither even nor odd");
        else if(evenOrOdd % 2 == 0) System.out.println("The number is even");
        else System.out.println("The number is odd");
        sc.close();
    }
}
