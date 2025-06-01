import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class number_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Number Guessing Game
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 100); 
        int guess;
        do{
            guess = sc.nextInt();
            if(guess==randomNumber) break;
            if((guess-randomNumber)>= 20) System.out.println("guess is too high than random");
            else if((guess-randomNumber)<= -20) System.out.println("guess is too low than random");
            if((guess-randomNumber) < 10) System.out.println("Increase guess number");
            else if((guess-randomNumber) > 10) System.out.println("Reduce guess number");
        }while(guess!=randomNumber);
        System.out.println("The guess is correct");
        sc.close();
    }
}
