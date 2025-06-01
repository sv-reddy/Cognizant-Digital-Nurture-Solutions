import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calculate Factorial 
        System.out.println("Enter a number to calculate it's factorial:");
        int fact = 1, n;
        n = sc.nextInt();
        for(int i = n; i >= 1; i-- ){
            fact *= i;
        }
        System.out.println(fact);
        sc.close();   
    }
}
