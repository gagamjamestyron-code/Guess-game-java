import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num = rand.nextInt(100) + 1;
        System.out.print("Guess a number between 1 and 100: ");
        int guess = sc.nextInt();
        while (guess != num) {
            if (guess > num) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.println("Guess again ");
            guess = sc.nextInt();
        }
        System.out.println("You got it right!");
        sc.close();
    }
}