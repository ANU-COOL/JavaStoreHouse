import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: \n 1 for Rock\n 2 for Paper\n 3 for scissors ");
        Random rn = new Random();
        int b, res=0;
        int comp = rn.nextInt(90);
        if(comp<=30){
            b = 1;
        }
        else if(comp>30 && comp<=60){
            b = 2;
        }else{
            b = 3;
        }
        for(int i = 1; i<=3; i++){
            System.out.printf("Enter your choice for round %d\n", i);
            int a = sc.nextInt();
            if(a==b){
                System.out.printf("Round %d draw\n", i);
                System.out.println("Enter your choice for another round as previous one was draw");
                a = sc.nextInt();
            }
            else if(a==1 && b==2){
                System.out.printf("Lost round %d\n", i);
            }
            else if(a==1 && b==3){
                res++;
                System.out.printf("Won round %d\n", i);
            }
            else if(a==2 && b==1){
                res++;
                System.out.printf("Won round %d\n", i);
            }
            else if(a==2 && b==3){
                System.out.printf("Lost round %d \n", i);
            }
            else if(a==3 && b==1){
                System.out.printf("Lost round %d \n", i);
            }
            else if(a==3 && b==2){
                res++;
                System.out.printf("Won round %d\n", i);
            }
        }
        if(res>=2){
            System.out.println("Congratulations you won the game!");
        }
        else{
            System.out.println("Sorry, you lost the game.");
        }

    }
}
