
import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        // Multiplication Table:
        System.out.println("Enter a number to print it's multiplication table :");
        int Mul = sc.nextInt();
        for(int i=1; i<= 10; i++){
            System.out.println(Mul+" * "+i+" = "+i*Mul);
        }
        sc.close();
    }
}
