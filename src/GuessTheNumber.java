import java.util.Random;
import java.util.Scanner;

class game{
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);
    public int r;
    public int noOfGuesses = 0;
    public int input;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        noOfGuesses = noOfGuesses;
    }
    game(){
        r = rn.nextInt(100);
    }
    int takeUserInput(){
        System.out.println("Guess the number:");
        input = sc.nextInt();
        return input;
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(input == r){
            System.out.printf("Yes you guessed it right, the number was %d\n", r);
            System.out.printf("You guessed it in %d number of guesses.", noOfGuesses);
            return true;
        }
        else if(input<r){
            System.out.println("Too Small...");
        }
        else if(input>r){
            System.out.println("Too Large...");
        }
        return false;
    }

}
public class GuessTheNumber {
    public static void main(String[] args) {
        game user = new game();
        boolean b = false;
        while (!b){
            user.takeUserInput();
            b = user.isCorrectNumber();
        }
    }

}
