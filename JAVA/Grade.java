import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Grade Calculator
        System.out.println("Wanna calculate your grade?\nEnter marks out of 100");
        int d = sc.nextInt();
        while( d > 100){
            System.out.println("Wrong input! Score should be equal to less than 100");
        }
        if(d>89 && d<=100) System.out.println("A");
        else if(d>79 && d<90) System.out.println("B");
        else if(d>69 && d<=80) System.out.println("C");
        else if(d>59 && d<=70) System.out.println("D");
        else System.out.println("F");
        sc.close();
    }
}
