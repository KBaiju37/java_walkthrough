import java.util.Random;
import java.util.Scanner;

public class guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randobj = new Random();
        
        int r = randobj.nextInt(100) + 1;
        int Count = 0;
        boolean guessed = false;
        
        System.out.println("Guess a number between 1 and 100:");

       
        while (!guessed) {
            int num = scanner.nextInt(); 
            Count += 1; 

            if (r == num) {
                System.out.println("Bingo!! Guessed the number in " + Count + " tries!");
                guessed = true;
                break;
            } else if (r > num) {
                System.out.println("Too low! Guess again:"); 
            } else {
                System.out.println("Too High! Guess again:");
            }
        }
        
    
    }
}